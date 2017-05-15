package com.vuong.image_magic;

import java.io.File;
import java.io.IOException;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.im4java.process.ProcessStarter;

public class TestCase6 {

	private static final String iImageDir = "D:\\ChiUt5Hoi\\";

	public static void main(String[] paramArrayOfString) throws Exception {
		String myPath="C:\\Users\\Hp\\.m2\\repository\\org\\im4java\\im4java\\1.4.0\\im4java-1.4.0.jar";
		File file = new File(myPath);
		System.out.println(file.exists());
		ProcessStarter.setGlobalSearchPath(myPath);
		File source = new File("D:\\ChiUt5Hoi\\1.jpg");
		System.err.println("S " + source.exists());
		getThumbnailFile(source);
	}

	public static File getThumbnailFile(File f) throws IOException, InterruptedException, IM4JavaException {
		File f2 = new File(f.getParentFile(), "1.jpg");
		System.out.println(f2.getAbsolutePath()+"__" + f2.exists());
		f2.deleteOnExit();
		ConvertCmd cmd = new ConvertCmd();
		IMOperation op = new IMOperation();
		op.addImage(f.getAbsolutePath());
		op.thumbnail(200, 200);
		op.addImage(f2.getAbsolutePath());
		System.out.println("IM Thumbnail Param: " + op);
		cmd.run(op);
		return f2;
	}
}
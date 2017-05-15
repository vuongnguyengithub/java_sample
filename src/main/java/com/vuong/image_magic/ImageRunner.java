package com.vuong.image_magic;

import java.io.File;
import java.io.IOException;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;

public class ImageRunner {
	
	public static void main(String ... s) throws IOException, InterruptedException, IM4JavaException {
		ConvertCmd cmd = new ConvertCmd();
		
		String source = "C:\\Users\\Hp\\Desktop\\ChiUt5Hoi\\Backup_of_Backup_of_CV.pdf";
		String target = "C:\\Users\\Hp\\Desktop\\ChiUt5Hoi\\thumbnail\\t1";
		File fileThumbnail = new File(target);
		IMOperation op = new IMOperation();
		op.addImage(source);
		op.thumbnail(100);
		op.addImage(target);
		cmd.run(op);
		
	}
}

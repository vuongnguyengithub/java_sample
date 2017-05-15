package com.vuong.image_magic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.im4java.core.ConvertCmd;
import org.im4java.core.DisplayCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.im4java.test.AbstractTestCase;

public class ImageTest extends AbstractTestCase {
	private static final String iImageDir = "C:\\Users\\Hp\\Desktop\\ChiUt5Hoi\\";
	protected static final String iTmpImage = iImageDir + "tmpImage.miff";

	public static void main(String[] paramArrayOfString) throws IOException, InterruptedException, IM4JavaException {
		ImageTest localTestCase1 = new ImageTest();
		localTestCase1.runTest1();
	}

	public void runTest1() throws IOException, InterruptedException, IM4JavaException {
		File file = new File(iImageDir + "1.jpg");
		getThumbnailFile(file, true);
	}

	public File getThumbnailFile(File f, boolean verbose) throws IOException, InterruptedException, IM4JavaException {
		File f2 = new File(f.getParentFile(), "1_copy.jpg");
		//f2.deleteOnExit();
		//Files.createFile(f2.toPath());
		ConvertCmd cmd = new ConvertCmd();
		IMOperation op = new IMOperation();
		op.addImage(f.getAbsolutePath());
		op.thumbnail(200, 200);
		op.addImage(f2.getAbsolutePath());
		if (verbose) {
			System.out.println("IM Thumbnail Param: " + op);
		}
		cmd.run(op);
		return f2;
	}

	@Override
	public String getDescription() {
		return "simple use of convert";
	}

	@Override
	public void run() throws Exception {
		System.err.println(" 1. Testing convert ...");

		boolean bool = false;
		if ((this.iArgs != null) && (this.iArgs.length > 0)) {
			bool = Boolean.parseBoolean(this.iArgs[0]);
		}

		IMOperation localIMOperation = new IMOperation();
		localIMOperation.addImage();
		if (!(bool)) {
			localIMOperation.addImage();
		}
		localIMOperation.bordercolor("darkgray");
		localIMOperation.border(Integer.valueOf(10), Integer.valueOf(10));
		localIMOperation.appendHorizontally();
		localIMOperation.addImage(new String[] { iTmpImage });

		String[] arrayOfString = { iImageDir + "34.jpg", iImageDir + "FB_IMG_1435391808044.jpg" };

		ConvertCmd localConvertCmd = new ConvertCmd();
		localConvertCmd.createScript(iImageDir + "append.sh", localIMOperation);
		localConvertCmd.run(localIMOperation, (Object[]) arrayOfString);
		DisplayCmd.show(iTmpImage);

	}

}

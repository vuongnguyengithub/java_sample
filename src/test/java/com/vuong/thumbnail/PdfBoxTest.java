package com.vuong.thumbnail;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import org.junit.Test;

public class PdfBoxTest {
	
	@Test
	public void test() throws Exception {
		String pdfFilename = "D:\\ChiUt5Hoi\\1.pdf";
		PDDocument document = PDDocument.load(new File(pdfFilename));
		PDFRenderer pdfRenderer = new PDFRenderer(document);
		for (int page = 0; page < document.getNumberOfPages(); ++page)
		{ 
		    BufferedImage bim = pdfRenderer.renderImageWithDPI(page, 300, ImageType.RGB);

		    // suffix in filename will be used as the file format
		    ImageIOUtil.writeImage(bim, pdfFilename + "-" + (page+1) + ".png", 300);
		}
		document.close();
		
		
	}
	
	
}

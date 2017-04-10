package com.vuong.test.junit.rule;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

public class JUnitTemporaryFolderRule {
	
	@Rule
	public final TemporaryFolder temporaryFolder = new TemporaryFolder();
	
	@Test
	public void test() throws IOException, InterruptedException {
		File file = temporaryFolder.newFile("abc.png");
		System.out.println(file.getAbsolutePath());
		File assets = temporaryFolder.newFolder("assets");
		System.out.println(assets.getAbsolutePath());
		File filez = temporaryFolder.newFile();
		System.out.println(filez.getAbsolutePath());
		
	}
}

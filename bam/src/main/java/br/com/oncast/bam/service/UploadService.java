package br.com.oncast.bam.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class UploadService {

	public static String DEFAULT_PATH = "c:/BAM/";

	public void store(File uploadedFile) {
		try {
			FileUtils.copyFile(uploadedFile, new File(DEFAULT_PATH + uploadedFile.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package br.com.oncast.bam.service;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class UploadServiceTest {

	@Test
	public void shouldStoreUploadedFileOnDisk() {
		// Given
		File uploadedFile = new File(this.getClass().getResource("/teste.pdf").getPath());

		// When
		UploadService uploadService = new UploadService();
		uploadService.store(uploadedFile);

		// Then
		File fileOnDisk = new File(UploadService.DEFAULT_PATH + uploadedFile.getName());
		assertTrue(fileOnDisk.exists());
	}
}

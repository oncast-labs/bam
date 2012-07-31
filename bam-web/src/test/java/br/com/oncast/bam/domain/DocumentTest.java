package br.com.oncast.bam.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DocumentTest {

	@Test
	public void asfar() {
		Document document = new Document();
		document.setName("teste.pdf");
		assertTrue(document.getFile().exists());
	}

}

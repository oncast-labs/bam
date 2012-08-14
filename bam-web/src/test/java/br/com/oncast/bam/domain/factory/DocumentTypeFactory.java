package br.com.oncast.bam.domain.factory;

import br.com.oncast.bam.domain.document.DocumentType;

public class DocumentTypeFactory {

	public static DocumentType getDocumentType() {
		DocumentType documentType = new DocumentType();
		documentType.setName("Document");
		documentType.setShortName("PDF");

		return documentType;
	}

}

package br.com.oncast.bam.domain.document;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import br.com.oncast.bam.service.DocumentService;

@Entity
public class Document {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Transient
	private File file;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getFile() {
		if (file == null) {
			file = new File(DocumentService.DEFAULT_PATH + name);
		}
		return file;
	}
}

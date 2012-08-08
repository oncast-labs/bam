package br.com.oncast.bam.infra;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactory {

	private static EntityManager entityManager;

	static {
		entityManager = Persistence.createEntityManagerFactory("test").createEntityManager();
	}

	public static EntityManager getEntityManager() {
		return entityManager;
	}

}

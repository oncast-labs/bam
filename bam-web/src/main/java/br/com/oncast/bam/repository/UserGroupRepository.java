package br.com.oncast.bam.repository;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.oncast.bam.domain.UserGroup;

@Component
public class UserGroupRepository extends Repository<UserGroup, Long> {

	public UserGroupRepository(EntityManager entityManager) {
		super(entityManager);
	}

}
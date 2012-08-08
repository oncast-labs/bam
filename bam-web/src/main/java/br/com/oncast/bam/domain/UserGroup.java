package br.com.oncast.bam.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.com.oncast.bam.EnabledUsersInGroupException;

@Entity
public class UserGroup {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private boolean enabled = true;

	@ManyToOne(fetch = FetchType.LAZY)
	private User administrator;

	@ManyToMany(fetch = FetchType.LAZY)
	private List<User> members;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public User getAdministrator() {
		return administrator;
	}

	public void setAdministrator(User administrator) {
		this.administrator = administrator;
	}

	public List<User> getMembers() {
		return members;
	}

	public void addMember(User newMember) {
		if (members == null)
			members = new ArrayList<User>();
		members.add(newMember);
	}

	public void disable() throws EnabledUsersInGroupException {
		for (User member : members) {
			if (member.isEnabled())
				throw new EnabledUsersInGroupException();
		}
		enabled = false;
	}
}

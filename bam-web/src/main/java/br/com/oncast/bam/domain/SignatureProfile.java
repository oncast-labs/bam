package br.com.oncast.bam.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.oncast.bam.EnabledUserGroupsException;
import br.com.oncast.bam.EnabledUsersException;

@Entity
public class SignatureProfile {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private boolean enabled;

	private Integer maxSignaturesPerPage;

	private boolean countersignAttached;

	private boolean signatureAttached;

	private boolean timeStampAttached;

	private boolean certificateAttached;

	private boolean stampAttached;

	@OneToMany(mappedBy = "signatureProfile")
	private List<UserGroup> userGroups;

	@OneToMany(mappedBy = "signatureProfile")
	private List<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getMaxSignaturesPerPage() {
		return maxSignaturesPerPage;
	}

	public void setMaxSignaturesPerPage(Integer maxSignaturesPerPage) {
		this.maxSignaturesPerPage = maxSignaturesPerPage;
	}

	public boolean isCountersignAttached() {
		return countersignAttached;
	}

	public void setCountersignAttached(boolean countersignAttached) {
		this.countersignAttached = countersignAttached;
	}

	public boolean isSignatureAttached() {
		return signatureAttached;
	}

	public void setSignatureAttached(boolean signatureAttached) {
		this.signatureAttached = signatureAttached;
	}

	public boolean isTimeStampAttached() {
		return timeStampAttached;
	}

	public void setTimeStampAttached(boolean timeStampAttached) {
		this.timeStampAttached = timeStampAttached;
	}

	public boolean isCertificateAttached() {
		return certificateAttached;
	}

	public void setCertificateAttached(boolean certificateAttached) {
		this.certificateAttached = certificateAttached;
	}

	public boolean isStampAttached() {
		return stampAttached;
	}

	public void setStampAttached(boolean stampAttached) {
		this.stampAttached = stampAttached;
	}

	public Long getId() {
		return id;
	}

	public void disable() throws EnabledUsersException, EnabledUserGroupsException {
		if (hasEnabledUsers())
			throw new EnabledUsersException();

		if (hasEnabledUserGroups())
			throw new EnabledUserGroupsException();

		enabled = false;
	}

	private boolean hasEnabledUserGroups() {
		for (UserGroup userGroup : userGroups) {
			if (userGroup.isEnabled())
				return true;
		}
		return false;
	}

	private boolean hasEnabledUsers() {
		for (User user : users) {
			if (user.isEnabled())
				return true;
		}
		return false;
	}

	public void addUser(User newUser) {
		if (users == null)
			users = new ArrayList<User>();
		users.add(newUser);
	}

	public void addUserGroup(UserGroup newUserGroup) {
		if (userGroups == null)
			userGroups = new ArrayList<UserGroup>();
		userGroups.add(newUserGroup);
	}
}

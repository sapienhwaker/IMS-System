package com.cs.ds;

/*
 * user's userID, first name, last name, age, gender, primary language, SNS login ID,
 * email, roles, services, groups, permissions
 */

class User{
	
	int userId;
	String first_name;
	String last_name;
	int age;
	char gender;
	String language;
	String snsLoginId;
	String email;
	String services;
	int parity;
	long latestUpdate;
	Vector v;

	public User() {};

	public User(int userId, String first_name, String last_name, int age, char gender, String language, String snsLoginId,
			String email, String services) {
		super();
		this.userId = userId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.gender = gender;
		this.language = language;
		this.snsLoginId = snsLoginId;
		this.email = email;
		this.services = services;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSnsLoginId() {
		return snsLoginId;
	}
	public void setSnsLoginId(String snsLoginId) {
		this.snsLoginId = snsLoginId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public int getParity() {
		return parity;
	}
	public void setParity(int parity) {
		this.parity = parity;
	}
	public long getLatestUpdate() {
		return latestUpdate;
	}
	public Vector getV() {
		return v;
	}
	public void setV(Vector v) {
		this.v = v;
	}
	public void setLatestUpdate(long latestUpdate) {
		this.latestUpdate = latestUpdate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", first_name=" + first_name + ", last_name=" + last_name + ", age=" + age
				+ ", gender=" + gender + ", language=" + language + ", snsLoginId=" + snsLoginId + ", email=" + email
				+ ", services=" + services + ", parity=" + parity + ", latestUpdate=" + latestUpdate + ", v=" + v + "]";
	}

	public String toStringGroup() {
		return "User [userId=" + userId + ", first_name=" + first_name + ", last_name=" + last_name + ", language=" + language + ", email=" + email
				+ ", role=" + services + "]";
	}

	public String toStringAnonymity() {
		return "User [userId=" + userId + ", language=" + language + ", role=" + services + "]";
	}

}

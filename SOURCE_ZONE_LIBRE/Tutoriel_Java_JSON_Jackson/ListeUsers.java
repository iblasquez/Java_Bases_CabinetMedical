package com.iut.tutoJackson.metier;

import java.util.ArrayList;
import java.util.List;

public class ListeUsers {

	private List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return users.toString();
	}
	
}

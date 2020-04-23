package com.bit.web.user;

public interface UserService {

	public void add(User user);
	public User[] list(User user);
	public User login(User user);
	public User detail(String userid);
	public int count();
	public void update(User user);
	public void delete(User user);
}
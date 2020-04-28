package com.bit.web.user;

import java.util.List;

public interface UserService {

	public void add(User user);
	public List<User> list();
	public User login(User user);
	public User detail(String userid);
	public int count();
	public boolean update(User user);
	public void delete(User user);
	public boolean remove(String userid);
	public void saveFile(User user);
	public List<User> readFile();
	public boolean dupl(String userid);
}

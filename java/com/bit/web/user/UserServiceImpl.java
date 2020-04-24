package com.bit.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	private Map<String, Object> map; //User[] users; entry 배열
	
	public UserServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void add(User user) {
		map.put(user.getUserid(), user);
	}

	@Override
	public User[] list(User user) {
		return null;
	}

	@Override
	public User detail(String userid) {
		User t = (User) map.get(userid); //다운 캐스팅
		return t;
	}

	@Override
	public int count() {
		return map.size();
	}

	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey(user.getUserid())) {
			User u = detail(user.getUserid());
			if(user.getPassword().equals(u.getPassword())){
				returnUser = u;
			}
		}
		return returnUser;
	}

	@Override
	public boolean update(User user) {
		map.replace(user.getUserid(), user);
		return true;
	}

	@Override
	public boolean remove(String userid) {
		map.remove(userid);
		return true;
	}
	
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	
}

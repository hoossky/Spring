package com.bit.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	private Map<String, Object> map; //User[] users; entry 배열
	public final static String FILE_PATH = "C:\\Users\\bit\\spring-workspace\\bit\\src\\main\\resources\\static\\user\\";
	
	public UserServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void add(User user) {
		map.put(user.getUserid(), user);
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
	@Override
	public List<User> list() {
		List<User> list = new ArrayList<>();
		@SuppressWarnings("rawtypes")		
		Set set = map.entrySet(); // set에 엔트리(키 와 벨류 값 쌍으로 입력)
		@SuppressWarnings("rawtypes")
		Iterator it = set.iterator(); // 배열의 숫자를 세주는(검색) 인터페이스
		while(it.hasNext()) { //다음에 오는 숫자를 세주고 넘어감
			@SuppressWarnings("unchecked")
			Map.Entry<String, User> e = (Entry<String, User>) it.next();// 캐스팅을 통해 <키,벨류> 형태로 e값에 담을수 있게 변환, next | => | 한번 검색하면 다음 커서로 이동
			list.add(e.getValue());// 벨류값만 뽑아서 리스트에 대입
		}
		for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		}
		return list; 
	}
	@Override
	public void saveFile(User user) {
		try {
			File file = new File(FILE_PATH +"list.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
					String message = user.toString();
					System.out.println(message);
					writer.write(message);
					writer.newLine();
					writer.flush(); // writer 끝내기
		} catch(Exception e){
			System.out.println("파일 입력 시 에러 발생");
		}
	}
	@Override
	public List<User> readFile() {
		List<User> userlist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			File file = new File(FILE_PATH+"list.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
					while((message = reader.readLine()) != null) {
						list.add(message); // 리스트 토큰 걸어주기
					}
					JOptionPane.showMessageDialog(null, list);
					reader.close(); // reader 끝내기
			
		} catch(Exception e){
			
		}
		for(int i = 0; i < list.size(); i++) {
		User u = new User();
		String [] arr = list.get(i).split(",");
		u.setName(arr[0]);
		u.setUserid(arr[1]);
		u.setPassword(arr[2]);
		u.setSsn(arr[3]);
		u.setAddress(arr[4]);
		userlist.add(u);
		}
		return userlist;
	}
	
}

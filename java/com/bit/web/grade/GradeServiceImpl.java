package com.bit.web.grade;

import org.springframework.stereotype.Service;

import com.bit.web.util.Credit;

@Service
public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public Grade[] list(Grade grade) {
		return grades;
	}
	private int total(String userid) {
		int total = 0;
		for(int i = 0; i<count; i++) {
			if(userid.equals(grades[i].getUserid())) {
				total = Integer.parseInt(grades[i].getKorean())
						+ Integer.parseInt(grades[i].getEnglish())
						+ Integer.parseInt(grades[i].getMath())
						+ Integer.parseInt(grades[i].getJava());
			}
		}
		return total;
	}
	
	private int average(String userid) {
		
		return total(userid)/4;
		
	}
	
	public Credit detail(String userid) {
		Credit result = null;
						
		switch(average(userid)/10) {
		case 10: case 9 : result = Credit.A; break;
		case 8 : result = Credit.B; break;
		case 7 : result = Credit.C; break;
		case 6 : result = Credit.D; break;
		case 5 : result = Credit.E; break;
		default : result = Credit.F; break;
		}
		
		return result;
	}
	
	
	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub
		
	}

}

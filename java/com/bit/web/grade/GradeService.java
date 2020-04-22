package com.bit.web.grade;

import com.bit.web.util.Credit;

public interface GradeService {
	
	public void add(Grade grade);
	public int count();
	public Grade[] list(Grade grade);
	public Credit detail(String userid);
	public void update(Grade grade);
	public void delete(Grade grade);

}

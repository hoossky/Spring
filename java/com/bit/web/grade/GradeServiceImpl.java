package com.bit.web.grade;


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
	@Override
	public Grade detail(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int total(Grade grade) {
		
		int korean = Integer.parseInt(grade.getKorean());
		int english = Integer.parseInt(grade.getEnglish());
		int math = Integer.parseInt(grade.getMath());
		int java = Integer.parseInt(grade.getJava());
		
		return korean+english+math+java;
		
	}
	@Override
	public int average(Grade grade) {

		return total(grade)/3;
		
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

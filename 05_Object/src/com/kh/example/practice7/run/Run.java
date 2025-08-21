package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
		// 기본 생성자로 객체를 만들고
		Employee employee = new Employee();
		
		// Setter를 이용해 값 변경
		employee.setEmpNo(100);
		employee.setEmpName("홍길동");
		employee.setDept("영업부");
		employee.setJob("과장");
		employee.setAge(25);
		employee.setGender('남');
		employee.setSalary(2500000);
		employee.setBonusPoint(0.05);
		employee.setPhone("010-1234-5678");
		employee.setAddress("서울시 강남구");
		
		// Getter를 이용해 출력
		System.out.println("사원의 정보를 출력합니다.");
		System.out.println("사원번호 : " + employee.getEmpNo()
						 + ", 이름 : " + employee.getEmpName()
						 + ", 부서 : " + employee.getDept()
						 + ", 직급 : " + employee.getJob()
						 + ", 성별 : " + employee.getGender()
						 + ", 급여 : " + employee.getSalary()
						 + ", 보너스포인트 : " + employee.getBonusPoint()
						 + ", 전화번호 : " + employee.getPhone()
						 + ", 주소 : " + employee.getAddress());
		
	}
	
}

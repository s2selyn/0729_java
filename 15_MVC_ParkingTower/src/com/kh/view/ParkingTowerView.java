package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
	
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	public void mainMenu() {
		
		while(true) {
		
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 주차된 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 선택 : ");
			
			int menuNo = sc.nextInt(); // 예외처리 해야함
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("프로그램 종료"); return;
			}
		
		}
		
	}
	
	public void insertCar() {
		
		System.out.println();
		System.out.println("차량을 주차합니다.");
		
		System.out.print("주차하실 차량의 번호를 입력해주세요 : ");
		int carNum = sc.nextInt(); // 예외처리 해야함
		sc.nextLine();
		
		System.out.print("주차하실 차량의 종류를 선택해주세요(1. 경차 / 2. 세단 / 3. SUV / 4. 트럭) : ");
		int carType = sc.nextInt(); // 예외처리 해야함
		sc.nextLine();
		
		System.out.print("소유주를 입력해주세요 : ");
		String owner = sc.nextLine();
		
		ptc.insertCar(carNum, carType, owner);
		
	}
	
	public void deleteCar() {
		
		System.out.println();
		System.out.println("차량을 출차합니다.");
		
		System.out.print("출차하실 차량의 번호를 입력해주세요 : ");
		int carNum = sc.nextInt(); // 예외처리 해야함
		sc.nextLine();
		
		int result = ptc.deleteCar(carNum);
		
		if(result == 1) {
			System.out.println("차량을 출차합니다. 안녕히 가세요!");
		} else {
			System.out.println("해당하는 차량이 존재하지 않습니다.");
		}
		
	}
	
	public void searchCar() {
		
		System.out.println();
		System.out.println("주차된 차량을 검색합니다.");
		
		System.out.print("소유주를 입력해주세요 : ");
		String owner = sc.nextLine();
		
		ArrayList<Car> result = ptc.searchCar(owner);
		
		if(result.isEmpty()) {
			System.out.println("소유주의 차량이 존재하지 않습니다.");
		} else {
			
			System.out.println(owner + "님의 주차 차량 현황입니다.");
			System.out.println(result.toString());
			
		}
		
	}
	
	public void selectList() {
		
		ArrayList<Car> result = ptc.selectList();
		
		if(result.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			
			System.out.println("전체 차량을 출력합니다.");
			System.out.println(result.toString());
			
		}
		
	}
	
}

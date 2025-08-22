package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
	
	private ArrayList<Car> carList = new ArrayList();
	
	public void insertCar(int carNum, int carType, String owner) {
		
		Car car = new Car(carNum, carType, owner);
		carList.add(car);
		
	}
	
	public int deleteCar(int carNum) {
		
		for(int i = 0; i < carList.size(); i++) {
			
			Car car = carList.get(i);
			
			if(car.getCarNum() == carNum) {
				
				carList.remove(i);
				car.setParkingNum(carList.size() - 1); // 만약에 차를 빼면 리스트의 크기를 한 칸 줄이면 됨? 그걸로 주차된 차량의 수를 set 해줘도 되고?
				return 1;
				
			}
			
		}
		
		return 0;
		
	}
	
	public ArrayList<Car> searchCar(String owner) {
		
		for(int i = 0; i < carList.size(); i++) {
			
			Car car = carList.get(i);
			
			if(car.getOwner().equals(owner)) {
				
				carList.add(car);
				return carList;
				
			}
			
		}
		
		return null;
		
	}
	
	public ArrayList<Car> selectList() {
		return carList;
	}

}

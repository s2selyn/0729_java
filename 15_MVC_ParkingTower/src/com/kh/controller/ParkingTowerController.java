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

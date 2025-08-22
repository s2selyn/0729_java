package com.kh.model.vo;

public class Car {
	
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	public Car(int carNum, int carType, String owner) {
		
		parkingNum++;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
		
	}

	public int getParkingNum() {
		return parkingNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public int getCarType() {
		return carType;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	public void setCarType(int carType) {
		this.carType = carType;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String toString() {
		
		String returnCarType = null;
		
		switch(carType) {
		case 1 : returnCarType = "경차";
		case 2 : returnCarType = "세단";
		case 3 : returnCarType = "SUV";
		case 4 : returnCarType = "트럭";
		}
		
		return "차량 정보 [" + "주차 위치 : " + parkingNum + ", 차량 번호 : " + carNum + ", 차량 종류 : " + returnCarType + ", 소유주 : " + owner + "]";
		
	}

}

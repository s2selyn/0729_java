package com.kh.model.vo;

public class Car {
	
	private int parkingNum; // 이게 뭘 의미하는거지? 주차된 차량의 수? setter로 설정을 할 수 있게 둬도 되나?
	private int carNum;
	private int carType;
	private String owner;
	
	public Car(int carNum, int carType, String owner) { // 차를 주차한다는건 무조건 차에 대한 정보가 있는거지. 유령자동차가 주차될리없으니까 기본생성자 없애버림.. 근데 선생님이 기본생성자 무조건 만들라고 하신 것 같은데?
		
		parkingNum++; // 주차되면 주차장에 차가 생기는거니까 주차된 차량의 수가 증가하게 해줘야함
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
	
	public void setParkingNum(int parkingNum) { // 이게 진짜 있어도 되는건가?
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

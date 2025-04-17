package com.example.ServiceB.Dto;

public class CarDto {

	private int carNumber;
	
	private String carName;
	
	private double carPrice;
	
	private String carColor;
	
	private String carType;
	
	private String carModel;
	
	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "{ \"carName\": \""+ carName + "\", \"carPrice\": "+ carPrice +", \"carColor\":\""+ carColor + "\", \"carType\":\"" + carType + "\", \"carModel\":\"" + carModel + "\"}";
	}



}

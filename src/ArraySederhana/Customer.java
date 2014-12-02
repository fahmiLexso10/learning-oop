package ArraySederhana;

import java.util.Arrays;

public class Customer {

	private String name;
	private int age;

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static class Vehicle {
		public String name;
		public String color;

		public Vehicle(String name, String color) {
			this.name = name;
			this.color = color;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Vehicle [name=" + name + ", color=" + color + "]";
		}
		

	}

	public Vehicle[] vehicleList;
	
	public Vehicle[] getVehicle() {
		vehicleList = new Vehicle[0];
		vehicleList[0] = new Vehicle("Toyota", "Blue");
//		vehicleList[1] = new Vehicle("Toyota", "Red");
//		vehicleList[2] = new Vehicle("Toyota", "Gold");
		
		return vehicleList;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", vehicleList=" + Arrays.toString(vehicleList) + "]";
	}

	public static void main(String[] args) {
		Customer customer = new Customer("fahmi", 27);
		System.out.println(customer);
	}
}

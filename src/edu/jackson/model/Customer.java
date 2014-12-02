package edu.jackson.model;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private Long id;
	private String name;
	private Integer age;
	private Set<Address> addresses = new HashSet<Address>();

	public Customer() {
	}

	public Customer(String name, Integer age, Set<Address> addresses) {
		super();
		this.name = name;
		this.age = age;
		this.addresses = addresses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", addresses=" + addresses + "]";
	}

}

package com.problems.email_validator;

public class PeopleTotalBudget {
	public static void main(String[] args) {
		Person p1 = new Person("subham",21,31.2);
		Person p2 = new Person("subham",20,33.2);
		Person p3 = new Person("subham",92,32.2);
		Person p4 = new Person("subham",18,34.2);
		Person p5 = new Person("subham",25,30.2);
		
		Person arr []= {p1,p2,p3,p4,p5};
		
		System.out.println(getBudgets(arr));
		
	}
	public static double getBudgets(Person[] persons) {
		double total = 0;
		
		for(int i=0;i<persons.length;i++) {
			total=total+persons[i].getBudget();
		}
		
		return total;
	}
}

class Person{
	private String name;
	private int age;
	private double budget;
		
	public Person(String name, int age, double budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
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
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}	
}
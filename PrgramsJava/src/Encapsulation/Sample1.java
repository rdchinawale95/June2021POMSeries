package Encapsulation;

public class Sample1 {
	
	private String name;
	private int age;
	private int salary;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public String getName() {
		System.out.println(name);
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		System.out.println(age);
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		System.out.println(salary);
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

}

package constructor;

public class Employee_devices {
	
	public String name;
	int age;
	String[] devicelist;
	
	
	public Employee_devices(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Employee_devices(String name, int age, String[] devicelist) {
		this.name = name;
		this.age = age;
		this.devicelist = devicelist;
	}

	

}

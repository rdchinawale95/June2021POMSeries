package Oops;
//encapsulation
//by providing setter and getter we can make class read-only and write-only
public class Bank_loan {

	private String name;
	
	private int age;
	private int amount;
	//setters
	public void setName(String name){
		this.name=name;	
		}
	public void setage(int age){
		if(age>=18 && age<=50) {
		this.age= age;	
		}else {
			System.out.println("enter valid age");
		}
		}
	public void setamount(int amount){
		if(amount>=1000 &&  amount<=10000000) {
		this.amount= amount;	}
		else {
			System.out.println("enter valid amount");
		}
		}
//getters
	public String getname() {
		return name;
		}

	public int getage() {
		return age;
		}
	
	public int getamount() {
		return amount;
		}

}

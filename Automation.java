package week3.day1;

public  class Automation implements Language,TestTool
{	
	private int no;
	private String name;
	public void java() {
		System.out.println("Study Java");
	}
	public void selenium() {
		System.out.println("Study Selenium");
	}
	public String getName(String name){
		return name;
	}
	public Automation(String name, int num) {
		this.name=name;
		this.no=num;
		System.out.println("Name is "+ name + " and the num is "+ num);

	}
	public static void main(String[] args) {
		Automation obj= new Automation("testleaf",214);
		obj.java();
		obj.selenium();
		System.out.println("Id is "+id);
	}
}


package week3.day1;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("DESKTOP");
	}
	public static void main(String[] args){
		Desktop object1 = new Desktop();
		object1.computerModel();
		object1.desktopSize();
	}
}
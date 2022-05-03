package week3.day1;

public class AxisInfo 
{
	public void deposit()
{
		System.out.println("AxisBank Account");
}
public static void main(String[] args)
		{
			BankInfo bankinfo=new BankInfo();
			AxisInfo axisinfo=new AxisInfo();
			bankinfo.saving();
			bankinfo.fixed();
			bankinfo.deposit();
			axisinfo.deposit();
			
	}
	}
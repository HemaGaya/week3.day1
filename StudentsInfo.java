package week3.day1;

public class StudentsInfo
{
		public void getStudentInfo(int Id) {
			System.out.println("Student_ID ->"+ Id);
		}
		public void getStudentInfo(int Id,String Name) {
			System.out.println("STUDENT_ID->"+ Id +" "+ " Student_name -> "+Name);
		}
		public void getStudentInfo(int Id,String Name,String Emailid) {
			System.out.println("ID->"+ Id +" "+"   StudSt_name -> "+Name+" "+"   Student Email -> "+Emailid);
		}
		public void getStudentInfo(int Id,String Name,String Emailid,long Phonenumer) {
			System.out.println("ID->"+ Id +"   St_name -> "+Name+" "+"   Student Email -> "+Emailid+" "+"   Student phonenumber -> "+Phonenumer);
		}	
	public static void main(String[] args)
	{
		StudentsInfo Studentinfo = new StudentsInfo();
		Studentinfo.getStudentInfo(1001);
		Studentinfo.getStudentInfo(1001, "Hema");
		Studentinfo.getStudentInfo(1001, "Hema", "gay3hema4@gmail.com");
		Studentinfo.getStudentInfo(1002, "Vaishu","vaishu1234@gmail.com",9566155699L);
	
	}
}

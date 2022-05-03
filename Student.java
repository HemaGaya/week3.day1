package week3.day1;
import week3.day1.College;
import week3.day1.Department;
	public class Student extends Department 
	{
		public void studentName() {
			System.out.println("HEMAA");
		}
		public void studentDept() {
			System.out.println("CSE");
		}
		public void studentId() {
			System.out.println("1234");

	}
		public static void main(String[] args) {
			Student Studentobj = new Student();
			Studentobj.collegeCode();
			Studentobj.collegeName();
			Studentobj.collegeRank();
			System.out.println("---------------"); 
			Studentobj.deptName();
			System.out.println("--------------");
			Studentobj.studentName();
			Studentobj.studentDept();
			Studentobj.studentId();
			
		}
	}


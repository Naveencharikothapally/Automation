package Oops;

public class Employee {
  int EmpId;
  String Ename;
  String Ejob;
  int Esal;
  
  Employee(String Ename, int EmpId, String Ejob, int Esal)
  {
	  this.Ename=Ename;
	  this.EmpId=EmpId;
	  this.Ejob=Ejob;
	  this.Esal=Esal;
  }
  void Display() {
	  System.out.println(Ename);
	  System.out.println(EmpId);
	  System.out.println(Ejob);
	  System.out.println(Esal);
  }
  void show() {
	  System.out.println("Next employee details");
  }
	public static void main(String[] args) {
		Employee Emp1=new Employee("Naveen", 526492, "Tester", 25000);
		Emp1.Display();
		Emp1.show();
		
		Employee Emp2=new Employee("Avinash", 112234, "Tester", 35000);
		Emp2.Display();
		Emp2.show();
		

	}

}

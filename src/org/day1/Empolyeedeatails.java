package org.day1;

public class Empolyeedeatails {
	
	///method overloading
	
	
	private void Employeedetails(int emp) {
		// TODO Auto-generated method stub
		System.out.println(emp);

	}
	
	private void Employeedetails(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}
	
	
	private void Employeedetails(String email,long phone) {
		// TODO Auto-generated method stub
		System.out.println(email);
		System.out.println(phone);
	}
	private void Employeedetails(double id , String place) {
		// TODO Auto-generated method stub
		System.out.println(id);
		System.out.println(place);
	}
	public static void main(String[] args) {
		
		Empolyeedeatails info = new Empolyeedeatails();
		info.Employeedetails(20047231);
		info.Employeedetails("Dorababu");
		info.Employeedetails("dorababu5424@gmail.com", 9491945424l);
		info.Employeedetails(2.350, "Hyderabad");
		
		
		
		
	}

}

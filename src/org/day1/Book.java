package org.day1;

public class Book extends Students {
	
	public void Corejavabook() {
		// TODO Auto-generated method stub
		System.out.println("greentechonlogy");
	}
	
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("greentechology selenium");
	}
	
	public static void main(String[] args) {
		
		Book b = new Book();
		b.Corejavabook();
		b.selenium();
		b.studentid(2000);
		b.studentname("dorababu");
		
	}
	
}

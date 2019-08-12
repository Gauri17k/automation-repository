package oops.inheritance;

import oops.polymorphism.MethodeOverloading;

public class Gauri {

	public static void main(String[] args) {
		

		Telephone phone = new Telephone(); //downcasting
		phone.calling();
		
		Mobile m= new Mobile();
		m.texting();
		
		Smartphone s= new Smartphone();
		s.surfing();
		
		s.calling();
		s.texting();
		
		MethodeOverloading m1 = new MethodeOverloading();
		m1.sum(0, 9);
		
	Telephone p;
	
	p=new Telephone(); //upcasting
	p.calling();
	
	p=new Mobile();
	p.calling();
	
	p=new Smartphone();
	p.calling();
		
		
		
	}

}

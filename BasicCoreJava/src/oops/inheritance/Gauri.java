package oops.inheritance;

import oops.polymorphism.MethodeOverloading;

public class Gauri {

	public static void main(String[] args) {
		

		Telephone phone = new Telephone();
		phone.calling();
		
		Mobile m= new Mobile();
		m.texting();
		
		Smartphone s= new Smartphone();
		s.surfing();
		
		s.calling();
		s.texting();
		
		MethodeOverloading m1 = new MethodeOverloading();
		m1.sum(0, 9);
		
		
		
	}

}

package vaiablesAndDataTypes;

import functions.AccessModifier;// to use class of another package

public class TestAccessModWithinProject  extends AccessModifier{

	public static void main(String[] args) {
		
		AccessModifier obj =new AccessModifier();
		obj.publicfunction();
		
		TestAccessModWithinProject obj2= new TestAccessModWithinProject();
		obj2.protectedfunction();
		
		

		
	}

}

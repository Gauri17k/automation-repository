package functions;

public class TestAccessModWithinPackage {

	public static void main(String[] args) {
		
		AccessModifier obj =new AccessModifier();
		obj.publicfunction();
		
		obj.defaultfunction();
		
		obj.protectedfunction();
		
	}

}

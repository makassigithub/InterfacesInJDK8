package pack_1;

public interface TVshow {

	// This is implicitly static final
	public String APP_DEVELOPER = "MAKASSI";
	
	// These methods are implicitly abstract because we are in an interface
	public String show_type();
	public String show_presenter();
	
	// This is a default method and is allowed from JDK8 but do not forget the default keyword
	// This method can have  body
	
	default public void whereAmI(){	
		System.out.println("I am in the Interface named TVshow");
	}
	
	// JDK8 also allows static methods for interfaces.
	
	public static int getShowNumebr(){
		
		return 0;
	}
}

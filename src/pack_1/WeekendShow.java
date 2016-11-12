package pack_1;

// An interface can extend another interface
public interface WeekendShow extends TVshow {

// this interface has 2 methods added to the members of the parent interface	
	public void show_duration();	
	public String showTagettedPublic (String s);

	// this is a custom version of whereIam default method 
	default public void whereAmI(){	
		System.out.println("I am in the Interface named WeekendShow");
	}
}

package pack_1;
 
// the class that implements many interfaces must implement all their abstract method.
//But is not obliged to implement the default methods. It can override it if need be.

public class SundayShow implements TVshow,WeekendShow {

	// From the second interface
	@Override
	public void show_duration() {
		System.out.println("the show takes 2 hours");
		
	}
	
	// From the second interface
	@Override
	public String showTagettedPublic(String s) {	
		return s;
	}

	// From the first interface
	@Override
	public String show_type() {		
		return "telenovela";
	}

	@Override
	public String show_presenter() {		
		return "Presented by John";
	}
	
	// this is a custom version of whereIam default method in the implementing class
	// See that the default keyword is removed
		public void whereAmI(){	
			System.out.println("I am in the class named SundayShow");

}
}
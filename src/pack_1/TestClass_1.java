package pack_1;

public class TestClass_1 {

	public static void main (String...args){
		
		SundayShow ss = new SundayShow();
		
		
		
		// let's access abstract methods implemented by SundayShow
		ss.show_duration();
		System.out.println(ss.show_presenter());
		System.out.println("Targetting: " + ss.showTargettedPublic("Teenagers"));
		System.out.println("Show of type: "+ ss.show_type());
		System.out.println();
		
		// let's access the default methods overridden by SundayShow
		//Down is how we  access the whereAmI of the second Interfaces
				// in order to call the default version of the interface, the overridden version of the class must call the the interface's version
				// with the super keyword
				
				/*  public void whereAmI(){	
						WeekendShow.super.whereAmI();
						or 
						TVshow.super.whereAmI();
						

			              }
			    */
		
		//If whereAmI() is overridden in SundayShow, calling it on ss return the version of SundayShow.
		//If whereAmI() is not overridden in SundayShow, calling it on ss return the version of WeekendShow.
		//If whereAmI() is never overridden, calling it on ss return the version of TVshow the top superclass.
		  ss.whereAmI();
		  
		// The static method in TVshow is neither inherited by WeekendShow, nor available in instances of SundayShow
		// Remember, a static method is never copied when an instance is created. It's always accessed by the container name.
		  System.out.println();
		 System.out.println("Show number: " + TVshow.getShowNumebr());
		  
		
		
		
	
		
	}
}


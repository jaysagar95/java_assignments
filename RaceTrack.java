import java.util.*;
class RaceTrack{
	public static void main(String...args){
		Car c1= new Car(2001,"Maruti",9.0);
		Car c2= new Car(2000,"Honda",12.0);
		Car c3= new Car(2003,"Hyundai",10.0);
		System.out.println("1st car's details");
		System.out.println("Year:"+c1.getYear());
		System.out.println("Make:"+c1.getMake());
		System.out.println("speed:"+c1.getSpeed());
		System.out.println("\n2nd car's details");
		System.out.println("Year:"+c2.getYear());
		System.out.println("Make:"+c2.getMake());
		System.out.println("speed:"+c2.getSpeed());
		System.out.println("3rd car's details");
		System.out.println("Year:"+c3.getYear());
		System.out.println("Make:"+c3.getMake());
		System.out.println("speed:"+c3.getSpeed());
		c1.accelerator();
		c1.accelerator();
		c1.accelerator();
		c1.accelerator();
		c2.accelerator();
		c3.accelerator();
		c1.accelerator();
		System.out.println("\n"+c1.getSpeed());
		System.out.println("\n"+c2.getSpeed());
		System.out.println("\n"+c3.getSpeed());
		
		
		
	}
}
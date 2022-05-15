package sofiaone;

//Demo of Is-a relationship :: inheritance 
//Super class
class SpaceShip{
	
	//declare instance variables
	int shieldActive;
	int shieldStrength;
	int position;
	
	//Define constructor :: non-parameterised  
	public SpaceShip() {
		System.out.println("Hi..\n I am non-parameterised constructor of super Class:: SpaceShip \n");
	}
	
	//Define Constructor :: parameterised 
	public SpaceShip(int shieldActive, int shieldStrength, int position) {
		this.shieldActive = shieldActive;
		this.shieldStrength = shieldStrength;
		this.position = position;
	}
	

	//Define method setShield
	public void setShield() {
		System.out.println("This is setShield method of super class");
		
		System.out.println("Space Ship Data:: " + shieldActive + "  "+ shieldStrength + "  "+ position );
	}
	

	//Define method move()
	public void move() {
		System.out.println("I am move method of super class SpaceShip");
	}
}



//Sub class- 1
class StarFighter extends SpaceShip{
	//Define method fireMissile()
	public void fireMissile() {
		System.out.println("This is fireMissile method of StarFighter.");
	}
}


// Sub class-2
class WarpCrusier extends SpaceShip{
	//Define method move() 
	/*
	 * Method overriding :: Allowing a subclass to replace the implementation of a method
	 *  from superclass.  Here it is move() method replacing the move() method of superclass. 
	 */
	public void move() {
		System.out.println("This is move method of subclass WarpCrusier");
	}
}


//Sub class-3
class CargoShuttle extends SpaceShip{
	//Define method cargo()
	public void cargo() {
		System.out.println("This is the sub class Cargoshuttle");
	}
	
	//Define method dropCargo()
	public void dropCargo() {
		System.out.println("Drop Cargo Here");
	}
}


public class SpaceShipGame {

	public static void main(String[] args) {
		
		//Instantiate object of subclass :: CargoShuttle
		
		CargoShuttle CS = new CargoShuttle();
		CS.position = 6;
		CS.shieldActive =9 ;
		CS.shieldStrength =100 ;
		CS.setShield();
		CS.move();
		CS.cargo();
		CS.dropCargo();
		
		System.out.println("\n-----------------------------------------\n");
		
		//Instantiate object of subclass WarpCruiser
		
		WarpCrusier WC = new WarpCrusier();
		WC.position = 1;
		WC.shieldActive = 3;
		WC.shieldStrength = 200;
		WC.setShield();
		WC.move();  //overriding
		
		System.out.println("\n-----------------------------------------\n");
		
		//Instantiate object of subclass StarFighter
		
		StarFighter SF = new StarFighter();
		SF.position = 2;
		SF.shieldStrength =300;
		SF.shieldActive =7;
		SF.setShield();
		SF.move();
		SF.fireMissile();
		
		System.out.println("\n-----------------------------------------\n");
		
		//Instantiate object of superclass SpaceShip
		
		//SpaceShip SS = new SpaceShip();
		SpaceShip SS = new SpaceShip(6,700,8);
		SS.setShield();
		SS.move();
	    
	}

}

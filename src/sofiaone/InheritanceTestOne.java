package sofiaone;
//Demo of Inheritance 
class Base{
	//Define method M1
	public void M1() {
		System.out.println("This is Base Class|Super Class Method.");
	}
}

class Derived extends Base {
	
	//Define method M2
	public void M2() {
		System.out.println("This is Derived Class | Sub Class Method.");
	}
}


public class InheritanceTestOne {

	public static void main(String[] args) {
		//Instantiate or create object of sub class
		Derived d = new Derived();
		d.M1(); //Invoke the Base Class Method
		d.M2(); //Invoke the Derived Class Method
	}

}

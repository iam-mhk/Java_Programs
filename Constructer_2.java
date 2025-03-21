package mypackage;


class Fruits{
	String name;
	
	Fruits(){
		this.name="Apple";
		System.out.println("fruit name :"+this.name);
		
	}
	
	Fruits(String name){
		this.name=name;
		System.out.println("fruit name :"+name);
	}
	
}



public class Practise2_constructors {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruits f=new Fruits();
		
		Fruits f1=new Fruits("Mango");

	}

}

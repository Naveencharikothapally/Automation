package Oops;
class Animal{
	void eat(){
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	void Bark(){
		System.out.println("The dog is barking");
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.eat();
		obj.Bark();
	
		
		

	}

}
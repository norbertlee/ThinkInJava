package exercise;

class Animal{
	public String name;
	Animal(String name){
		this.name = name;
		System.out.println("animal");
	}
}

class Dog extends Animal{
	public String furColor;
	Dog(String n,String c) {
		super(n);
		furColor = c;
	}
}

class Cat extends Animal{
	public String eyesColor;
	Cat(String n,String c) {
		super(n);
		eyesColor = c;
		
	}
	
}

public class ObjectChange {
	public static void main(String args[]) {
		Animal a = new Animal("name");
		a = new Dog("bigyellow","yellow");
		System.out.println(a.name);
		Dog d1 = (Dog)a;
		System.out.println(d1.equals(a));
	}
}

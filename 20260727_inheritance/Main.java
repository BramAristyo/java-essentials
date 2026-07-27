class Animal {

  // "public" subclasses (Dog, Cat) can access directly
	public String name = "default";

	// "private" means only Animal can access
	private String sound = "default sound";

	public Animal(String name, String sound) {
	  this.name = name;
		this.sound = sound;
	}

	public void eat() {
	  System.out.println(name + " is eating");
	}

	public void makeSound() {
    System.out.println(sound);
	}

	public void setSound(String sound) {
    this.sound = sound;
	}

	public String getSound() {
	  return sound;
	}
}

class Dog extends Animal {

  // Parent Cons must call super(...)
	Dog(String name, String sound) {
	  super(name, sound); // Calls Animal's constructor to set up name and sound
	}

	// Overide parent function
  public void eat() {
    System.out.println(name + ": " + getSound() +" .. so delicious");
  }

  public void died(int month) {
    System.out.println(name + " was killed " + month + " ago!");
  }

  // makeSound() is NOT overridden, Dog uses Animal's version
}

class Cat extends Animal {
  Cat(String name) {
    super(name, "Miauw");
  }
  public void makeSound() {
    // Access the "sound" variable must use GETTER
    // because it's come from private function
    System.out.println(name + ": " + getSound());
  }
}

public class Main {
  public static void main(String[] args) {
    // Create a generic animal
    Animal myAnimal = new Animal("Generic", "Sound");

    // Polymoprhism - can treat a Dog as an Animal;
    Animal myDog = new Dog("Ani", "whoofh");
    Animal myCat = new Cat("Jane");

    myAnimal.eat();
    myAnimal.makeSound();

    myDog.eat();
    myDog.makeSound();

    // it will error because died function is come from Dog object not the ANIMAL
    // myDog.died(3);

    myCat.eat();
    myCat.makeSound();
  }
}

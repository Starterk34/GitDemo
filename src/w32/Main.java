package w32;

public class Main {
    public static void main (String[] args){
        Dog dog1 = new Dog("Jack", "bulldog");
        Dog dog2 = new Dog("Micky", "puddle");
        System.out.println("Initial data:");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
        dog1.setName("Joe");
        dog1.setBreed("pug");
        dog2.setName("Lindl");
        dog2.setBreed("corgi");
        System.out.println("Changed data:");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
    }
}

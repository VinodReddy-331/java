package javalearning;

public class Inheritence {
    public static void main(String[] args) {
        Dog obj = new Dog("Carnivores ");
        obj.eat();
        obj.sleep();
        obj.bark();
        System.out.println("Animal classification : " + obj.classification); //non static Variable
//        System.out.println("Animal classification : " + Animal.classification); //non static Variable cannot access via ClassName
        System.out.println("Habitat Type is accessing via ClassName: :" + Animal.habitat); //Static variable accessing via ClassName
        System.out.println("Habitat Type is accessing via Object: :" + obj.habitat); //Static variable can also be acessed via Obj

        System.out.println("Animal type accessing via ClassName: " + Dog.petType);
        System.out.println("Animal type accessing via Object: : " + obj.petType);
        System.out.println("Dog's age is " + obj.dogAge);

    }
}

class Animal {
    public String classification = "Mammals";
    public static String habitat = "Terrestrial Animals";
    private int lifeSpan = 40;

    public static void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
        System.out.println(lifeSpan);
    }
}

class Dog extends Animal {
    public static String petType = "Family";
    public int dogAge = 25;
    private static String diet;

    public static void bark(){
        System.out.println("Dog is barking");
        System.out.println("Dog is a " +diet + "animal");
    }
    public Dog(String diet ){
        this.diet = diet;
    }

}



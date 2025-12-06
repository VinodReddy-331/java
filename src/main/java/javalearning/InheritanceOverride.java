package javalearning;

public class InheritanceOverride {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.getLocation();
    }
}

class Parent{
    public void getLocation(){
        System.out.println("Madanapalle");
    }

    public void getVillageAddress(){
        System.out.println("Madanapalle");
    }
}

class Child extends Parent{
    public void getLocation(){
        System.out.println("Hyderabad");
        super.getVillageAddress();
    }
}
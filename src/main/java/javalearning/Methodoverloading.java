package javalearning;

public class Methodoverloading {
    public static void main(String[] args) {
        getAge(20);
        getAge(20, "Vinod");
    }

    public static void getAge(int age)
    {
        System.out.println("age of the person is "+ age);
    }

    public static void getAge(int age, String name){
        System.out.println("age of the person is "+ age);
        System.out.println("name of the person is "+ name);
    }
}

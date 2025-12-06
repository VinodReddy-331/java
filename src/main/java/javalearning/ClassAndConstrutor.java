package javalearning;

public class ClassAndConstrutor {
    public static void main(String[] args) {
        ConstrutorClass obj = new ConstrutorClass("Vinod", 33);
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(ConstrutorClass.age);
        System.out.println(ConstrutorClass.name);

    }
}

class ConstrutorClass {
    public static String name;
    public static int age;

    public ConstrutorClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
package javalearning;

public class ClassA {

    public static void main(String[] args) {
        /*
        Constructor
         */

        ClassB obj = new ClassB("Vinod Kumar Reddy", "ISO 2008 Reg");
        /*
        Non-static methods belong to an instance of the class.
        You must create an object to call them.
        */
        System.out.println("No of students in a class are :  " + obj.noOfstudents(45));

        /* To call a Static Method Direct Class Name is required
           Static methods belong to the class, not an object.
           JVM does not need an instance to call the method.
           Advantage: Convenient for utility methods or main entry point.
        */
        ClassB.school();
        obj.schooDetails();
        System.out.println("Object through accessing variable : " + obj.principal_name);
    }
}

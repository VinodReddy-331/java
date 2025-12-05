package javalearning;

public class PublicVsPrivate {
    public static String name = "VinodKumarReddy";
    private int salary = 101010;
    String college = "JNTUA";

    public static void main(String[] args) {
        System.out.println("Accessing name from Class Name cause static and public: " + PublicVsPrivate.name);
        System.out.println("Accessing name from directly cause static and public: "+  name);
        System.out.println(getName("Public Static Method"));
        getSalary(101110);
        PublicVsPrivate obj0 = new PublicVsPrivate();
        obj0.fetchDepartment();
        System.out.println(obj0.salary);

        PrivateClass obj = new PrivateClass();
        System.out.println(PrivateClass.location);
        obj.getCompanyName();


    }
    public static String getName(String name) {
        return name;
    }

    private static  void getSalary(int salary) {
        System.out.println(salary);
    }

    public void fetchDepartment(){
        System.out.println("Fetching Department is Software Developer");
    }

}

class PrivateClass {
    private static String companyName = "ServiceNow";
    public static String location = "Hyderabad";

    public void getCompanyName(){
        System.out.println(companyName);
        getLocation();
    }

    private static void getLocation(){
        System.out.println(location);
    }


}
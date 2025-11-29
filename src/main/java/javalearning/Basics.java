package javalearning;

public class Basics {
    public static void main(String[] args) {
        try {
            int age = 25;
            String name = "Vinod";
            double percentage = 80.50;
            boolean ispass = true;
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("percentage = " + percentage);
            System.out.println("ispass = " + ispass);
            getAge(20);
            getPercentage(10, 10);
            System.out.println("Name is : " +getName("Vinod Kumar Reddy"));
            System.out.println("Age is : " +getNewAge(30));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Proceeding furthur");
        }
        System.out.println("programme executed succesfully");
    }

/* static method inside a class meaning they belong to class not an object
so we can directly call any method with static inside a class
 */
    public static void getAge(int age) {
        System.out.println("nage = " + age);
    }

    public static void getPercentage(int subj1, int subj2) {
        double subj1_per = (subj1 +subj2/subj1) * 100 ;
        double subj2_per = (subj1 +subj2/subj2) * 100 ;
        System.out.println("subj1_per = " + subj1_per);
        System.out.println("subj2_per = " + subj2_per);
    }
/* retrun type is manditory in Java
    example:
    1/ public static void -->Retrun nothing
    2/ public static int -->Retrun Int
    3/ public static String -->Retrun String
 */
    public static String getName(String name){
        return name;
    }

    public static int getNewAge(int name){
        return name;
    }
}
package javalearning;

public class ClassB {
    String principal_name;
    String isoReg;

    public ClassB(String principal_name, String isoReg){
        this.principal_name = principal_name;
        this.isoReg = isoReg;
    }

    public int noOfstudents(int num){
        return num;
    }

    public static void school() {
        System.out.println("school name is: Rayalaseem Childerns Academy");
    }

    public void schooDetails (){
        System.out.println("Principal Name is : "+principal_name);
        System.out.println("ISO Reg is :  "+ isoReg);
    }
}

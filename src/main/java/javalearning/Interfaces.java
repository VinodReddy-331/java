package javalearning;

public class Interfaces {
    public static void main(String[] args) {
        B obj =  new B();
        obj.getBankAddress();
        obj.getBankDetails();
        obj.fetchBanlance("XYZ");
    }
}

interface A{
    void getBankDetails();
    void getBankAddress();
    String ceo = "VinodKumarReddy";
}

interface D{
    void fetchBanlance(String accNum);
}

class B implements A, D{
    @Override
    public void getBankDetails() {
        System.out.println(110101);
        System.out.println(ceo);
    }
    @Override
    public void getBankAddress() {
        System.out.println("Madanapalle");
        System.out.println(ceo);
    }
    @Override
    public void fetchBanlance(String accNum){
        System.out.println("Balance for AccountNo "+accNum + "is 10000000");
        System.out.println(ceo);
    }
}


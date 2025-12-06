package javalearning;

import java.util.List;

public class Loops {
    public static void main(String[] args) {
        int age = 20;
        for (int i = 0; i<=10 & age >= i; i++) {
            System.out.println("Person is not eligible for Pension");
        }

        int[] marksList = {10, 20,30, 40,50};
        for (int i = 0; i <=marksList.length; i=i+1){
            System.out.println("Marks in each subject are :" + marksList[i]);
        }

        int voterAge = 0;
        while(voterAge < 20){
            voterAge++;
            System.out.println("voterAge is :" + voterAge + "Not Eligible for Voting");
        }
    }
}

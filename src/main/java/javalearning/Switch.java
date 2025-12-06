package javalearning;

public class Switch {
    public static int num = 20;
    public static void main(String[] args) {
    controlSwitch();
    }
    public static void controlSwitch() {
        switch (num) {
            case 10 :
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println(num);
        }
    }
}

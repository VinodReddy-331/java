package javalearning;

public class Inheritence extends Vechile {
    public static void main(String[] args) {
        Vechile vechObj = new Vechile();
        vechObj.manufacture();
        Vechile.engine();
        Vechile.noOfWheels();

    }
}


class Vechile{

    public static void noOfWheels(){
        System.out.println("No of Wheels are: 4");
    }
    public static void engine(){
        System.out.println("Engine is: 4StoreEngine");
    }
    void manufacture(){
        System.out.println("Manufacture is: Volvo");
    }
}

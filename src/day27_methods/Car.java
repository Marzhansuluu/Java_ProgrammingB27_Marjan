package day27_methods;

public class Car {
    /*Algorithm for using car
    unlock car
    open the door
    sit down and start
    check mirrors
    seatbelt
    adjust seat
    put to drive and go

     */
    public static void unlock(){
        System.out.println("Unlocking the car");
    }
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitAndStart(){
        System.out.println("Sittng down in seat\nadjust the seat\nAnd insert the key\nthen start the car");
    }
    public static void checkMirrors(){
        System.out.println("Checking the left mirror\nchecking the rear view mirror\nchecking the right mirror");
    }
    public static void putOnSeatbelt(){
        System.out.println("putting on seatbelt");
    }
    public static void drive(){
        System.out.println("putting into drive\npressing the on the accelerator");
    }
    public static void late(){ // I created another method when I am rushing.
        unlock();
        openDoor();
        sitAndStart();
        drive();
    }

    public static void main(String[] args) {
        unlock();
        openDoor();
        sitAndStart();
        checkMirrors();
        putOnSeatbelt();
        drive();
        System.out.println();
        System.out.println();
        late();
    }
}

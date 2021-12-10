package Mutable_Objects_Immutable_Objects;

public class Demo {
    public static void main1(String[] args) {
        //Can change the state of the object
        Mutable studentMutable = new Mutable(1, "Huynh Quoc Khanh");
        System.out.println("Id: " + studentMutable.getID() + "\nFull name: " + studentMutable.getFullName());
        studentMutable.setFullName("Huynh Khanh");
        System.out.println("Id: " + studentMutable.getID() + "\nFull name: " + studentMutable.getFullName());

        //Can't change the state of the object
        Immutable studentImmutable = new Immutable(2, "Huynh Khanh", 9.5);
        //studentImmutable.setID Error!!!
    }
}

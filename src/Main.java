public class Main {
    public static void main(String[] args) {
        //Can change the state of the object
        Mutable studentMutable = new Mutable(1,"Huynh Quoc Khanh");
        System.out.println("Id: "+studentMutable.getID() +"\nFull name: " + studentMutable.getFullName());
        studentMutable.setFullName("Huynh Khanh");
        System.out.println("Id: "+studentMutable.getID() +"\nFull name: " + studentMutable.getFullName());

        //Can't change the state of the object
        Immutable studentImmutable = new Immutable(2, "Huynh Khanh", 9.5);
        //studentImmutable.setID Error!!!
    }
}

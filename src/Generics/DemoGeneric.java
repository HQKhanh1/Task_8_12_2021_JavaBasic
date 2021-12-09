package Generics;

public class DemoGeneric {
    public static void main(String[] args) {
        GenericsDictionary<String, String> d = new GenericsDictionary<String, String>("Study", "hoc");
        String english = d.getKey();
        String vietnamese = d.getValue();
        System.out.println(english + ": " + vietnamese); //Ouput: Study: hoc
    }
}

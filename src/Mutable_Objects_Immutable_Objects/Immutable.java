package Mutable_Objects_Immutable_Objects;

public class Immutable {
    private int id;
    private String full_name;
    private double test_score;

    public Immutable (int id, String full_name, double test_score) {
        this.id = id;
        this.full_name = full_name;
        this.test_score = test_score;
    }

    public int getID() {
        return id;
    }

    public String getFullName() {
        return full_name;
    }

    public double getTestScore(){
        return test_score;
    }
}

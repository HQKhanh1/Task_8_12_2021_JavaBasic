public class Immutable {
    private int id;
    private String full_name;
    private double scores;

    public Immutable (int id, String full_name, double scores) {
        this.id = id;
        this.full_name = full_name;
        this.scores = scores;
    }

    public int getID() {
        return id;
    }

    public String getFullName() {
        return full_name;
    }

    public double getScores(){
        return scores;
    }
}

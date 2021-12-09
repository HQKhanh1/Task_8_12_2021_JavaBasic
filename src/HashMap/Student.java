package HashMap;

public class Student {
    private int id;
    private String full_name;
    private double test_score;
    public Student(int id, String full_name, double test_score){
        this.id = id;
        this.full_name = full_name;
        this. test_score = test_score;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFull_name(){
        return full_name;
    }

    public void setFull_name(String full_name){
        this.full_name = full_name;
    }

    public double getTest_score(){
        return test_score;
    }

    public void setTest_score(double test_score){
        this.test_score = test_score;
    }
}

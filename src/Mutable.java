public class Mutable {
    private int id;
    private String full_name;

    public Mutable(int id, String full_name) {
        this.id = id;
        this.full_name = full_name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String full_name) {
        this.full_name = full_name;
    }
}

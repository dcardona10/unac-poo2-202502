package co.edu.unac.oop2.nothreads;

public class Item {

    private String name;
    private int secs;

    public Item(String name, int secs) {
        this.name = name;
        this.secs = secs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecs() {
        return secs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }
}

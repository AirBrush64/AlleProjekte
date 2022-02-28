public class Lehrer {
    private String name;
    private int alter;
    

    public Lehrer(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Lehrer [alter=" + alter + ", name=" + name + "]";
    }




}
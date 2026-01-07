public class Jaeger {
    public Jaeger() {}

    public Jaeger(String name, int mark, double height, double weight, String status) {
        this.name = name;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.status = status;
    }

    private String name;
    private int mark;
    private double height;
    private double weight;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void launch() {
        System.out.println(name + " запущен в бой!");
    }
}
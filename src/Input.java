public class Input {
    private int day;
    private int month;
    private int year;
    private double weight;
    private boolean boy;
    public Input(int day, int month, int year, double weight, boolean boy) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.weight = weight;
        this.boy = boy;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public double getWeight() {
        return weight;
    }
    public boolean getBoy() {
        return boy;
    }
}

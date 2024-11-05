public class Car {
    public String mark;
    public int age;
    public float price;

    public String getInfo() {
        return String.format("""
            Car:
            Mark: %s
            Age: %s
            Price: %s
            """, mark, age, price);
    }

}

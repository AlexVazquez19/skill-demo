public class Car {
    String model;
    int horsepower;

    public Car(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }

    public void addHorsepower(int n) {
        this.horsepower += 1;
    }
}

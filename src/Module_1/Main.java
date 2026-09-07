package Module_1;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model 3");

        myCar.showModel();
    }
}
public class Car {
    private String brand;
    private String model;
    private int speed;

    
    public Car() {
        this.brand = "Oletusmerkki";
        this.model = "Oletusmalli";
        this.speed = 0;
    }

    
    public void status() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
    }

   
    public void accelerate(int amount) {
        if (amount < 0) return;
        speed += amount;
    }

   
    public void decelerate(int amount) {
        if (amount < 0) return;

        speed -= amount;
        if (speed < 0) {
            speed = 0;
        }
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

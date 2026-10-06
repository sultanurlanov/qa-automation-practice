package THREADQA;

public class Car {

    private String model;
    private Integer fuel;

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public  void  goToRoad() {

        if (fuel > 20) {
            System.out.println("машина может поехать");
        } else{
            System.out.println("недостаточно бензина");
        }
    }

    public Car(String model, Integer fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    public void beeepBeep() {
        System.out.println("Машина посигналила");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

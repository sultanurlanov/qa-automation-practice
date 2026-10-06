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
            System.out.println("машина может поехать, остаток бензина " + " " + fuel );
            fuel = fuel - 15;
        } else{
            System.out.println("недостаточно бензина");
            addFuel();
            System.out.println("можно ехать " + " " + fuel);
        }
    }

    public Car(String model, Integer fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    private void addFuel() {
        if (fuel < 15) {
            System.out.println("надо заправится");
            fuel = fuel + 40;
        }
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

package THREADQA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
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



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(fuel, car.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}

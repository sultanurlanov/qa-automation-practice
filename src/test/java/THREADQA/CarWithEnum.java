package THREADQA;

public class CarWithEnum {

    public CarWithEnum(String name, TypeCar type, String color, Integer door) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.door = door;
    }

    @Override
    public String toString() {
        return "CarWithEnum{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", door=" + door +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeCar getType() {
        return type;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoor() {
        return door;
    }

    public void setDoor(Integer door) {
        this.door = door;
    }

    private String name;
    private TypeCar type;
    private String color;
    private Integer door;
}

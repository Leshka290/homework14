import java.util.Arrays;
import java.util.List;

public class Hogwarts {
    private String name;
    private int power;
    private int transgression;

    public Hogwarts(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "name: " + name  +
                ". General skills: power= " + power +
                ", transgression= " + transgression;
    }

}

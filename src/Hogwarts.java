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

    public void studentInfo() {
        System.out.println(this);
    }

    public void compareStudentHogwarts(Hogwarts h) {
        int sum1 = 0;
        int sum2 = 0;

        sum1 = this.getPower() + this.getTransgression();
        sum2 = h.getPower() + h.getTransgression();

        if(sum1 > sum2) {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + h.getName());
        }
        else {
            System.out.println(h.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        }
    }
}

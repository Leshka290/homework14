public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;
    public Hufflepuff(String name, int power, int properties, int hardworking, int loyal, int honest) {
        super(name, power, properties);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() + ". Hufflepuff student personal skills: " +
                "hardworking= " + hardworking +
                ", loyal= " + loyal +
                ", honest= " + honest +".";
    }

    public void compareStudentHufflepuff(Hufflepuff h) {
        int sum1 = 0;
        int sum2 = 0;

        sum1 = this.getHardworking() + this.getLoyal() + this.getHonest();
        sum2 = h.getHardworking() + h.getLoyal() + h.getHonest();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффиндуец, чем " + h.getName());
        } else {
            System.out.println(h.getName() + " лучший Пуффиндуец, чем " + this.getName());
        }
    }
}

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slytherin(String name, int power, int properties, int cunning, int determination, int ambition,
                    int resourcefulness, int lustForPower) {
        super(name, power, properties);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ". Slytherin student personal skills: " +
                "cunning= " + cunning +
                ", determination= " + determination +
                ", ambition= " + ambition +
                ", resourcefulness= " + resourcefulness +
                ", lust for power= " + lustForPower + ".";
    }

    public void compareStudentSlytherin(Slytherin s) {
        int sum1 = 0;
        int sum2 = 0;

        sum1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        sum2 = s.getCunning() + s.getDetermination() + s.getAmbition() + s.getResourcefulness() + s.getLustForPower();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеренец, чем " + s.getName());
        } else {
            System.out.println(s.getName() + " лучший Слизеренец, чем " + this.getName());
        }
    }
}

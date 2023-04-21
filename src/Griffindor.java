public class Griffindor extends  Hogwarts{
    private int nobility;
    private int honor;
    private int courage;
    public Griffindor(String name, int power, int properties, int nobility, int honor, int courage) {
        super(name, power, properties);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + ". Griffindor student personal skills: " +
                "nobility= " + nobility +
                ", honor= " + honor +
                ", courage= " + courage +".";
    }

    public void compareStudentGriffindor(Griffindor g) {
        int sum1 = 0;
        int sum2 = 0;

        sum1 = this.getNobility() + this.getHonor() + this.getCourage();
        sum2 = g.getNobility() + g.getHonor() + g.getCourage();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + g.getName());
        } else {
            System.out.println(g.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
}

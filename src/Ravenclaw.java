public class Ravenclaw extends Hogwarts{
        private int smart;
        private int wise;
        private int witty;
        private int fullOfCreativity;
        public Ravenclaw(String name, int power, int properties, int smart, int wise, int witty, int fullOfCreativity) {
            super(name, power, properties);
            this.smart = smart;
            this.wise = wise;
            this.witty = witty;
            this.fullOfCreativity = fullOfCreativity;
        }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
        public String toString() {
            return super.toString() + ". Revenclaw student personal skills: " +
                    "smart= " + smart +
                    ", wise= " + wise +
                    ", witty= " + witty +
                    ", full of creativity= " + fullOfCreativity + ".";
        }

    public void compareStudentRevenclaw(Ravenclaw r) {
        int sum1 = 0;
        int sum2 = 0;

        sum1 = this.getSmart() + this.getWise() + this.getWitty() + this.getFullOfCreativity();
        sum2 = r.getSmart() + r.getWise() + r.getWitty() + r.getFullOfCreativity();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Коктевранец, чем " + r.getName());
        } else {
            System.out.println(r.getName() + " лучший Коктевранец, чем " + this.getName());
        }
    }
}

import java.util.List;

public class Main {
    static Griffindor harryPotter = new Griffindor("Harry Potter", 83, 84, 88, 89, 77);
    static Griffindor hermioneGranger = new Griffindor("Hermione Granger", 76, 78, 81, 89, 90);
    static Griffindor ronWeasley = new Griffindor("Ron Weasley", 70, 78, 60, 76, 62);
    static Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 83, 84, 88, 76, 89, 67, 77);
    static Slytherin grahaMontagu = new Slytherin("Graham Montagu", 84, 84, 75, 68, 75, 64, 77);
    static Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 83, 84, 88, 76, 89, 67, 77);
    static Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 88, 77, 89, 67, 77);
    static Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 80, 76, 84, 62, 77);
    static Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 88, 76, 89, 67, 66);
    static Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 81, 76, 67, 89, 67, 69);
    static Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 82, 76, 67, 81, 65, 72);
    static Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 83, 76, 67, 76, 67, 74);

    public static List<Hogwarts> studentsHogwarts = List.of(harryPotter, hermioneGranger, ronWeasley
            , zachariasSmith, cedricDiggory, justinFinchFletchley, zhouChang, marcusBelby, padmaPatil
            , dracoMalfoy, grahaMontagu, gregoryGoyle
    );
    public static List<Griffindor> studentsGriffindor = List.of(harryPotter, hermioneGranger, ronWeasley);
    public static List<Hufflepuff> studentsHufflepuff = List.of(zachariasSmith, cedricDiggory, justinFinchFletchley);
    public static List<Ravenclaw> studentsRevenclaw = List.of(zhouChang, marcusBelby, padmaPatil);
    public static List<Slytherin> studentsSlytherin = List.of(dracoMalfoy, grahaMontagu, gregoryGoyle);

    public static void main(String[] args) {
        studentInfo("Graham Montagu");
        compareStudentGriffindor("Harry Potter", "Hermione Granger");
        compareStudentHufflepuff("Cedric Diggory", "Justin Finch-Fletchley");
        compareStudentRevenclaw("Zhou Chang", "Padma Patil");
        compareStudentSlytherin("Gregory Goyle", "Graham Montagu");
        compareStudentHogwarts("Zacharias Smith", "Hermione Granger");
    }

    public static void studentInfo(String name) {
        for(Hogwarts h : studentsHogwarts) {
            if(h.getName().equals(name)){
                System.out.println(h);
            }
        }
    }

    public static void compareStudentGriffindor(String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        int i1 = 0;
        int i2 = 0;

        for (Griffindor g : studentsGriffindor) {
            if (name1.equals(g.getName())) {
                i1 = studentsGriffindor.indexOf(g);
                sum1 = g.getNobility() + g.getHonor() + g.getCourage();
            }
            if (name2.equals(g.getName())) {
                i2 = studentsGriffindor.indexOf(g);
                sum2 = g.getNobility() + g.getHonor() + g.getCourage();
            }
        }
        if (sum1 > sum2) {
            System.out.println(
                    studentsHufflepuff.get(i1).getName() + " лучший Гриффиндорец, чем "
                            + studentsHufflepuff.get(i2).getName());
        } else {
            System.out.println(
                    studentsHufflepuff.get(i2).getName() + " лучший Гриффиндорец, чем "
                            + studentsHufflepuff.get(i1).getName());
        }
    }

    public static void compareStudentHufflepuff(String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        int i1 = 0;
        int i2 = 0;

        for (Hufflepuff h : studentsHufflepuff) {
            if (name1.equals(h.getName())) {
                i1 = studentsHufflepuff.indexOf(h);
                sum1 = h.getHardworking() + h.getLoyal() + h.getHonest();
            }
            if (name2.equals(h.getName())) {
                i2 = studentsHufflepuff.indexOf(h);
                sum2 = h.getHardworking() + h.getLoyal() + h.getHonest();
            }
        }
        if (sum1 > sum2) {
            System.out.println(
                    studentsHufflepuff.get(i1).getName() + " лучший Пуффиндуец, чем "
                            + studentsHufflepuff.get(i2).getName());
        } else {
            System.out.println(studentsHufflepuff.get(i2).getName() + " лучший Пуффиндуец, чем "
                    + studentsHufflepuff.get(i1).getName());
        }
    }

    public static void compareStudentRevenclaw(String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        int i1 = 0;
        int i2 = 0;

        for (Ravenclaw g : studentsRevenclaw) {
            if (name1.equals(g.getName())) {
                i1 = studentsRevenclaw.indexOf(g);
                sum1 = g.getSmart() + g.getWise() + g.getWitty() + g.getFullOfCreativity();
            }
            if (name2.equals(g.getName())) {
                i2 = studentsRevenclaw.indexOf(g);
                sum2 = g.getSmart() + g.getWise() + g.getWitty() + g.getFullOfCreativity();
            }
        }
        if (sum1 > sum2) {
            System.out.println(
                    studentsRevenclaw.get(i1).getName() + " лучший Коктевранец, чем "
                            + studentsRevenclaw.get(i2).getName());
        } else {
            System.out.println(
                    studentsRevenclaw.get(i2).getName() + " лучший Коктевранец, чем "
                            + studentsRevenclaw.get(i1).getName());
        }
    }

    public static void compareStudentSlytherin(String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        int i1 = 0;
        int i2 = 0;

        for (Slytherin g : studentsSlytherin) {
            if (name1.equals(g.getName())) {
                i1 = studentsSlytherin.indexOf(g);
                sum1 = g.getCunning() + g.getDetermination() + g.getAmbition() + g.getResourcefulness() + g.getLustForPower();
            }
            if (name2.equals(g.getName())) {
                i2 = studentsSlytherin.indexOf(g);
                sum2 = g.getCunning() + g.getDetermination() + g.getAmbition() + g.getResourcefulness() + g.getLustForPower();
            }
        }
        if (sum1 > sum2) {
            System.out.println(
                    studentsSlytherin.get(i1).getName() + " лучший Слизеренец, чем "
                            + studentsSlytherin.get(i2).getName());
        } else {
            System.out.println(
                    studentsSlytherin.get(i2).getName() + " лучший Слизеренец, чем "
                            + studentsSlytherin.get(i1).getName());
        }
    }

    public static void compareStudentHogwarts(String name1, String name2) {
        int sum1 = 0;
        int sum2 = 0;
        int i1 = 0;
        int i2 = 0;

        for(Hogwarts h : studentsHogwarts) {
            if(name1.equals(h.getName())){
                i1 = studentsHogwarts.indexOf(h);
                sum1 = h.getPower() + h.getTransgression();
            }
            if(name2.equals(h.getName())){
                i2 = studentsHogwarts.indexOf(h);
                sum2 = h.getPower() + h.getTransgression();
            }
        }
        if(sum1 > sum2) {
            System.out.println(
                    studentsHogwarts.get(i1).getName() + " обладает бОльшей мощностью магии, чем "
                            + studentsHogwarts.get(i2).getName());
        }
        else {
            System.out.println(
                    studentsHogwarts.get(i2).getName() + " обладает бОльшей мощностью магии, чем "
                            + studentsHogwarts.get(i1).getName());
        }
    }
}
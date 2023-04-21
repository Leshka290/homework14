public class Main {

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 83, 84, 88, 89, 77);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 76, 78, 81, 89, 90);
        Griffindor ronWeasley = new Griffindor("Ron Weasley", 70, 78, 60, 76, 62);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 83, 84, 88, 76, 89, 67, 77);
        Slytherin grahaMontagu = new Slytherin("Graham Montagu", 84, 84, 75, 68, 75, 64, 77);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 83, 84, 88, 76, 89, 67, 77);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 88, 77, 89, 67, 77);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 80, 76, 84, 62, 77);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 88, 76, 89, 67, 66);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 81, 76, 67, 89, 67, 69);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 82, 76, 67, 81, 65, 72);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 83, 76, 67, 76, 67, 74);

        harryPotter.compareStudentGriffindor(hermioneGranger);
        zachariasSmith.compareStudentHufflepuff(justinFinchFletchley);
        zhouChang.compareStudentRevenclaw(marcusBelby);
        grahaMontagu.compareStudentSlytherin(gregoryGoyle);
        cedricDiggory.compareStudentHogwarts(padmaPatil);
    }
}
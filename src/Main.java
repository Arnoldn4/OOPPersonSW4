//WB6 Q7
public class Main {
    //main method
    public static void main(String[] args){
        System.out.println("=== CENSUS 2089, CITY OF BROKENHEARTED ===");
        Person person00 = new Person("Ada Lovelace", 25, 67.9, 178);
        System.out.println("Name = " + person00.getName());
        System.out.println("Age = " + person00.getAge());
        System.out.println("Height = " + person00.getHeight());
        System.out.println("Weight = " + person00.getWeight());

        // CREATE PERSON01 AND PERSON02 OBJECTS AND PRINT THEM
        Person person01 = new Person("James Peterson", 34, 73.5, 180);
        System.out.println("Name = " + person01.getName());
        System.out.println("Age = " + person01.getAge());
        System.out.println("Height = " + person01.getHeight());
        System.out.println("Weight = " + person01.getWeight());

        Person person02 = new Person("Bob Thornley", 25, 68.2, 171);
        System.out.println("Name = " + person02.getName());
        System.out.println("Age = " + person02.getAge());
        System.out.println("Height = " + person02.getHeight());
        System.out.println("Weight = " + person02.getWeight());

    }
}
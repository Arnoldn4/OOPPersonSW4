public class Person {
    // list all attributes here: name,age,weight,height
    private String name;
    private int age;
    private double weight;
    private double height;

    // constructor method
    public Person(String name, int age, double weight, double height){
        setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

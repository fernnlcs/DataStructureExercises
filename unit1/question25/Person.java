package unit1.question25;

public class Person {

    private String name;
    private int age;
    private char sex;
    private float height;
    private float weight;

    public Person(String name, int age, char sex, float height, float weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public float imc() {
        float result = weight / (height * height);
        return result;
    }

    @Override
    public String toString() {
        return "\nPerson [\n\tname = " + name + ", \n\tage = " + age + ", \n\tsex = " + sex + ", \n\theight = " + height + ", \n\tweight = "
                + weight + ", \n\timc = " + imc() + "\n]";
    }

}

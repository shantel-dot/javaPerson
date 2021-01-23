package human;

public class Person {

    String name;
    int age;
    int height;
    String occcupation;


    public Person(int age, int height, String occcupation) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.occcupation = occcupation;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getOcccupation() {
        return occcupation;
    }

    public void setOcccupation(String occcupation) {
        this.occcupation = occcupation;
    }

    public Person() {



    }
}
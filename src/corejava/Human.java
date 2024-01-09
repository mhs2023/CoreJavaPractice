package corejava;


// Example of copy constructor
public class Human {

    String name;
    int age;
    String occupation;

    public Human() {
    }

    public Human(String parameterName, int parameterAge, String parameterOccupation) {
        name = parameterName;
        age = parameterAge;
        occupation = parameterOccupation;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", occupation=" + occupation + '}';
    }

    public Human(Human reference) {
        name = reference.name;
        age = reference.age;
        occupation = reference.occupation;
    }

}

class Main {

    public static void main(String[] args) {
        Human person = new Human("Tamimi Iqbal", 35, "Sportsman");
        System.out.println(person.toString());
        Human person_2 = new Human(person);
        System.out.println(person_2.toString());
    
    }

}

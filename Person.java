public class Person {
//declare the variables
    private String name;
    private int age;
    private String address;

    // Constructor with three parameters
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method to display person's details using another method
    public void myDetails(Person person) {
        person.displayDetails();
    }

    // Method to print current instance
    public void printCurrentInstance() {
        myDetails(this);
    }

    public static void main(String[] args) {
        // Create an object called Daniel
        Person daniel = new Person("Daniel", 30, "123 Main St");

        // Use the object to call the printCurrentInstance method
        daniel.printCurrentInstance();
    }
}
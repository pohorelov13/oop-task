package demo;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Employee employee = new Employee("Walter White", "teacher",
                "met@hermano.com","050123456", 55);
        System.out.println(" ");
        System.out.println("Employee: " + employee.getName() + "\nposition: " + employee.getPosition() +
                "\nemail: " + employee.getEmail() + "\nphone: " + employee.getPhone() + "\nage: " +
                employee.getAge());
    }
}

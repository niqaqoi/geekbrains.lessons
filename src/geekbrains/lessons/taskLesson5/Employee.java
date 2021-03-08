package geekbrains.lessons.taskLesson5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;

    Employee(String fullName, String position, String email, String phoneNumber, String salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee("Ivan Ivanov", "CEO", "ii@it.com", "987654",
                "10000$", 45);
        employeeList[1] = new Employee("Petr Petrov", "Senior Developer", "pp@it.com", "123456",
                "5000$", 41);
        employeeList[2] = new Employee("Alex Alexov", "Senior Developer", "aa@it.com", "123987",
                "5000$", 38);
        employeeList[3] = new Employee("Mariya Mashina", "Middle Developer", "mm@it.com", "789456",
                "3000$", 35);
        employeeList[4] = new Employee("Nikita Nikitin", "Junior Developer", "nn@it.com", "1987656",
                "2000$", 31);
    }
}

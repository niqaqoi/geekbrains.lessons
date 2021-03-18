package geekbrains.lessons.taskLesson5;

public class Main {

    public static final int AGE = 40;

    public static void main(String[] args) {
        Employee staff[] = new Employee[5];
        staff[0] = new Employee("Ivan", "CEO", "ivan@it.com", "9191", 10000, 41);
        staff[1] = new Employee("Petr", "Team Lead", "petr@it.com", "9192", 5000, 38);
        staff[2] = new Employee("Fedor", "Middle Dev", "fedor@it.com", "9193", 4000, 42);
        staff[3] = new Employee("Alex", "Middle Dev", "alex@it.com", "9194", 4000, 35);
        staff[4] = new Employee("Maks", "Junior Dev", "maks@it.com", "9195", 2000, 20);
        for (Employee st: staff) {
            if (st.getAge() > AGE) {
                System.out.println(st);
            }
        }
    }
}

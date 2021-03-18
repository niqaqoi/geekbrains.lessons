package geekbrains.lessons.taskLesson6;

public class Cat extends Pet {

    public Cat(String name, int swimmingPossibleLength, int runningPossibleLength) {
        super(name,swimmingPossibleLength,runningPossibleLength);
    }

    @Override

    public void swim ( int length) {
        System.out.println("Коты не плавают");
    }

    @Override
    public void run ( int length) {
        if(runningPossibleLength > length) {
            System.out.println("Кот" + name + " пробежал всю дистанцию(" + length + ")");
        } else {
            System.out.println(name + " не может осилить такую дистанцию");
        }
    }
}
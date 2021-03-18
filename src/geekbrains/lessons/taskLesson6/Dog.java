package geekbrains.lessons.taskLesson6;

public class Dog extends Pet {

    public Dog (String name, int swimmingPossibleLength, int runningPossibleLength) {
        super(name, swimmingPossibleLength, runningPossibleLength);
    }
        @Override
        public void swim ( int length) {
            if (swimmingPossibleLength > length) {
                System.out.println("Собака " + name + " проплыла всю дистанцию(" + length + ")");
            } else {
                System.out.println(name + " не может осилить такую дистанцию");
            }
        }

        @Override
        public void run ( int length) {
            if(runningPossibleLength > length) {
                System.out.println("Собака" + name + " пробежала всю дистанцию(" + length + ")");
        } else {
                System.out.println(name + " не может осилить такую дистанцию");
            }
        }
}

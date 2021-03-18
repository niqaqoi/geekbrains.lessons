package geekbrains.lessons.taskLesson6;

public abstract class Pet implements Runnable, Swimming {

    protected final String name;

    protected final int swimmingPossibleLength;
    protected final int runningPossibleLength;

    public Pet(String name, int swimmingPossibleLength, int runningPossibleLength) {
        this.name = name;
        this.swimmingPossibleLength = swimmingPossibleLength;
        this.runningPossibleLength = runningPossibleLength;
    }

    public String getName() { return name; }

    public int getSwimmingPossibleLength() { return swimmingPossibleLength; }

    public int getRunningPossibleLength() { return runningPossibleLength; }

    public static int foo() {return 1;}
}
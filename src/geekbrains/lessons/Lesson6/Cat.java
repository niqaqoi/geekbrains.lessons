package geekbrains.lessons.Lesson6;

public class Cat {
        private String name;
        private String color;
        private int age;

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String toString () {
            return "Animal{" +
                    "name=" + name + '\'' +
                    ", color" + color + '\'' +
                    ",age" + age + '}';

        }
}


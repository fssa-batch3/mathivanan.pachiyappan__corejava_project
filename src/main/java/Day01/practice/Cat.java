package Day01.practice;

public class Cat {

    private int age;
    private String color;

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void speak() {
        System.out.println("Meow!");
    }
    public static void main(String[] args) {
    
        Cat cat1 = new Cat(4, "White");
        Cat cat2 = new Cat(3, "Black");

        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        cat1.speak();

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
        cat2.speak();
    }
}
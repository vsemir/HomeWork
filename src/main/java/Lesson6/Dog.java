package Lesson6;

public class Dog extends Animals{
    private static int count;

    public Dog(String name) {
        super(name);
        super.setCount();
        count ++;
    }

    public void run(int a){
        if (a > 500){
            System.out.println("Слишком большое растояние для кота");
        }else {
            System.out.println(super.getName() + " пробежал(а): " + a + "м");
            System.out.println();
        }
    }

    public void swim(int a) {
        if (a > 10){
            System.out.println("Слишком большое растояние для собаки");
        }else {
            System.out.println("Собака проплыла: " + a + "м");
        }
        System.out.println();
    }

    public void dogInfo() {
        System.out.println("Всего животных: " + super.getCount()+ "\n" + "Собака имя: " +  super.getName() + "\nСобак всего: " + count);
        System.out.println();
    }

}

package Lesson6;

public class  Cat extends Animals {
    private static int count;



    public Cat(String name) {
        super(name);
        super.setCount();
        this.count++;
    }

    public void run(int a){
        if (a > 200){
            System.out.println("Слишком большое растояние для кота");
        }else {
            System.out.println(getName() + " пробежал(а): " + a + "м");
        }
        System.out.println();
    }

    public void swim(int a) {
        System.out.println("Кот не умеет плавать");
        System.out.println();
    }


    public void catInfo() {
        System.out.println("Всего животных: " + super.getCount()+ "\n" + "Кот имя: " +  super.getName() + "\nКотов всего: " + count);
        System.out.println();
    }


}

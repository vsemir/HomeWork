package Lesson5;

public class HomeWorkApp {
    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        persArray[2] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        persArray[3] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        persArray[4] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);

        System.out.println("персонал старше 40 лет: ");

        for (int i = 0; i < persArray.length; i++) {

            if (persArray[i].getAge() >= 40){
                persArray[i].info();
                System.out.println();
            }
        }
    }
}

package Lesson5;

public class Person {

    private String fio;
    private String post;
    private String email;
    private String telephoneNumber;
    private int salary;
    private int age;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephone_number) {
        this.telephoneNumber = telephone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fio, String post, String email, String telephone_number, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.telephoneNumber = telephone_number;
        if(salary > 0){
            this.salary = salary;
        } else
            System.out.println("Значение не может быть отрицательным или равным нулю");
        if (age > 0){
            this.age = age;
        } else
            System.out.println("Значение не может быть отрицательным или равным нулю");

    }

    public void info(){
        System.out.printf("%nФИО = %s %nДолжность = %s %ne-mail = %s %nТелефонный номер = %s %nЗарплата = %s %nВозраст = %s", fio, post, email, telephoneNumber, salary, age);
    }
}
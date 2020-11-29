package com.company;

class StaffList{
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public StaffList(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %d", name, position, email, phone, salary, age);
    }

    public int getAge() {
        return age;
    }
    void getFullInfo() {
        System.out.println("ФИО: " + name + " Должность: " + position + " E-mail: " + email + " Телефон: " + phone + " Заработная плата" + salary + " Возраст: " + age);
    }
}
public class Staff {

    public static void main(String[] args) {
        StaffList[] staffs = {
                new StaffList("Сухоруков Иван Олегович", "Главный инженер", "suhor@ooolasurit.ru","89282365895" ,40000, 35),
                new StaffList("Смирнов Илья Викторович", "Инженер", "smirnov@ooolasurit.ru","89282365892" ,30000, 42),
                new StaffList("Орлов Денис Сергеевич", "Инженер-настройщик АТС", "orlov@ooolasurit.ru","89282365897" ,31000, 45),
                new StaffList("Крынкин Петр Радионович", "Водитель", "krinkin@ooolasurit.ru","89282365896" ,25000, 56),
                new StaffList("Поляков Антон Викторович", "Системный администратор", "polyakov@ooolasurit.ru","89282365890" ,30000, 25),
        };

        System.out.println("Общий список сотрудников");
        for (int i = 0; i < staffs.length; i++) {
            System.out.println(staffs[i]);
        }
        System.out.println();
        System.out.println("Список сотрудников старше 40 лет");
        for (StaffList e : staffs) {
            if(e.getAge() > 40){
                e.getFullInfo();
            }
        }

    }



}

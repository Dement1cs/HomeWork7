package ua.ithillel.lms;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.name = "Slava";
        client.age = 18;
        client.money = 5000.00;
        client.credit = true;

        Car car = new Car();
        car.name = "Toyota Camry";
        car.year = 2009;
        car.price = 9000;

        if (client.age >= 18) {
            if (client.money >= car.price) {
                System.out.println("����������� � �������� ����������");
            } else {
                System.out.println("���������, ��� �� ������� " + (car.price - client.money) + ", credit?");

                if (client.credit = true) {
                    System.out.println("������ �� ��� ������ �������� " + (client.money / 36) +
                            ". ����������� � �������� ����������");
                } else {
                    System.out.println("��������� �����");
                }
            }
        } else {
            System.out.println("��������, ��������� ����� " + (18 - client.age) + " ����");
        }
    }
}
import java.time.LocalDate;
import java.util.concurrent.LinkedTransferQueue;

public class Main {

    public static void definitionLeapYear(int year) { // метод определения признака високосного года
        int signOfLeapYear1 = 4; //инициализация признака високосный год - каждые 4 года
        int signOfLeapYear2 = 400; //инициализация признака високосный год - каждые 400 лет
        int signOfLeapYearNon = 100; //инициализация признака не високосный год - каждые 100 лет
        float multiplicityYear4 = (float) year / signOfLeapYear1; // определение кратности года 4
        float multiplicityYear400 = (float) year / signOfLeapYear2; //определение кратности года 400
        float multiplicityYear100 = (float) year / signOfLeapYearNon; // определение кратности года 100
        if (multiplicityYear400 % 1 == 0) { // Если кратно 400 то год високосный
            System.out.println(year + " год является високосным");
        } else if (multiplicityYear100 % 1 == 0) { // Если кратно 100 год не високосный, исключения года кратные 400
            System.out.println(year + "  год не является високосным");
        } else if (multiplicityYear4 % 1 == 0) { // Если кратно 4 год високосный за исключение годам кратным 100
            System.out.println(year + "  год  является високосным");
        } else {
            System.out.println(year + "  год не является високосным");
        }
    }
        public static void recommendInstallation( int clientOS,int clientDeviseYear) { // метод определение рекомендации клиенту
        // в зависимости от ОС и года выпуска телефона
            int currentYear = LocalDate.now().getYear();
            if (clientDeviseYear == currentYear) { // выбор версии приложения, для телефонов ранее текущего года - облегченная, текущий год - обычная
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS");
            } else {
                System.out.println("Установите версию для Android");
            }
        } else if (clientDeviseYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для Android  по ссылке");
            }
        }
    }
    public static void deliveringDay (int deliveryDistance) { // метод рассчета времени доставки карты до клиента
        // в зависимости от расстояния от офиса до адреса клиента
        int deliveryOneDay = 20; //инициализация расстояния для доставки за 1 день до 20 км
        int deliveryTwoDay = 60; //инициализация расстояния для доставки за 2 дня от 20 до 60 км
        int deliveryThreeDay = 100; //инициализация расстояния для доставки за 3 дня от 60 до 100 км
        if (deliveryDistance <= deliveryOneDay) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance <= deliveryTwoDay) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance <= deliveryThreeDay) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }
    }
        public static void main (String[] args) {
        System.out.println("Задача 1");
        int year = 2021; //инициализация проверяемого года
        definitionLeapYear(year);
        System.out.println("Задача 2");
        int clientOS = 0; //инициализация признака операционной системы телефона, 0 - iOS,  1 - Android
        int clientDeviseYear = 2016; //инициализация года выпуска телефона телефона
        recommendInstallation( clientOS, clientDeviseYear);
        System.out.println("Задача 3");
        int deliveryDistance = 95; //инициализация расстояния от офиса до адреса клиента
        deliveringDay(deliveryDistance);
    }
    }




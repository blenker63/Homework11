import java.util.concurrent.LinkedTransferQueue;

public class Main {

    public static void definitionLeapYear(int year) {
        int signOfLeapYear1 = 4; //инициализация признака високосный год - каждые 4 года
        int signOfLeapYear2 = 400; //инициализация пр
        // изнака високосный год - каждые 400 лет
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
        public static void recommendInstallation( int clientOS,int clientDeviseYear) {
//        int clientOS = 0; //инициализация признака операционной системы телефона, 0 - iOS,  1 - Android
//        int clientDeviseYear = 2013; //инициализация года выпуска телефона телефона
        if (clientDeviseYear >= 2015) { // выбор версии приложения, для телефонов ранее 2013 - облегченная, 2013 и позже - обычная
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS");
            } else {
                System.out.println("Установите версию для Android");
            }
        } else if (clientDeviseYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("установите облегченную версию приложения для Android  по ссылке");
            }
        }
    }

        public static void main (String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        definitionLeapYear(year);
        System.out.println("Задача 2");
        int clientOS = 0; //инициализация признака операционной системы телефона, 0 - iOS,  1 - Android
        int clientDeviseYear = 2013; //инициализация года выпуска телефона телефона
        recommendInstallation( clientOS, clientDeviseYear);
    }
    }




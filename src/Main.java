public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
       public static float definitionLeapYear (int year) {
//        int year = 2024; //инициализация значения года для проверки
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
    int Year = 2021
    }
}
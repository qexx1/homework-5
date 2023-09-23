public class Main {
    public static void main(String[] args) {
        //задание 1
        var clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //задание 2
        var OS = 0;
        var releaseDate = 2016;
        if (OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } if (OS == 1 && releaseDate <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (OS == 0 && releaseDate <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //задание 3
        var year = 2400;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год являеться високосным");
        } else if ((year % 4 == 0 && year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год являеться високосным");
        } else {
            System.out.println(year + " год не являеться високосным");
        }

        //задание 4
        var deliveryDistance = 101;
        var deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (20 > deliveryDistance || deliveryDistance <= 60){
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (60 > deliveryDistance || deliveryDistance <= 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        //задание 5
        var monthNumber = 13;
        switch (monthNumber) {
            case 1,2,12:
                System.out.println("Сейчас зима!");
                break;
            case 3,4,5:
                System.out.println("Сейчас весна!");
                break;
            case 6,7,8:
                System.out.println("Сейчас лето!");
                break;
            case 9,10,11:
                System.out.println("Сейчас осень!");
                break;
            default:
                System.out.println("А у нас есть больше чем 12 месяцев?))");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 == 0 && year != 100 || year % 400 == 0) {
            System.out.println(year+ " год является високосным");
        } else {
            System.out.println(year+ " год не является високосным");
        }
        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        /* if (deliveryDistance < 20) {
            System.out.println("Потребуется сутки");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        } */
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней:" +deliveryDays);
    }
}
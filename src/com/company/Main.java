package com.company;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int Year = LocalDate.now().getYear();

        visokos(Year);
        OCType(1,Year);
        CardDelivery(95);
    }

    public static void visokos(int year) { //----------------------------Високосный год
        if(year%4 == 0)
        {
            if(year%100 == 0) {
                if(year%400 == 0) {
                    System.out.format("%d год является високосным\n", year);
                }
                else {
                    System.out.format("%d год не является високосным\n", year);
                }
            }
            else {
                System.out.format("%d год является високосным\n", year);
            }
        }
        else {
            System.out.format("%d год не является високосным\n", year);
        }
    }

    public static void OCType(int clientOS, int year) { //----------------------------Андройд или IOs
        if (clientOS == 0){
            if (year > 2015)
                System.out.println("Установите версию приложения для iOS по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else{
            if (year > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            else
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void CardDelivery(int deliveryDistance) { //----------------------------Доставка карты
        if (deliveryDistance-20 <= 0)
            System.out.println("Потребуется дней: 1");
        else
        {
            int result = (deliveryDistance-20)/40;
            if((deliveryDistance-20)%40>0)
                System.out.format("Потребуется дней: %d\n", result+2);
            else
                System.out.format("Потребуется дней: %d\n", result+1);
        }
    }
}

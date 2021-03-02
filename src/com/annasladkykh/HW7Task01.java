package com.annasladkykh;

/*1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/

public class HW7Task01 {
    public static void main(String[] args) {
        int count = 0;
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (hours / 10 % 10 == minutes % 10 & hours % 10 == minutes / 10 % 10) {
                    count++;
                }
            }
        }
        System.out.println(count + " coincidences");
    }
}
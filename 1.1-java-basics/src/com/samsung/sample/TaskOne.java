package com.samsung.sample;


/**
 * Задача - найти число PI, зная радиус окружности R.
 * <p>
 * Алгоритм - делим окружность на N одинаковых треугольников, считаем примерную длину полуокружности и получаем примерное значение PI
 */
public class TaskOne {
    public static void main(String[] args) {
        double R = 5; // радиус
        double n = 1000; // количество маленьких треугольников

        double alpha = Math.toRadians(180.0 / n); // угол у каждого маленького треугольника
        double A = Math.sqrt(2 * R * R - 2 * R * R * Math.cos(alpha)); // длина основания треугольника

        double halfL = A * n; // длина полуокружности
        double PI = (2 * halfL) / (2 * R); // вычисляем PI по формуле L=2*PI*R

        System.out.println("PI=" + PI); // вывод
    }
}

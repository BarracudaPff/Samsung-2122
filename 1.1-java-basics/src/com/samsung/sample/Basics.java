package com.samsung.sample;

// Аннотация нужна только для подсветки в IDEA
@SuppressWarnings({"StatementWithEmptyBody", "ConstantConditions", "unused", "CStyleArrayDeclaration", "UnusedAssignment", "GrazieInspection"})
public class Basics {
    public static void main(String[] args) {
        //----------------------------------------Объявление переменных---------------------------------------
        // Переменные объявляются с использованием <тип> <имя>
        int varInt;
        // Одновременное объявление нескольких переменных одного типа
        // <type> <name1>, <name2>, <name3>
        int varInt1, varInt2, varInt3;

        //--------------------------------------Инициализация переменных--------------------------------------
        // объявление и инициализация переменной <type> <name> = <val>
        int fooInt = 1;
        int fooInt1, fooInt2, fooInt3;
        // инициализация нескольких переменных одного типа
        // <type> <name1>, <name2>, <name3> = <val>
        fooInt1 = fooInt2 = fooInt3 = 1;

        //-------------------------------------------Типы переменных------------------------------------------
        // Byte - 8-битное целое число.
        // (-128 <= byte <= 127)
        byte fooByte = 100;

        // Short - 16-битное целое число.
        // (-32,768 <= short <= 32,767)
        short fooShort = 10000;

        // Integer - 32-битное целое число.
        // (-2,147,483,648 <= int <= 2,147,483,647)
        int varNewInt = 1;

        // Long - 64-битное целое число.
        // (-9,223,372,036,854,775,808 <= long <= 9,223,372,036,854,775,807)
        long fooLong = 100000L;
        // L используется для указания на то, что переменная имеет тип long;
        // По умолчанию, числа без L являются integer.

        // Замечание: в Java нет беззнаковых типов.

        // Float - 32-битное IEEE 754 число с плавающей запятой с одинарной степенью точности.
        float fooFloat = 234.5f;
        // f используется для указания на то, что переменная имеет тип float;
        // иначе, число являлось бы double.

        // Double - 64-битное IEEE 754 число с плавающей запятой с двойной степенью точности.
        double fooDouble = 123.4;

        // Boolean - true или false
        boolean fooBoolean = true;
        boolean barBoolean = false;

        // Char - Простой 16-битный символ Unicode.
        char fooChar = 'A';

        // Переменным final не может быть присвоен другой объект.
        final int HOURS_I_WORK_PER_WEEK = 9001;

        //-----------------------------------------------Строки-----------------------------------------------
        String fooString = "My String Is Here!";

        // \n - это экранированный символ, который означает начало новой строки.
        String barString = "Printing on a new line?\nNo Problem!";
        // \t - это экранированный символ, который добавляет символ табуляции.
        String bazString = "Do you want to add a tab?\tNo Problem!";
        System.out.println(fooString);
        System.out.println(barString);
        System.out.println(bazString);

        //-----------------------------------------------Массивы----------------------------------------------
        // Размер массива должен быть указан при объявлении.
        // Объявлять массив можно в следующих форматах:
        //<тип данных> [] <имя> = new <тип данных>[<размер массива>];
        //<тип данных> <имя>[] = new <тип данных>[<размер массива>];
        int[] intArray = new int[10];
        String[] stringArray = new String[1];
        boolean boolArray[] = new boolean[100];

        // Другой способ объявления и инициализации массива:
        int[] y = {9000, 1000, 1337};
        String names[] = {"Bob", "John", "Fred", "Juan Pedro"};
        boolean bools[] = new boolean[]{true, false, false};

        // Индексация массива - доступ к элементу.
        System.out.println("intArray @ 0: " + intArray[0]);

        // Массивы изменяемы и индекс в них начинается с 0.
        intArray[1] = 1;
        System.out.println("intArray @ 1: " + intArray[1]); // => 1

        //----------------------------------------------Операторы---------------------------------------------
        System.out.println("\n->Операторы");

        int i1 = 1, i2 = 2; // Сокращение для множественного объявления.

        // Арифметика в Java проста.
        System.out.println("1+2 = " + (i1 + i2)); // => 3
        System.out.println("2-1 = " + (i2 - i1)); // => 1
        System.out.println("2*1 = " + (i2 * i1)); // => 2
        System.out.println("1/2 = " + (i1 / i2)); // => 0 (0.5 округлено)

        // Остаток от деления
        System.out.println("11%3 = " + (11 % 3)); // => 2

        // Операторы сравнения.
        System.out.println("3 == 2? " + (3 == 2)); // => false
        System.out.println("3 != 2? " + (3 != 2)); // => true
        System.out.println("3 > 2? " + (3 > 2)); // => true
        System.out.println("3 < 2? " + (3 < 2)); // => false
        System.out.println("2 <= 2? " + (2 <= 2)); // => true
        System.out.println("2 >= 2? " + (2 >= 2)); // => true

        //-----------------------------------------Побитовые операторы----------------------------------------
        /*
        ~       Унарное побитовое дополнение.
        <<      Знаковый сдвиг влево.
        >>      Знаковый сдвиг вправо.
        >>>     Беззнаковый сдвиг вправо.
        &       Побитовое И.
        ^       Побитовое исключающее ИЛИ.
        |       Побитовое ИЛИ.
        */

        //----------------------------------------Операторы инкремента----------------------------------------
        int i = 0;
        System.out.println("\n->Inc/Dec-rementation");
        // Операторы ++ и -- увеличивают и уменьшают значение на 1 соответственно.
        // Если они находятся перед переменной, сначала происходит
        // увеличение/уменьшение, затем операция, если после,
        // то сначала выполняется операция, затем увеличение/уменьшение.
        System.out.println(i++); //i = 1, напечатает 0 (пост-инкремент)
        System.out.println(++i); //i = 2, напечатает 2 (пре-инкремент)
        System.out.println(i--); //i = 1, напечатает 2 (пост-декремент)
        System.out.println(--i); //i = 0, напечатает 0 (пре-декремент)

        //-----------------------------------------Условные операторы-----------------------------------------
        System.out.println("\n->Контролирующие операторы");

        // Оператор if такой же, как и в С.
        int j = 10;
        if (j == 10) {
            System.out.println("Я напечатаюсь!");
        } else if (j > 10) {
            System.out.println("Я нет.");
        } else {
            System.out.println("И я тоже нет.");
        }

        // Switch Case
        // switch работает с типами byte, short, char и int.
        // Также он работает с перечислениями,
        // классом String (с Java 7) и с некоторыми классами-обертками над
        // примитивными типами: Character, Byte, Short и Integer.
        int month = 3;
        String monthString;
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            default:
                monthString = "Другой месяц";
                break;
        }
        System.out.println("Результат Switch Case: " + monthString);

        //-----------------------------------------Цикличные операторы----------------------------------------
        int fooWhile = 0;
        while (fooWhile < 100) {
            // System.out.println(fooWhile);
            // Увеличить счетчик.
            // Будет пройдено 100 итераций, fooWhile 0,1,2...99
            fooWhile++;
        }
        System.out.println("Значение fooWhile: " + fooWhile);

        // Цикл Do While.
        int fooDoWhile = 0;
        do {
            // System.out.println(fooDoWhile);
            // Увеличить счетчик.
            // Будет пройдено 100 итераций, fooDoWhile 0->99
            fooDoWhile++;
        } while (fooDoWhile < 100);
        System.out.println("Значение fooDoWhile: " + fooDoWhile);

        // Цикл for.
        int fooFor;
        // Структура цикла for => for(<начальное_состояние>; <условие>; <шаг>)
        for (fooFor = 0; fooFor < 10; fooFor++) {
            // System.out.println(fooFor);
            // Пройдет 10 итераций., fooFor 0->9
        }
        System.out.println("Значение fooFor: " + fooFor);

        // Цикл For Each
        // Автоматический проход через массив или список объектов.
        int[] fooList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Структура цикла for each => for(<объект> : <объект_массив>)
        // читается как: для каждого объекта в массиве
        // заметка: тип объекта должен совпадать с типом массива.

        for (int bar : fooList) {
            System.out.println(bar);
            //Пройдет 9 итераций и напечатает 1-9 на новых строках.
        }

        //-----------------------------------------Тернарный оператор-----------------------------------------
        // Вы можете использовать этот синтаксис для быстрого присвоения
        // или логических переходов.
        // Читается так: "Если (условие) истинно, использовать <значение 1>,
        // в ином случае, использовать <значение 2>"
        int foo = 5;
        String bar = (foo < 10) ? "A" : "B";
        System.out.println(bar); // Напечатает А, потому что условие истинно
    }
}

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла" + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Итерация цикла" + i);

        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла" + i);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла" + i);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i+ "Год является високосным");
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        for (int i = 7; i<=98; i = i+7) {
            System.out.println( "Интерация цикла"+i);
        }
    }
    public static void  task7(){
        System.out.println("Задача 7");
    for (int i = 2; i <=512; i = i*2) {
        System.out.println("Интерация цикла" + i);
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i<12; i++) {
            total = total + accumulation;
            System.out.println("Месяц" + i + "сумма накоплений" + total + "рублей");
        }
            System.out.println(total);
        }
        public static void task9(){
            double accumulation = 29000;
            double total = 0;
            for (int i = 0; i<12; i++) {
                total = total + total/100;
                total = total + accumulation;
                System.out.println("Месяц" + i + "сумма накоплений" + total + "рублей");
            } System.out.println(total);
        }
        public static void  task10() {
        int number = 2;
        int numberNext = 0;
        for (int i = 1; i<=10; i++) {
            numberNext = number * i;
            System.out.println(number+"*"+i+"="+numberNext);
        }

    }
    }

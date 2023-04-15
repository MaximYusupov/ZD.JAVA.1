import exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Получаем ввод с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер case для выполнения задания: ");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:                 // 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),
                Ex1.run();
                break;
            case 2:                 // 2. Вычислить n! (произведение чисел от 1 до n)
                Ex2.run();
                break;
            case 3:                 // 3. Вывести все простые числа от 1 до 1000 простое число - то
                                    // число которое делится без остатка только на 1 и на само себя
                                    // (1 - это не простое число)
                Ex3.run(1000);
                break;
            case 4:                 // 4. Реализовать простой калькулятор
                Ex4.run();
                break;
        }
    }
}
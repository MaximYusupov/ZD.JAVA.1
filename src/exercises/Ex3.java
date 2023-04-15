package exercises;

public class Ex3 {
    public static void run(int N) {

        int[] numbers = new int[N + 1]; // формируем и заполняем массив
        for (int i = 2; i <= N; i++) { // заполняем с 2, так как 1 не является простым числом
            numbers[i] = i;
        }

        for (int i = 2; i <= N; i++) {
            // если элемент массива не нулевой, то удаляем из массива все элементы, кратные этому значению
            // под "удалением" понимаем приравнивание к нулю
            if (i != 0){
                int j = 2;
                while (i*j <= N){
                    numbers[i*j] = 0;
                    j++;
                }
            }
        }

        for (int number : numbers) { // выводим то, что осталось ненулевое в массиве
            if (number != 0){
                System.out.println(number);
            }
        }

    }
}

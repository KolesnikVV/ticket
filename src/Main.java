//- Задача
//
//        Необходимо реализовать следующий метод:
//
//        1. Получаем на входе массив чисел.
//
//        2. Все четные числа увеличиваем на единицу.
//
//        3. Возвращаем кусок списка с 3-го по 7-й элемент.
public class Main {
    static void calculateArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int value = arr[i];
                value += 1;
                arr[i] = value;
            }
            if (i >= 2 && i <= 7) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        calculateArr(arr);
    }
}
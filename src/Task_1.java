public class Task_1 {
    public static void main(String[] args) {

        int numArray[] = {5, 15, 32, 106, 73, 11, 94, 45, 58, 66};

        int maximum = numArray[0];  // присваиваем переменной первому элементу массива

        int maximumMinusOne = numArray[0];

        System.out.println("Полученный массив: ");

        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");   // обходим массив с помощью for и выводим на печать
        }

        for (int i = 0; i < numArray.length; i++) {   // при обходе, если элемент массива больше переменной maximum
            if (numArray[i] > maximum) {              // тогда переменной maximumMinusOne присваиваем значение хранящееся
                maximumMinusOne = maximum;            // maximum, а переменной maximum новое наибольшее значение массива
                maximum = numArray[i];
            } else if (numArray[i] > maximumMinusOne && numArray[i] != maximum) {
                maximumMinusOne = numArray[i];                 // так же при условии текущий элемент массива больше maximumMinusOne
            }                                                  // и текущий элемент не равен maximum, то текущий элемент равен maximumMinusOne
        }
        System.out.println("\nВторое по величине число: " + maximumMinusOne);
    }
}

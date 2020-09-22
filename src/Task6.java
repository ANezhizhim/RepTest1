import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int int_a;
        String description = "Нулевое число ";
        System.out.println("Введите целое число: ");
        Scanner intScan = new Scanner(System.in);
        int_a = intScan.nextInt();
        //Определяем нерваенство нулю, описание числа по умолчанию - нулевое число
        if (int_a != 0) {
            //Определяем знак числа
            if (int_a < 0) {
                description = "Отрицательное ";
            } else if (int_a > 0) {
                description = "Положительное ";
            }
            //Определяем четность числа
            if (Math.abs(int_a % 2) > 0) {
                description += "нечетное число";
            } else {
                description += "четное число";
            }

        }
        System.out.println(description );



        /*
        if (intA < 0) {
            if (intA % 2 < 0) {
                System.out.println("Отрицательное нечетное число");
            } else
                System.out.println("Отрицательное четное число");
        } else if (intA > 0) {

            if (intA % 2 > 0) {
                System.out.println("Положительное нечетное число");
            } else
                System.out.println("Положительное четное число");
        } else System.out.println("Нулевое число");
        */
    }


}

/* Замечание:
•	Задание 6: У Вас смешана логика определения знака числа с его четностью.
Если вдруг потребуется выводить еще какую-то дополнительную информацию, то так же придется дорабатывать
все те if которые у Вас написаны. Нужно подумать над изменением логики, чтобы разнести
определение положительности и отрицательности от четности и нечетности.

Задание:
 Ввести целое число в консоли. Вывести его строкуописание вида «отрицательное четное число»,
«нулевое число», «положительное нечетное число» и
т. д.

 */
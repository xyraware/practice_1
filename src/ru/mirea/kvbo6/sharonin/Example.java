import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class Example {
        public static void main(String[] args){
            //создать целочисленный массив как в си
            int array1[]={8,2,8,4,6,1,57,23,82,4};//массивы для первого и второго заданий соотвественно
            int sum1=0,sum2=0,j=0;//переменные для вычисления сумм в первом и втором задании, счетчик для второго задания
            System.out.println("Задание 3.Массив чисел создается с помощью инициализации, вводятся и считается в цикле сумма" +
                    " элементов целочисленного массиаа, \nа также среднее арифметическое его элементов Использовать цикл for." +
                    "\nСумма массива "+ Array.summa1(array1)+
                    "\nСреднее арифметичсекое значение данного массива "+Array.srdn(array1)+"" +
                    "\nЗадание 4. массив чисел вводится пользователем, считается сумма его элементов с помощью do,while,найти макимальный и минимальный элемент. " +
                    "\nВведите количество эелементов массива: ");
            Scanner input=new Scanner(System.in);//объявление сканера для считывания с консоли элементов
            int size=input.nextInt();
            int array2[]=new int[size];
            System.out.println("\nВведите элементы массива: ");
            for(int i=0;i<size;i++){
                array2[i]=input.nextInt();//Заполняем массив элементами, введенными с клавиатуры (только целые числа)
            }
            System.out.println("\nЭлементы массива введены");
            System.out.println("\nСумма введенного массива: "+Array.summa2(array2)+
                    "\nМинимальное значение "+Array.getMin(array2)+
                    "\nМаксимальное значение: "+Array.getMax(array2)+"" +
                    "\n6.Написать программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда");
            for(int i=1;i<11;i++) {
                System.out.println(1./i);
            }
            System.out.println("\n7.Написать программу, которая с помощью метода класса, вычисляет факториал числа (использовать управляющую констркцию цикла), проверить работу метода\nВведите число:");
            int fact=input.nextInt();//только целые числа
            System.out.println("\nФакториал данного числа: "+Factorial.calculateFactorial(fact));
    }



}



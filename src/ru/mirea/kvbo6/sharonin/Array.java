package ru.mirea.kvbo6.sharonin;

import java.util.Arrays;

public class Array{
    public static int summa1(int[] b){//сумма массива
        int sum=0;
        for(int i=0;i<b.length;i++){
            sum=sum+b[i];
        }
        return sum;
    }
    public static int summa2(int[] b) {//сумма массива
        int sum2=0,j=0;
        do {
            sum2 = sum2 + b[j];//вычисляем сумму элементов массива для второго задания
            j++;
        } while (j < b.length - 1);
        return sum2;
    }
    public static double srdn(int[] b){//Среднее арифметическое
        return ((summa1(b)*0.1)/b.length)*10;
    }
    public static int getMin(int[] inputArray) {
        int minValue=inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i]<minValue){
                minValue=inputArray[i];
            }
        }
        return minValue;
    }
    public static int getMax(int[] inputArray) {
        int maxValue=inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i]>maxValue){
                maxValue=inputArray[i];
            }
        }
        return maxValue;
    }
}

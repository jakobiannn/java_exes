package com.company;

public class Main {


    public static int rnd(int max) //Нашел в интернете, чтобы придать случайные значения
    {
        return (int) (Math.random() * ++max);
    }

    public static void main(String[] args) {
        int[] SArr = new int[15]; //создаем массив из 15 ячеек


        for (int i = 0; i < 15; i++) { //с помощью метода, определенного выше, придаем каждому элементу случайное значение
            final int rnd = rnd(15);
            SArr[i] = rnd;
            System.out.print(SArr[i] + " ");
        }

        int maxElem = SArr[0]; //создадим переменную, служащую "счетчиком" для максимального элемента, придадим ей значение 0
        int n = SArr.length; //переменная, обозначающая размерность массива, будет уменьшаться с каждым новой итерацией цикла
        int Bubble, maxIndex = 0; //переменные для избежания потери значений

        for (int i = n; i > 0; i--) { //первый цикл отвечает за повторение прогона элементов по массиву
            for (int j = 0; j < n; j++) { //второй цикл отвечает за сам прогон
                if (SArr[j] > maxElem){ //находим максимальный элемент и индекс массива
                    maxElem = SArr[j];
                    maxIndex = j;}
            }
            //поменяем значения местами с помощью других переменных во избежание потерь значений
            Bubble = SArr[i - 1];
            SArr[i - 1] = SArr[maxIndex];
            SArr[maxIndex] = Bubble;

            //обнулим значения для новых циклов, и уменьшим размерность прогона массива
            maxElem = SArr[0];
            maxIndex = 0;
            n--;
        }

        System.out.println();
        for(int i: SArr)
            System.out.print(i + " ");

    }
}
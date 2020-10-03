package com.company;
//    7. Фотоаппарат
//    Фотоаппарат имеет две кнопки: «фото» и «перемотка». Фотоплёнка имеет ёмкость 10 кадров.
//    Нажатием на кнопку «фото» фотоаппарат делает снимок.
//    При нажатии на кнопку «перемотка» фотоаппарат прокручивает плёнку на один кадр вперёд.
//    Без перемотки делать снимок фотоаппарат не может (кроме первого кадра). Без снимка фотоаппарат
//    также не может сделать перемотку.
//    После снимка последнего, 10 кадра, перемотка не работает, пока не будет заменена фотоплёнка.
//    Пока не будет отснята вся плёнка, её также нельзя заменить.
//    Если фотоаппарат пуст (нет плёнки), то нажатие на кнопки ничего не дает. Начальная конфигурация: фотоаппарат пуст.

public class Main {
    static class Photo {
        int CountPhotos; //текущий счетчик сделатнных фотографий (фотопленка)
        boolean isTake; //переменная, обозначающая был ли сделан снимок => нужна ли перемотка
        boolean isIn; //переменная, обозначающая находится ли пленка в фооаппарате

        void takePh() { //делаем снимок
            if (!isIn) { //т.к. ничего не должно происходить, просто завершим выполнение метода
                System.out.println("'Ничего не происходит'");
                return;
            }
            if (!isTake) {
                isTake = true;
                System.out.println("Щелк!");
            }
            else System.out.println("Ошибка: Требуется перемотка.");
        }

        void rewind(){ //перемотка
            if (isTake && isIn) {
                if (CountPhotos < 10){
                CountPhotos++;
                isTake = false;
                System.out.println("'Пленка перемотана'");
                }
                else System.out.println("Ошибка: Требуется заменить фотопленку.");
            }
            else System.out.println("Ошибка: Требуется сделать снимок.");
        }

        void replace(){ //замена пленки
            if (CountPhotos == 10 || CountPhotos == 0) {
                CountPhotos = 0;
                isIn = true;
                System.out.println("'Пленка заменена'");
            }
            else System.out.println("Ошибка: пленка не отснята до конца.");
        }

        Photo (int CountPhotos,boolean isTake,boolean isIn){
            this.CountPhotos = CountPhotos;
            this.isTake = isTake;
            this.isIn = isIn;
        }
    }
    public static void main(String[] args) {
        Photo Canon = new Photo(0, false,false);
        //проверим работу методов
        //1) Попробуем сделать фото без замены пленки
        Canon.takePh();
        //2) Вставим пленку и сделаем снимок, и ещё один без перемотки
        Canon.replace();
        Canon.takePh();
        Canon.takePh();
        // 3) Сделаем ещё 11 снимков c перемоткой, но без замены пленки
        int i = 0;
        while (i < 11){
            Canon.takePh();
            Canon.rewind();
            i++;
        }
    }
}

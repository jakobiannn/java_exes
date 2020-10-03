package com.company;

interface MoveThings{ //Описываем основные принципы движения
    void BeginMove();
    void EndMove();
    void UpSpeed(int Speed);
    void SlowDown(int Slow);
}
class Move implements MoveThings { //Общий класс движений
    static int total;
    @Override //реализуем методы, приведенные в интерфейсе
    public void BeginMove() {
        System.out.println("Оттолкнулись от точки опоры");
    }

    @Override
    public void EndMove() {
        System.out.println("Достигли нужного места");
    }

    @Override
    public void UpSpeed(int Speed) {
        System.out.println("Повысисли скорость на " + Speed +" км/ч");
    }

    @Override
    public void SlowDown(int Slow) {
        System.out.println("Понизили скорость на " + Slow +" км/ч");
    }

    Move(){
        total++;
    }
}

abstract class MovetoEarh extends Move { //Абстрактный класс движения по земле

    public void BeginMove() {
        System.out.println("Отталкиваемся от точки опоры");
    }

    public void EndMove() {
        System.out.println("Достигли нужного места на суше");
    }

    abstract void MoveProcess();

}

class Foot extends Move{ //Движение по земле с помощью ног

    void MoveProcess(){
        System.out.println("Топ топ");
    }

    Foot(){total++;}
}

class Wheel extends Move{ //движение с помощью колес
    void MoveProcess(){
        System.out.println("Крутимся");
    }

    @Override
    public void BeginMove() {
        System.out.println("Создали тягу");
    }

    @Override
    public void UpSpeed(int Speed) {
        System.out.println("Нажали на педаль газа");
        System.out.println("Повысисли скорость на " + Speed + " км/ч");
    }

    Wheel(){total++;}
}

abstract class  MovetoWater extends Move { //новый промежуточный класс движений по воде

    static class UnderWater extends MovetoWater {  //Вложенные классы
        @Override
        public void BeginMove() {
            System.out.println("Гребем веслами");
        }
    }

    static class OverWater extends MovetoWater {
        @Override
        public void BeginMove() {
            System.out.println("Крутим винты");
        }
    }

}

class Ship extends MovetoWater { //класс кораблей

    @Override
    public void BeginMove() {
        super.BeginMove();
        System.out.println("Ловим встречный ветер");
    }

    Ship(){total++;}
}

class Submarine extends MovetoWater { //подводные лодки


    @Override
    public void EndMove() {
        super.EndMove();
        System.out.println("Включаем дигатели на заднюю тягу");
    }

    public void Search(){
        System.out.println("Смотрим в перископ");
    }

    Submarine(){total++;}
}


abstract class Fly extends Move { //Воздушные средства передвижения

    @Override
    public void BeginMove() {
        System.out.println("Установили средство передвижения на точку взлета");
        System.out.println("Завели двигатель, подали тягу");
    }

    @Override
    public void UpSpeed(int Speed) {
        System.out.println("Передивнули вперед рычаг тяги");
        super.UpSpeed(Speed);
    }

    @Override
    public void SlowDown(int Slow) {
        System.out.println("Передивнули назад рычаг тяги");
        super.SlowDown(Slow);
    }

    abstract void goUp();
    abstract void goDown();
}

class Reactive extends Fly{ //Реактивные двигатели

    void OverSound(){
        System.out.println("Переходим на сверхзвуковую скорость");
    }
    Reactive(){total++;}

    void goUp(){
        System.out.println("Тянем на себя рычаг");
    }
    void goDown(){
        System.out.println("Тянем от себя рычаг");
    }
}

class ball extends Fly {

    @Override
    public void BeginMove() {
        System.out.println("Нагреваем купол");
        super.BeginMove();
    }


    void goUp(){
        System.out.println("Подаем огонь в купол");
    }
    void goDown(){
        System.out.println("Прекращаем периодически подавать огонь");
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

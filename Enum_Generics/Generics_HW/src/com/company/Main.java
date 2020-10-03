package com.company;


class Box<T>  {
    T Thing;
    
   void PutIn(T Thing){
       if (this.Thing != null){
           System.out.println("Ошибка: В коробке уже есть вещь");
           return ;
       }
        this.Thing = Thing;
    }

    T OutPut(){
       if (this.Thing == null) {
           System.out.println("Ошибка: В коробке пусто");
           return null;
       }
       else
        return this.Thing;

    }

    void DeleteFrom(){
       if (this.Thing == null)
           System.out.println("Ошибка: В коробке пусто");
       else
        this.Thing = null;
    }
}

class Utils extends Box {

 public <T> void print(Object Smth){
     Box<T> box = new Box<>();
     box.PutIn((T) Smth);
     System.out.println(box.Thing);
     System.out.println(box.OutPut());
     box.DeleteFrom();
     System.out.println(box.Thing);
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public <T> void Random(Object Thing,Object t2,Object t3){
        Box<T> box = new Box<>();

        int rnd = rnd(0,2);

        switch (rnd){
            case 0:{
                box.PutIn((T) Thing);
                System.out.println(box.OutPut());
            }
                break;
            case 1: {
                box.PutIn((T) t2);
                System.out.println(box.OutPut());
            }
                break;
            case 2: {
                box.PutIn((T) t3);
                System.out.println(box.OutPut());
            }
                break;

        }
    }


}

public class Main {



    public static void main(String[] args) {
        //проверим корректность работы методов
        Box<Integer> box = new Box<>();
        Utils test = new Utils();
        test.print(5);

        test.Random(2,"Hello", 2.34);

    }
}

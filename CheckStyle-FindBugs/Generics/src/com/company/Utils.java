package com.company;

class Utils extends Box {

    <T> void print(final Object smth) {

        Box<T> box = new Box<>();

        box.putIn((T) smth);

        box.outPut();

        box.deleteFrom();

    }

    private static int rnd(int min, int max) { //cant be final
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

     <T> void random(final Object thing, final Object t2, final Object t3) {
        Box<T> box = new Box<>();

        int rnd = rnd(0, 2);

        switch (rnd) {
            case 0:
                    box.putIn((T) thing);
                    box.outPut();

            break;
            case 1:
                    box.putIn((T) t2);
                    box.outPut();

                    break;
            case 2:
                    box.putIn((T) t3);
                    box.outPut();
                    break;
            default:
        }
    }
}

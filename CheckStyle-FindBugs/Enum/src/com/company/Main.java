/**
 * Enum realisation
 * @version 27.10.19
 * @author Alexey Chuyko.
 */
package com.company;

final class Main {

    private Main() {
        //not used
    }

    private static int rnd(int min, int max) { //не могут быть final
        max -= min;
        return  (int) (Math.random() * ++max) + min;
    }


    public static void main(final String[] args) {

        final int rnd = rnd(0, 6);

        final int case1 = 0;
        final int case2 = 1;
        final int case3 = 2;
        final int case4 = 3;
        final int case5 = 4;
        final int case6 = 5;
        final int case7 = 6;

        switch (rnd) {
            case case1:
                Utils.print("This is RED", Color.ANSI_RED);
                break;
            case case2:
                Utils.print("This is GREEN", Color.ANSI_GREEN);
                break;
            case case3:
                Utils.print("This is YELLLOW", Color.ANSI_YELLOW);
                break;
            case case4:
                Utils.print("This is BLUE", Color.ANSI_BLUE);
                break;
            case case5:
                Utils.print("This is PURPLE", Color.ANSI_PURPLE);
                break;
            case case6:
                Utils.print("This is CYAN", Color.ANSI_CYAN);
                break;
            case case7:
                Utils.print("This is WHITE", Color.ANSI_WHITE);
                break;
            default:
                System.out.println("Error");
        }

    }

}

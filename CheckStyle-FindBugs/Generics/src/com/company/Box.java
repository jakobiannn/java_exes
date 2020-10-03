package com.company;

/**
 * Absract generic "box".
 * argument "thing" mean some different
 * @param <T> data type object,
 * which should be put in or take on box.
 * @version 29.10.19
 * @author Alexey Chuyko
 */
class Box<T>  {
    /**
     * @param thing using for
     * initializating every data types
     */
    private T thing;

    void putIn(final T inBox) {
        if (this.thing != null) {
            System.out.println("Box isnt empty");
            return;
        }
        this.thing = inBox;
        System.out.println("Box contain " + this.thing);
    }

    T outPut() {
        if (this.thing == null) {
            System.out.println("Error: Box is empty");
            return null;
        } else {
            System.out.println("From box taken: " + this.thing);
            return this.thing;
        }

    }

    void deleteFrom() {
        if (this.thing == null) {
            System.out.println("Error: Box already empty");
        } else {
            this.thing = null;
        }
        System.out.println("Box cleared");
    }
}

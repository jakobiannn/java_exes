
import org.junit.Test;

public class TestSort {

    /* Первый тест
     * Проверим сортировку,
     * поместив в неё массив
     * единичной размерности
     */
    @Test
    public void test1() {
        Sort sort = new Sort();
        int[] testAr = new int[1];

        sort.sortAr(testAr);
    }

    /* Массив из одинаковых
     * значений
     */
    @Test
    public void test2() {
        Sort sort = new Sort();
        int[] testAr = {1,1,1,1,1,1,1,1,
                        1,1,1,1,1,1,1};

        sort.sortAr(testAr);
    }

    /* Массив из элементов,
     * больших чем максимальный размер
     * при генерации
     * массива через перечисление элементов
     */
    @Test
    public void test3() {
        Sort sort = new Sort();
        int[] testAr = {1,1,1,1,1,1,1,1,
                        1,1,1,1,1,1,1,1};

        sort.sortAr(testAr);
    }


}

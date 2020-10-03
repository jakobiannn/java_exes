public class Main {

    public static void main(String[] args) {

        int[] genAr;

        Sort sort = new Sort();

        genAr = sort.generateArr();

        genAr = sort.sortAr(genAr);

        System.out.println();


        for (int num: genAr) {
            System.out.print(num + " ");
        }
    }
}
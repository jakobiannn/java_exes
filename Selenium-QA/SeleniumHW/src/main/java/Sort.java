class Sort {

    private static int rnd(int max) {
        double var10000 = Math.random();
        ++max;
        return (int)(var10000 * (double)max);
    }

    private static final int MAX_SIZE = 15;

    int[] generateArr() {
        int[] SArr = new int[MAX_SIZE];

        int maxElem;
        int n;

        for (maxElem = 0; maxElem < 15; ++maxElem) {
            n = rnd(15);
            SArr[maxElem] = n;
            System.out.print(SArr[maxElem] + " ");
        }
        return SArr;
    }

    int[] sortAr(int[] SArr) {

        int maxElem = SArr[0];
        int n = SArr.length;
        int maxIndex = 0;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (SArr[j] > maxElem) {
                    maxElem = SArr[j];
                    maxIndex = j;
                }
            }

            int Bubble = SArr[i - 1];
            SArr[i - 1] = SArr[maxIndex];
            SArr[maxIndex] = Bubble;
            maxElem = SArr[0];
            maxIndex = 0;
            n--;
        }

        return SArr;
    }
}

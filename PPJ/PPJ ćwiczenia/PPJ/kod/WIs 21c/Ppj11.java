public class Main {

    public static void main(String[] args) {
        int[] tab = {5, 3, 1, 4, 2};

        for (int j = 1; j < tab.length + 1; j++) {
            for (int i = 0; i < tab.length - j; i++) {
                if (tab[i] > tab[i + 1]) {
                    int tmp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = tmp;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();

        int[][] arr = {
                {1,3},
                {3,4,5,8},
                {6,8},
                {1,9,6}
        };

        int[] naj = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            naj[i] = max;
        }
        for (int i = 0; i < naj.length; i++) {
            System.out.print(naj[i] + " ");
        }

        System.out.println();
        int[] crr = { 2, 3, 9 };
        int[] brr = { 2, 3, 6, 5 };

        int[] min, max;
        if (crr.length > brr.length) {
            min = brr;
            max = crr;
        } else {
            max = brr;
            min = crr;
        }
        int[] wrr = new int[max.length];
        for (int i = 0; i < min.length; i++) {
            wrr[i] = crr[i] + brr[i];
        }
        for (int i = min.length; i < max.length; i++) {
            wrr[i] = max[i];
        }
        for (int i = 0; i < wrr.length; i++) {
            System.out.print(wrr[i] + " ");
        }
        System.out.println();



    }
}

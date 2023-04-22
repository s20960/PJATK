public class Main {

    public static void main(String[] args) {
        {
            int[][] arr = {
                    {1, 3},
                    {3, 4, 5, 8},
                    {6, 8},
                    {1, 9, 6}
            };
            int[] naj = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                int max = arr[i][0];
                for (int j = 1; j < arr[i].length; j++) {
                    if (arr[i][j] > max)
                        max = arr[i][j];
                }
                naj[i] = max;
                System.out.print(naj[i] + " ");
            }
            System.out.println();
        }
        {
            int[] arr = {2, 3, 6, 5};
            int[] brr = {2, 3, 9};
            int[] min, max;
            if (arr.length > brr.length) {
                min = brr;
                max = arr;
            } else {
                min = arr;
                max = brr;
            }
            int[] wynik = new int[max.length];

            for (int i = 0; i < wynik.length; i++) {
                wynik[i] = max[i] + (i < min.length ? min[i] : 0);
                System.out.print(wynik[i] + " ");
            }
            System.out.println();
        }
        char[][] arr = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(
                        arr[i % 2 == 0 ? j : arr.length - 1 - j][i]
                );
            }

        }


    }
}

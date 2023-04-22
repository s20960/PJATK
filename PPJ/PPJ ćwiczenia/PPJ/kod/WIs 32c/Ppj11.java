public class Main {

    public static void main(String[] args) {
        int[][] tab = {
                new int[2],
                new int[4],
                new int[2],
                new int[3]
        };
        int[][] tab2 = new int[4][];
        {
            int[][] arr = {
                    {1, 3},
                    {3, 4, 5, 8},
                    {6, 8},
                    {1, 9, 6}
            };
            int[] max = new int[arr.length];
            //For po wierszach
            for (int i = 0; i < arr.length; i++) {
                //arr[i][arr[i].length - 1]; //ostatni element każdego wiersza
                int naj = arr[i][0];
                //For po elementach w wierszu i-tym
                for (int j = 1; j < arr[i].length; j++) {
                    if (naj < arr[i][j]) {
                        naj = arr[i][j];
                    }
                }
                max[i] = naj;
                System.out.print(max[i] + " ");
            }
            System.out.println();
        }

        {
            int[] crr = {2, 3, 9};
            int[] brr = {2, 3, 6, 5};
            int[] min, max;
            if (crr.length > brr.length) {
                min = brr;
                max = crr;
            } else {
                max = brr;
                min = crr;
            }
            int[] wynikowa = new int[max.length];
            for (int i = 0; i < min.length; i++) {
                wynikowa[i] = min[i] + max[i];
            }
            for (int i = min.length; i < wynikowa.length; i++) {
                wynikowa[i] = max[i];
            }
            ////////////////////////////////////////////////
            for (int i = 0; i < wynikowa.length; i++) {
                wynikowa[i] = max[i] + (i < min.length ? min[i] : 0);

            }

            char[][] arr = {
                    {'a', 'b', 'c'},
                    {'d', 'e', 'f'},
                    {'g', 'h', 'i'},
            };
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(
                            arr[i % 2 == 0 ? j : arr.length - 1 - j][i] + " "
                    );
                }
            }

        }



    }
}

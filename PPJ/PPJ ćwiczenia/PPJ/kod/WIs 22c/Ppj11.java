public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {1,3},
                {3,4,5,8},
                {6,8},
                {1,9,6}
        };
        int[] naj = new int[arr.length];
        int tempNaj;

        for (int i = 0; i < arr.length; i++) {
            tempNaj = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > tempNaj) {
                    tempNaj = arr[i][j];
                }
            }
            naj[i] = tempNaj;
        }
        for (int i = 0; i < naj.length; i++) {
            System.out.print(naj[i] + " ");
        }
        System.out.println();

        int[] crr = { 2, 3, 9 };
        int[] brr = { 2, 3, 6, 5 };

        int[] wrr = new int[brr.length > crr.length ? brr.length : crr.length];
        int min = brr.length < crr.length ? brr.length : crr.length;
        for (int i = 0; i < min; i++) {
            wrr[i] = crr[i] + brr[i];
        }
        for (int i = min; i < wrr.length; i++) {
            wrr[i] = brr.length > crr.length ? brr[i] : crr[i];
        }

        for (int i = 0; i < wrr.length; i++) {
            System.out.print(wrr[i] + ", ");

        }




    }
}

package U8T2;

public class FunWith2DArrays {
    public static double average (int[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum / (arr.length * arr[0].length);
    }

    public static int edgeSum (int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[0][i];
        }

        for (int j = 1; j < arr.length - 1; j++) {
            sum += arr[j][0];
            sum += arr[j][arr[j].length - 1];
        }

        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[arr.length - 1][i];
        }
        return sum;
    }

    public static int[] indexFound (String[][] arr, String target) {
        int[] newarr = new int[2];
        int[] notfoundarr = {-1, -1};
        boolean found = false;
        for (int j = 0; j < arr[0].length; j++) { 
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j].equals(target)) {
                    newarr[0] = i;
                    newarr[1] = j;
                    found = true;
                    return newarr;
                }
            }
        }
        if (!found) {
            return notfoundarr;
        }
        return newarr;
    }

    public static int[][] split (int[][] arr, int row, int column) {
        int[][] newarr = new int[row + 1][column + 1];
        int[][] empty = new int[0][0];
        if (row > arr.length - 1 || column > arr[0].length - 1) {
            return empty;
        }
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < column + 1; j++) {
                newarr[i][j] = arr[i][j];
            }
        }
        return newarr;
    }

    public static int[][] invert (int[][] arr) {
        int[][] newarr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newarr[j][i] = arr[i][j];
            }
        }
        return newarr;
    }
    
}

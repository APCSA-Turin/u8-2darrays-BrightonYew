public class FunWith2DArrays {

    public static int totalElements (int[][] ints) {
        return ints.length * ints[0].length;
    }

    public static void fourCorners (String[][] strarr) {
        System.out.println(strarr[0][0]);
        System.out.println(strarr[0][strarr[0].length - 1]);
        System.out.println(strarr[strarr.length - 1][0]);
        System.out.println(strarr[strarr.length - 1][strarr[0].length - 1]);
    }

    public static void swapFrontAndBackRows (String[][] strarr) {
        String[] temp = strarr[0];
        strarr[0] = strarr[strarr.length - 1];
        strarr[strarr.length - 1] = temp;
    }
    
}

public class runner {
    public static void main(String[] args) {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, //a
                                    {"Brian", "Elenor", "Harry", "Lenny"},
                                    {"Cathy", "Fred", "Jill", "Matt"}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println("");
        }

        seatingChart[1][2] = "Paul"; //b
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println("");
        }

        String tempStr = seatingChart[0][0]; //c
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = tempStr;

        System.out.println();

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 4; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println("");
        }

        String[] temparr = seatingChart[0]; //d
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temparr;
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];  

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }

        arr1[0][0] = 1; 
        arr1[0][1] = 2; 
        arr1[0][2] = 3; 
        arr1[1][0] = 4; 
        arr1[1][1] = 5; 
        arr1[1][2] = 6; 
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }

        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}
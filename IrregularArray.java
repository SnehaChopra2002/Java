package Java;

public class IrregularArray {
    public static void main(String[] args) {
        int[][] irregularArray = {
                { 1 },
                { 2, 3 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                System.out.print(irregularArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

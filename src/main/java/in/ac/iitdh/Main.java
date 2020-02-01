package in.ac.iitdh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[][] dm = {
//		{ 68, 38, 9, 60, 46, 58, 83, 87, 84, 20 },
//		{ 53, 4, 16, 4, 44, 72, 34, 97, 69, 5 },
//		{ 21, 2, 45, 55, 34, 15, 2, 13, 12, 51 },
//		{ 8, 93, 22, 66, 25, 9, 59, 71, 12, 95 },
//		{ 42, 35, 33, 23, 3, 8, 8, 50, 23, 95 },
//		{ 74, 37, 15, 21, 36, 49, 80, 55, 79, 53 },
//		{ 21, 97, 55, 12, 25, 67, 10, 65, 2, 49 },
//		{ 8, 48, 1, 92, 8, 76, 41, 32, 87, 36 },
//		{ 32, 73, 71, 47, 94, 92, 16, 97, 5, 4 },
//		{ 58, 37, 54, 52, 84, 16, 34, 5, 72, 26 } };

        // Input n to create n/n Metrics
        /*
        Then Input the value in this format
        4
        1   2   3   4
        5   6   7   8
        1   2   3   4
        5   6   7   8
        */
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] dm = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dm[i][j] = sc.nextInt();
        sc.close();


        long time = System.currentTimeMillis(); // Start time recording
        Hungarian hungarian = new Hungarian(dm);
        System.out.println(String.format("Total time: %dms\n", System.currentTimeMillis() - time)); // Stop time recording and display time consumed

        // Display result on screen
        int[] result = hungarian.getResult();
        for (int i = 0; i < result.length; i++)
            System.out.println(String.format("Row%d => Col%d (%d)", i + 1, result[i] + 1, dm[i][result[i]])); // Rowi => Colj (value)

        System.out.println(String.format("\nTotal: %d", hungarian.getTotal())); // Total
    }
}
package in.ac.iitdh;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class HungarianTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void Test1() {
        int[][] matrixInput = {
                {2500, 4000, 3500},
                {4000, 6000, 3500},
                {2000, 4000, 2500}
        };

        int[] Answer = {1, 2, 0};

        Hungarian hungarian = new Hungarian(matrixInput);

        assertArrayEquals(hungarian.getResult(), Answer);

    }

    @Test
    public void Test2() {
        int[][] matrixInput = {
                {1500, 4000, 4500},
                {2000, 6000, 3500},
                {2000, 4000, 2500}
        };

        int[] Answer = {1, 0, 2};

        Hungarian hungarian = new Hungarian(matrixInput);

        assertArrayEquals(hungarian.getResult(), Answer);

    }
    @Test
    public void Test3() {
        int[][] matrixInput = {
                { 68, 38, 9, 60, 46, 58, 83, 87, 84, 20 },
                { 53, 4, 16, 4, 44, 72, 34, 97, 69, 5 },
                { 21, 2, 45, 55, 34, 15, 2, 13, 12, 51 },
                { 8, 93, 22, 66, 25, 9, 59, 71, 12, 95 },
                { 42, 35, 33, 23, 3, 8, 8, 50, 23, 95 },
                { 74, 37, 15, 21, 36, 49, 80, 55, 79, 53 },
                { 21, 97, 55, 12, 25, 67, 10, 65, 2, 49 },
                { 8, 48, 1, 92, 8, 76, 41, 32, 87, 36 },
                { 32, 73, 71, 47, 94, 92, 16, 97, 5, 4 },
                { 58, 37, 54, 52, 84, 16, 34, 5, 72, 26 }
        };

        int[] Answer = {2, 1, 6, 5, 4, 3, 8, 0, 9, 7};

        Hungarian hungarian = new Hungarian(matrixInput);

        assertArrayEquals(hungarian.getResult(), Answer);

    }
}

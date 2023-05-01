package co.us.interview;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
==========
#
#  Online auction graph display
#  x axis is time
#  y axis is price
#  Title item
#
#  Given a two-dimension array graph the price over time
#
#     +-----+-----+-----+-----+-----+-----    +
#     +                             *     +
#     +                                   +
#     +                       *           +
#   $ +                                   +
#     +                                   +
#     +           *                       +
#     +     *                             +
#     +                 *                 +
#     +-----+-----+-----+-----+-----+-----+
#                time
#
#   max x = 5
#   max y = 8
#   data = {(1,2), (2, 3), (3, 1), (4, 6), (5, 8)}
   #data = {(1,2), (1,4), (2, 3), (3, 1), (4, 6), (5, 8)}
#
 */

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class IF01Question {
    public static void main(String[] args) {
        //   max x = 5
//   max y = 8
//   data = {(1,2), (2, 3), (3, 1), (4, 6), (5, 8)}
// create a map<int, linkedList>
// create a two D array
// plot the array

        Map <Integer, List <Integer>> coordinates = new HashMap <>();
        coordinates.put(1, Arrays.asList(2));
        coordinates.put(2, Arrays.asList(3));
        coordinates.put(3, Arrays.asList(1, 2));
        coordinates.put(4, Arrays.asList(6));
        coordinates.put(5, Arrays.asList(8));
// key - 1 = index row ( lis(2))
        int maxXCoordinate = 5;
        int maxYCoordinate = 8;


        for (int j = maxYCoordinate; j >= 0; j--) {
            for (int i = 0; i <= maxXCoordinate; i++) {

                if (i == 0 || j == 0) {
                    System.out.print("+" + " ");
                    continue;
                }
                if (coordinates.get(i) == null) {
                    System.out.print("." + " ");
                } else {
                    if (coordinates.get(i).contains(j)) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("." + " ");
                    }
                }
            }
            System.out.println();
        }

    }
}

// loop the map k 1, val[1,2]
//2d array [][]int,int
// if (i==0 || j==0)
// insert [k][j] = * else = " "
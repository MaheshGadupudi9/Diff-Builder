package co.us.interview;

public class RainWaterTrappingProblem {
    public static void main(String[] args) {
        int[] heights = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] heights2 = new int[]{9, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println("trap(heights) = " + trap(heights));
        System.out.println("trap(heights2) = " + trap(heights2));

    }

    public static int trap(int[] heights) {
        int size = heights.length;
        if (size < 3) return 0;
        int left[] = new int[size];
        for (int i = 0; i < size; i++) {
            left[i] = i == 0 ? heights[i] : Math.max(left[i - 1], heights[i]);
        }
        int right[] = new int[size];
        for (int i = 0; i < size; i++) {
            right[i] = i == (size - 1) ? heights[i] : Math.max(right[i + 1], heights[i]);
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + Math.min(right[i], left[i]) - heights[i];
        }
        return sum;
    }
}

/*
 * if first < second  : capacity 0
 *
 * */

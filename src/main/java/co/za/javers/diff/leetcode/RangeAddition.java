package co.za.javers.diff.leetcode;

public class RangeAddition {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        //[[2,2],[3,3]]
        arr[0][0]=2;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=3;
        System.out.println("maxCount  = " + maxCount(3,3,arr));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        return 0;
    }

    public int add(int a, int b){
        return a+b;
    }

    public String add(String a, int b){
        return a+b;
    }
}

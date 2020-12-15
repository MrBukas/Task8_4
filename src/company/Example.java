package company;

public class Example {
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[3] = new int[7];
        arr[3][1] = 5;
        System.out.println(arr);

        arr[1] = arr[3];

        System.out.println(arr);

        arr[1][2] = 7;
        System.out.println(arr[3][2]);
    }
}

//package company;
//
//import java.util.Scanner;
//
//public class MainOld {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 1 если ходите сдвинуть строки и 2 если столбцы");
//        int colRow = scanner.nextInt();
//        System.out.println("Введите на сколько сдвинуть +-");
//        int sdvig = scanner.nextInt();
//
//
//
//        int n = 8;
//        int[][] arr = new int[8][8];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = n*i + j;
//            }
//        }
//        printArr(arr);
//        System.out.println();
//        if (colRow != 1){
//            if (sdvig > 0){
//                for (int j = 0; j < sdvig; j++) {
//                    for (int i = 0; i < arr.length; i++) {
//                        shiftLeftColumn(arr[i]);
//                    }
//                }
//
//                //shiftLeft();
//            }else {
//                sdvig *= -1;
//                for (int j = 0; j < sdvig; j++) {
//                    for (int i = 0; i < arr.length; i++) {
//                        shiftRightColumn(arr[i]);
//                    }
//                }
//                //shiftRight();
//            }
//        }else {
//            if (sdvig > 0){
//                for (int j = 0; j < sdvig; j++) {
//                    shiftLeftRow(arr);
//                }
//
//                //shiftLeft();
//            }else {
//                sdvig *= -1;
//                for (int j = 0; j < sdvig; j++) {
//                    shiftRightRow(arr);
//                }
//                //shiftRight();
//            }
//        }
//
//        printArr(arr);
//
//    }
//
//    public static void printArr(int[][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void shiftLeftColumn(int[] a){
//        int q = a[0];
//        for (int i = 0; i < a.length - 1; i++) {
//            a[i] = a[i+1];
//        }
//        a[a.length - 1] = q;
//    }
//    public static void shiftRightColumn(int[] a){
//        int q = a[a.length - 1];
//        for (int i = a.length - 1; i > 0; i--) {
//            a[i] = a[i-1];
//        }
//        a[0] = q;
//    }
//
//    public static void shiftLeftRow(int[][] a){
//        int[] q = a[0];
//        for (int i = 0; i < a.length - 1; i++) {
//            a[i] = a[i+1];
//        }
//        a[a.length - 1] = q;
//    }
//    public static void shiftRightRow(int[][] a){
//        int[] q = a[a.length - 1];
//        for (int i = a.length - 1; i > 0; i--) {
//            a[i] = a[i-1];
//        }
//        a[0] = q;
//    }
//}

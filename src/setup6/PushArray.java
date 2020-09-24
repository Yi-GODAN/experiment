package setup6;

import java.util.Scanner;

public class PushArray {
    PushArray(int[] arr) {
        int temp;
        if (arr.length == 0) {
            System.out.println("Integer array is null");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        new PushArray(new InputArray().arrays());
    }
}

class InputArray {
    static int[] IntArray;

    public int[] arrays() {
        try {
            Scanner scann = new Scanner(System.in);
            System.out.println("please enter integer number for split space...");
            String string = scann.nextLine();
            String[] str = string.split(" ");
            IntArray = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                IntArray[i] = Integer.parseInt(String.valueOf(str[i]));
            }
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        } catch (Error e) {
            e.printStackTrace();
        }
        return IntArray;
    }
}

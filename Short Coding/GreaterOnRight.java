package zoho;

import java.util.*;

public class GreaterOnRight {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {

            int temp = arr[i];
            arr[i] = max;

            if (temp > max)
                max = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
package zoho;

import java.util.*;

public class NumberToWords {

    static String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    static String[] ten = {"", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convert(int n) {

        if (n == 0)
            return "";

        if (n < 20)
            return one[n] + " ";

        if (n < 100)
            return ten[n / 10] + " " + convert(n % 10);

        if (n < 1000)
            return one[n / 100] + " Hundred " + convert(n % 100);

        if (n < 1000000)
            return convert(n / 1000) + "Thousand " + convert(n % 1000);

        if (n < 1000000000)
            return convert(n / 1000000) + "Million " + convert(n % 1000000);

        return convert(n / 1000000000) + "Billion " + convert(n % 1000000000);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0)
            System.out.println("Zero");
        else
            System.out.println(convert(n).trim());
    }
}

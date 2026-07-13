package zoho;

public class Distance_btw_two_points {

	public static void main(String[] args) {
		
		

	}

}

/*
import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int dx = x2 - x1;
        int dy = y2 - y1;

        double distance = Math.sqrt(dx * dx + dy * dy);

        System.out.println(distance);
    }
}

*/




/*
import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int dx = x2 - x1;
        int dy = y2 - y1;

        double n = dx * dx + dy * dy;

        double guess = n;

        while (true) {
            double root = (guess + n / guess) / 2;

            if (Math.abs(root - guess) < 0.00001) {
                guess = root;
                break;
            }

            guess = root;
        }

        System.out.printf("%.5f", guess);
    }
}

*/
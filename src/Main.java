import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double width = Math.sqrt(1.0 * i);
        double length = i / width;
        double ostacha = i - width * length;
        double result = width * (length + 1) + length * (width + 1);
        if(ostacha != 0 ) {
            result = result + 2 * ostacha +1 ;
        }
        System.out.println((int) result);
    }
}

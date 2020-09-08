import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
	int a[] = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
	Arrays.stream(a).forEach(x -> System.out.printf("%4d", x));
	System.out.println();
    }
}

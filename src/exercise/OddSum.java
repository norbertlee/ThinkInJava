package exercise;

public class OddSum {
	public static void main(String[] args) {
		int i;
		int sum;
		sum = 0;
		for (i=0;i<50;i++) {
			sum += 2*i+1;
		}
		System.out.println("sum = "+sum);
	}
}

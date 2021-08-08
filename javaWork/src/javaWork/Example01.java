package javaWork;

public class Example01 {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		for(; a <= 99; a+=2) {
			sum += a;
		}
		System.out.println(sum);
	}
}

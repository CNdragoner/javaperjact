package javaWork;

public class Example03 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i = 0;i <=99;i++) {
			if(i%2 != 0) {
				sum +=i;
			}else continue;
		}
		System.out.println(sum);
	}
}

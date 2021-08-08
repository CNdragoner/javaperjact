//错误类型转化
/*public class Example01{
	public static void main(String[] args){
		int num = 4;
		byte b = num;
		System.out.println(b);
	}
}*/
//正确的类型转化
public class Example01{
	public static void main(String[] args) {
		byte a;
		int b = 298;
		a = (byte)b;
		System.out.println(a);
		System.out.println(b);
	}
}

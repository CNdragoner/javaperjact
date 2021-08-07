class Person{
	//属性
	int age; 
	String name;
	//方法
	public void speak(){
		System.out.println("我叫做" + name + ",我今年" + age + "了.");
	}
}
public class Example01{
	public static void main(String[] args){
		Person p = new Person();
		p.age = 18;
		p.name = "王文龙";
		p.speak();	
	}	
}
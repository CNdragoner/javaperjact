class Person{
	//����
	int age; 
	String name;
	//����
	public void speak(){
		System.out.println("�ҽ���" + name + ",�ҽ���" + age + "��.");
	}
}
public class Example01{
	public static void main(String[] args){
		Person p = new Person();
		p.age = 18;
		p.name = "������";
		p.speak();	
	}	
}
package SecondChapter;

public class Person {
	private String name;
	private int age;
	//���� speak()����
	public String getName() { //���ص�ǰclass�е�����
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("�����������Ч!!!");
		}else {
			this.age = age;
		}
	}
	void Speak() {
		System.out.println("�ҽ���" + age + "���ˣ�" + "�ҽ�" + name + "��");
	}
}

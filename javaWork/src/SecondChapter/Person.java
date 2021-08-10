package SecondChapter;

public class Person {
	private String name;
	private int age;
	//定义 speak()方法
	public String getName() { //返回当前class中的名字
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
			System.out.println("输入的年龄无效!!!");
		}else {
			this.age = age;
		}
	}
	void Speak() {
		System.out.println("我今年" + age + "岁了，" + "我叫" + name + "。");
	}
}

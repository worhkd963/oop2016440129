
public class Animal {
	// �ʵ�
	public String name;
	// ������
	public Animal(String name) {
		this.name = name;
	}
	//�޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sing() {
		System.out.println(name + " Sing");
	}
}

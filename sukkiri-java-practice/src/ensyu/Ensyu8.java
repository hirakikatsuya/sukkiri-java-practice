package ensyu;

public class Ensyu8 {
	public static void main(String[] args) {
		Dog myDog1 = new Dog();
		myDog1.SetName("name");
		myDog1.SetType("チワワ");
		myDog1.SetAge(80);
		myDog1.ShowProfile();
		Dog myDog2 = new Dog();
		myDog2.SetName("NAME");
		myDog2.SetType("柴犬");
		myDog2.SetAge(29);
		myDog2.ShowProfile();
	}
}

class Dog {
	private String Name;
	private int Age;
	private String Type;

	public void SetName(String nm) {
		Name = nm;
	}

	public void SetAge(int ag) {
		Age = ag;
	}

	public void SetType(String tp) {
		Type = tp;
	}

	public void ShowProfile() {
		System.out.println("名前は、" + Name + "犬種は" + Type + ",歳は" + Age + "です。");
	}
}
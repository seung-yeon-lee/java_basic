package Method;
class Print{
	public String value;
	public void first() {  // method�� instance�� �Ҽ��� ���� static Ű���� ��� x
		System.out.println(this.value);
		System.out.println("Number One");
		// method�� class �Ҽ� �ϋ��� static Ű���带 ��� �ؾ� ��,
	}
	public void second() { // method�� instance�� �Ҽ��� ���� static Ű���� ��� x
		System.out.println(this.value);
		System.out.println("Number Two");
	}
	
}
public class StaticApp {
	// void == return ���� ���� ���
	public static void main(String[] args) {
		// static = class method
		// no static = instance method
		Print T1 = new Print();
		T1.value = "-";
		T1.first();
		T1.second();
		
//		Print T2 = new Print();
//		T2.value = "*";
//		T2.first();
//		T2.second();


	}
}

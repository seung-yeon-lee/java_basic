package Method;
class Print{
	public String value;
	public void first() {  // method가 instance의 소속일 때는 static 키워드 사용 x
		System.out.println(this.value);
		System.out.println("Number One");
		// method가 class 소속 일떄는 static 키워드를 사용 해야 함,
	}
	public void second() { // method가 instance의 소속일 때는 static 키워드 사용 x
		System.out.println(this.value);
		System.out.println("Number Two");
	}
	
}
public class StaticApp {
	// void == return 값이 없을 경우
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

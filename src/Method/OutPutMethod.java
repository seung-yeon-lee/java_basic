package Method;

public class OutPutMethod {
	public static String a() {
		return "a";
	}
	public static int one() {
		return 1;
	}
	public static String twoTimes(String Text, String Second) {
		String out = "";
		out = out + Text + "\n";
		out = out + Second + "\n";
		return out;
	}

	public static void main(String[] args) { //void = return 값이 없는 메서드를 만들때 사용
		System.out.println(twoTimes("First","Second"));
	}

}

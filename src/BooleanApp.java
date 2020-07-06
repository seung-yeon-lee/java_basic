
public class BooleanApp {

	public static void main(String[] args) {
//		System.out.println("One"); //String
//		System.out.println(1); // Number
//		
//		String foo = "Java Programming";
//		System.out.println(foo.contains("Java")); 
//		// contains 메소드 = 입력값으로 전달할 어떤 값이 있다면 true , 없다면 false를 return
//		    System.out.println(args[0]);
		String pass = "1234";
		String inputPass = args[1];
		String id = "React";
		String inputId = args[0];  //equals = 객체 비교 메서드
		
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)){
//				System.out.println("Login Success");
//			}else {
//				System.out.println("password Error");
//			}
//		}else {
//			System.out.println("Error");
//		}
		
		if(inputId.equals(id) && inputPass.equals(pass)){
			System.out.println("Login Success");
		}else {
			System.out.println("Login Error");
		}
		
		
	}  
}

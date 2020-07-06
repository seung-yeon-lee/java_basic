import java.util.Arrays;

public class Loopting {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "Java";
		users[1] = "JavaScript";
		users[2] = "React";
		System.out.println(Arrays.toString(users));

		int[] score = { 10, 100, 100 }; // 값을 미리 할당하는 방법
		System.out.println(Arrays.toString(score));
	
		String[][] UserData = {
				{"ReactNative", "1111"},
		
				};
		String inputUserId = args[0];
		String inputUserPass = args[1];
		boolean isLoadingState = false;
		for( int i = 0 ; i < UserData.length; i ++) {
			String [] CurrentUser = UserData[i];
			if(CurrentUser[0].equals(inputUserId) && CurrentUser[1].equals(inputUserPass)) {
				isLoadingState = true;
				break;
			}
		}
		if(isLoadingState) {
			System.out.println("Success HomePage Login!");
		}else {
			System.out.println("Server Error");
		}
	}
}

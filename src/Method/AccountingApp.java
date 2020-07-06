package Method;

public class AccountingApp {
	// public static = AccountingApp이라는 class의 직접적인 소속이다.
	
	public static double ValueOfSupply = 10000.0;   // 공급가
	public static double vatRate = 0.1;   // 부가가치 세율
	
	public static double getVAT() {
		return ValueOfSupply * vatRate;
	}
	public static double getTotal() {
		return ValueOfSupply + getVAT();
	}

	public static void main(String[] args) {
//		double vat = getVAT(); // 부가세 10%
//		double total = getTotal(); // 공급가+부가세 = 총 합계
		System.out.println(ValueOfSupply);
		System.out.println(getVAT());
		System.out.println(getTotal());
		

	}

}



// public = oop전 까지는 그냥 쓰기
// protected
// default
// private = 같은 class 안에서만 쓸 수 있음


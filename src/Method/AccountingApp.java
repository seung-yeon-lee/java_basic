package Method;

public class AccountingApp {
	// public static = AccountingApp�̶�� class�� �������� �Ҽ��̴�.
	
	public static double ValueOfSupply = 10000.0;   // ���ް�
	public static double vatRate = 0.1;   // �ΰ���ġ ����
	
	public static double getVAT() {
		return ValueOfSupply * vatRate;
	}
	public static double getTotal() {
		return ValueOfSupply + getVAT();
	}

	public static void main(String[] args) {
//		double vat = getVAT(); // �ΰ��� 10%
//		double total = getTotal(); // ���ް�+�ΰ��� = �� �հ�
		System.out.println(ValueOfSupply);
		System.out.println(getVAT());
		System.out.println(getTotal());
		

	}

}



// public = oop�� ������ �׳� ����
// protected
// default
// private = ���� class �ȿ����� �� �� ����


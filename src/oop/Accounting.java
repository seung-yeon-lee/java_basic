package oop;

class MakeTheInstanceOfClass{
	public double SupplyValue;
	public MakeTheInstanceOfClass(double SupplyValue) {
		this.SupplyValue = SupplyValue;
	}
	public static double vatRate = 0.1;
	public double getVat() {
		return SupplyValue * vatRate;
	}
	public double getTotal() {
		return SupplyValue + getVat();
	}
}

public class Accounting{
	public static void main(String[] args) {
		MakeTheInstanceOfClass IntivialValue = new MakeTheInstanceOfClass(1000000);
		System.out.println(IntivialValue.SupplyValue);
		System.out.println(IntivialValue.getTotal());
	}
}

// ��� => �������̽� => ��Ű��
//��Ӻ��� React => 2�� ���� => ����Ʈ ��������Ʈ => python ���� =>
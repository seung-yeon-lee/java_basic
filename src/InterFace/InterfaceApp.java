package InterFace;

interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable{
	void print();
}
class fakeClass implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("FakeClass!");	
	}
}
public class InterfaceApp {
	public static void main(String[] args) {
		fakeClass c = new fakeClass();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}

}

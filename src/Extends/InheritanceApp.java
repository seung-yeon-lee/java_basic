package Extends;

class Cal {
	int v1, v2;
	Cal(int v1, int v2) {this.v1 = v1;this.v2 = v2;}
	public int sum() {return this.v1+v2;}
	}

class Cal3 extends Cal {
	Cal3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init");
	}
	public int minus() {
		return this.v1 - v2;
	}
}
public class InheritanceApp {
	public static void main(String[] args) {
		Cal3 c3 = new Cal3(10, 1);
		System.out.println(c3.sum());
		System.out.println(c3.minus());
	}

}

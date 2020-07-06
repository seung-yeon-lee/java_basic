package oop;

class Print{
	public String data;
	
	public Print(String data) {
		this.data = data;
	}
	public void A() {
		System.out.println(this.data);
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.data);
		System.out.println("B");
	}
} 
class MiddleWare{
	int result;
	
	public void function() {
		System.out.println("FirstMethod ing..");
		System.out.println(result);

	}
	public int function1(int a) {
		return result = a;
	
	}
}

class If{
	public static void main(String[] args) {
		MiddleWare redux = new MiddleWare();
		redux.function();
		redux.function1(102);
	}
}
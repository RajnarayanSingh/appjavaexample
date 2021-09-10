package appjava1;

public class A {
	A(float j){
		System.out.println("A");
	}
	A(int i){
		this(10.3f);
		System.out.println(i);
	}
public static void main(String[] args) {
	new A( 100);
	System.out.println("main");

}


}

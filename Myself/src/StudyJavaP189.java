class MyMath3{
	long a, b;
	// 인스턴스 변수 a,b 만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() 			{return a+b;}
	long subtract() 	{return a-b;}
	long multiply() 	{return a*b;}
	long divide() 		{return a/b;}
	
	//인스턴스 변수와 상관없이 매개변수로만 작업이 가능하다.
	static long staticadd(long a, long b) {return a+b;}
	static long staticsubtract(long a, long b) {return a-b;}
	static long staticmultiply(long a, long b) {return a*b;}
	static long staticdivide(long a, long b) {return a/b;}
}


public class StudyJavaP189 {
	public static void main(String[] args) {
		// 클래스 메소드 호츨, 인스턴스 생성없이 호출가능
		System.out.println(MyMath3.staticadd(200L, 100L));
		System.out.println(MyMath3.staticsubtract(200L, 100L));
		System.out.println(MyMath3.staticmultiply(200L, 100L));
		System.out.println(MyMath3.staticdivide(200L, 100L));
		
		MyMath3 mm = new MyMath3();	// 인스턴스를 생성
		mm.a = 200;
		mm.b = 100;
		// 인스턴스 메소드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
/*
 * 인스턴스 메소드인 add(), subtract(), multiply(), divide()는 인스턴스변수인 a와 b만으로도 충분히 작업이 가능하기 때문에,
 * 매개변수를 필요로 하지 않으므로 괄호() 안에 매개변수를 선언하지 않았다.
 * 반면에 add(long a, long b), subtract(long a, long b), multiply(long a, long b), divide(long a, long b) 등은
 * 인스턴스변수 없이 매개변수만으로 작업을 수행하기 때문에 static을 붙여서 클래스메소드로 선언하였다.
 * 그래서 main 메소드를 보면, 클래스메소드는 객체생성없이 바로 호출이 가능했고, 인스턴스메소드는 MyMath3클래스의 인스턴스를 생성후에 호출이 가능했다.
 */
	}
}

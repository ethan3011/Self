public class StudyJavaP181 {
	public static void main(String[] args) {
		Mymath2 mm = new Mymath2();								// Mymath2 클래스를 호출하여 mm 이라는 인스턴스 클래스를 생성한다.
		long result1 = mm.add(5L, 3L);							// result1 이라는 변수에 mm.add(5L(long a),3L(long b)를 입력한다.
		long result2 = mm.subtract(5L, 3L);						// result2 이라는 변수에 mm.subtract(5L(long a),3L(long b)를 입력한다.
		long result3 = mm.multiply(5L, 3L);						// result3 이라는 변수에 mm.multiply(5L(long a),3L(long b)를 입력한다.
		double result4 = mm.divide(5L, 3L);						// result4 이라는 변수에 mm.divide(5L(long a),3L(long b)를 입력한다.
		
		System.out.println("add(5L, 3L) = " + result1);			// result1를 출력한다.
		System.out.println("subtract(5L, 3L) = " + result2);	// result2를 출력한다.
		System.out.println("multiply(5L, 3L) = " + result3);	// result3를 출력한다.
		System.out.println("divide(5L, 3L) = " + result4);		// result4를 출력한다.
	}
}


class Mymath2{
long add(long a, long b) {
	long result = a+b;
	return result;
	// return a+b; 로 간단히 표현할수도 있다.
}
long subtract(long a, long b) 	  {return a - b;}
long multiply (long a, long b) 	  {return a * b;}
double divide(double a, double b) {return a/b;}					// long의 값을 double에 대입하여 long 타입의 값a가 double 타입 a로 자동으로 형변환 된다.	
																// double(8byte) 크기와 long(8byte)의 크기가 같으므로 자동으로 형변환이 된다.
																// 만약 더 작은사이즈(1~4 byte)에 값을 넣으려고 하면 컴파일러가 에러로 인식한다.
}


public class StudyJavaP180 {
	public static void main(String[] args) {
		Mymath mm = new Mymath();
		
		long value = mm.add(1L, 2L); 
		System.out.println(value);
	}
}

class Mymath{
long add(long a, long b) {
	long result = a+b;
	return result;
	// return a+b; 로 간단히 표현할수도 있다.
}
long subtract(long a, long b) {return a - b;}
long multiply (long a, long b) {return a * b;}
long divide   (long a, long b) {return a / b;}
}

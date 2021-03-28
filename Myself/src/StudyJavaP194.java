/*
 * 오버로딩(overloading)의 예제
 *  
 * 실행결과를 보면 어떻게 add메소드가 println 메소드보다 먼저 호출되는지 의아할 수 있다.
 * System.out.println("mm.add(3,3) 결과 " + mm.add(3, 3));
 * 간단히 위의 문장이 아래의 두 문장을 하나로 합친 것이라고 생각하면 이해가 쉬울것이다.
 * 
 * int result = add(3,3)
 * System.out.Println("mm.add(3, 3) 결과 " + result);
 * 
 */


public class StudyJavaP194 {
	public static void main(String[] args) {
		int[] a = {100,200,300};
		MyMath4 mm = new MyMath4();
		System.out.println("mm.add(3,3) 결과 " + mm.add(3, 3));
		System.out.println("mm.add(3L,3) 결과 " + mm.add(3L, 3));
		System.out.println("mm.add(3,3L) 결과 " + mm.add(3, 3L));
		System.out.println("mm.add(3L,3L) 결과 " + mm.add(3L, 3L));
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
}

class MyMath4{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}

	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length;i++) {
			result +=a[i];
		}return result;
	}
}
	


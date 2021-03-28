/*
 * 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하나,
 * 단, 클래스멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우에는 인스턴스를 생성해야한다.
 * 그 이유는 인스턴스멤버가 존재하는 시점에 클래스멤버는 항상 존재하지만,
 * 클래스멤버가 존재하는 시점에 인스턴스멤버가 존재하지 않을 수도 있기 때문이다. 
 */

class TestClass{
	void instanceMethod() {}				//인스턴스메소드
	static void staticMethod() {}			//클래스메소드
	
	void instanceMethod2() {				//인스턴스메소드
		instanceMethod();					//다른 인스턴스메소드를 호출한다.
		staticMethod();						//클래스메소드를 호출한다
	}
	
	static void staticMethod2() {			//static메소드
//		instanceMethod();					// 에러!!! 인스턴스메소드를 호출할 수 없다.
		staticMethod();						// static메소드는 호출 할 수 있다.
	}
}
// * 위와 같은 코드는 같은 클래스 내의 인스턴스 메소드와 static메소드 간의 호출에 대해 설명하고 있다.
// * 같은 클래스 내의 메소드는 서로 객체의 생성이나 참조변수 없이 직접 호출이 가능하지만 static 메소드는 인스턴스 메소드를 호출할 수 없다.

class TestClass2{
	int iv;								//인스턴스메소드
	static int cv;						//클래스 변수
	
	void instanceMethod() {				//인스턴스메소드
		System.out.println(iv);			//인스턴스 변수를 사용할수 있다.
		System.out.println(cv);			//클래스 변수를 사용할 수 있다.
		}
	static void staticMethod() {		//static 메소드
//		System.out.println(iv); 		//에러!!! 인스턴스 변수는 사용할수 없다.
		System.out.println(cv);			// 클래스 변수는 사용할 수 있다.
	}
}

// 이번엔 변수와 메소드간의 호출에 대해서 살펴보자. 메소드간의 호출에서처럼 인스턴스메소드는 인스턴스 변수를 사용할수 있지만,
// static 메소드는 인스턴스 변수를 사용할 수 없다.
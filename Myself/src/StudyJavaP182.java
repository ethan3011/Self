public class StudyJavaP182 {

	/*
	 * return문은 현재 실행중인 메소드를 종료하고 호출한 메소드로 되돌아간다.
	 * 지금까지 반환값이 있을때만 return문을 썻지만, 원래는 반환값 유무에 상관없이 모든 메소드에는 적어도 하나의 return 문이 있어야한다.
	 * 그런데도 반환타입이 void인경우 return 문 없이도 아무런 문제가 없었던 이유는
	 * 컴파일러가 메소드의 마지막에 'return;'을 자동으로 추가해주었기 떄문이다.
	 */
	void printfGugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan,i,dan*i);
		}
			//return;  반환타입이 void이므로 생략가능, 컴파일러가 자동추가
	}
	/*
	 * 그러나 반환타입이 void가 아닌 경우, 즉 반환값이 있는 경우, 반드시 return문이 있어야 한다.
	 * return 문이 없으면 컴파일 에러(error: missing return statement)가 발생한다.
	 */
	int multiplay(int x, int y) {
		int result = x + y;
		return result;
	}// 반환타입이 void가 아니므로 생략불가.
	
	/*
	 * 아래의 코드는 두 값 중에서 큰 값을 반환하는 메소드이다.
	 * 이 메소드의 리턴타입이 int이고 int 타입의 값을 반환하는 return문이 있지만, return 문이 없다는 에러가 발생한다.
	 * 왜냐하면 if문 조건식의 결과에 따라 result가 실행되지 않을수도 있기 때문이다.
	 * 
	int max (int a, int b) {
		if(a >b) {
			return a;	// 조건식이 참일때만 실행된다.
		}
	}
	그래서 이런 경우에는 다음과 같이 if문의 else 블럭에 return 문을 추가해서, 항상 결과값이 반환되도록 해야한다.
	*/
	
	int max(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}

}

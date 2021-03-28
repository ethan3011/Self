	/*
	 * return문의 반환값으로 주로 변수가 오긴 하지만 항상 그런것은 아니다. 아래 왼쪽 코드는 오른쪽 같이 간단히 할수 있는데,
	 * 오른쪽 코드는 return문의 반환값으로 "x+y"라는 수식이 적혀있다. 그렇다고 해서 수식이 반환되는 것은 아니고,
	 * 이 수식을 계산한 결과가 반환된다.
	 * 
	 * int add(int a, int b){	*	int add(int a, int b){
	 * int result = x + y;		*	return = x + y;
	 * return = result;			*	}
	 * }
	 * 
	 * 예를 들어 매개변수 x와 y의 값이 각각 3과5 라면, "return x+y;"는 다음과 같이 계산과정을 거쳐서 반환값은 8이 된다.
	 * return x+y;
	 * return 3+5;
	 * return 8;
	 * 
	 * 아래의 diff메서드는 두 개의 정수를 받아서 그 차이를 절대값으로 반환한다. 오른쪽 코드 역시 메소드를 반환하는 것이 아니라 메소드 abs를 호출하고,
	 * 그 결과를 받아서 반환한다. 메소드 abs의 반환타입이 메소드 diff의 반환타입과 일치하기 때문에 이렇게 하는 것이 가능하다는것에 주의하자.
	 * 
	 * int diff(int x, int y){	*	int diff(int x, inty){	
	 * int result = abs(x-y);	*	return abs(x-y);
	 * 							*	}
	 * return result;			
	 * }
	 * 
	 * 간단한 메소드의 경우 if문 대신 조건연산자를 사용하기도 한다. 
	 * 메소드 abs는 입력받은 정수의 부호를 판단해서 음수일 경우 부호연산자(-)를 사용해서 양수로 반환한다.
	 * 
	 * int abs(int x){			*	int abs(int x){
	 * 		if(x>=){			*	return x>=0 ? x : -x;
	 * 			return x;		*	}
	 * 		}else{
	 * 			return -x;
	 *		}
	 * }
	 * 
	 */

public class StudyJavaP179 {

	public static void main(String[] args) {
		ADD Varadd = new ADD();								// ADD의 클래스를 호출하여 Varadd 라는 인스턴스 클래스를 생성한다.
		PF Varpf = new PF();								// PF의 클래스를 호출하여 Varpf 라는 인스턴스 클래스를 생성한다.
		Varadd.add(3,5);									// Varadd(add) 메소드의 3,5(x,y)가 호출된다.
		Varpf.print99danAll();								// Varpf(print99danAll) 메소드가 호출된다.
	}
}
class ADD{													//ADD 라는 클래스를 생성한다.
															//타 클래스에서 인스턴스 클래스 생성을 위해 메소드 앞에 static을 붙여준다.
	int add(int x, int y) {									//add 메소드를 생성한다.
		int result = x + y;
		return result;
	}	
}
class PF{													//PF라는 클래스를 생성한다.
															//타 클래스에서 인스턴스 클래스 생성을 위해 메소드 앞에 static을 붙여준다.				
	void print99danAll(){									//void 타입의 print99danAll 메소드를 생성한다.
		for(int i=1; i>=9; i++) {	
			for(int j=1; j>=9; j++) {
				System.out.println(i + " *" + j + " =" + i*j);
			}
		}System.out.println();
	}	
}



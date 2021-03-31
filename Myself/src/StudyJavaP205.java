// 멤버변수의 초기화 예제1
public class StudyJavaP205 {
	static { // 클래스 초기화 블록
		System.out.println("클래스 초기화 블록");
	}
	
	{ // 인스턴스 초기화 블록
		System.out.println("인스턴스 초기화 블록");										
	}
	public StudyJavaP205() {System.out.println("생성자");}
	
	public static void main(String[] args) {
		
		System.out.println("StudyJavaP205 SJ= new StudyJavaP205();");
		StudyJavaP205 SJ = new StudyJavaP205();
		
		System.out.println("StudyJavaP205 SJ2= new StudyJavaP205();");
		StudyJavaP205 SJ2 = new StudyJavaP205();
	}
}

/*
 * 예제가 실행되면서 StudyJavaP205이 메모리에 로딩될 때, 클래스 초기화 블록이 가장 먼저 수행되어 "클래스 초기화 블록"이 화면에 출력된다.
 * 그 다음에 main 메소드가 수행되어 StudyJavaP205의 인스턴스가 생성되면서 인스턴스 초기화 블록이 먼저 수행되고, 끝으로 생성자가 출력된다.
 * 위의 실행결과에서도 알 수 있듯이 클래스 초기화 블록은 처음 메모리에 로딩될 때 한번만 수행되었지만, 인스턴스 초기화 블록은 인스턴스가 생성될 때 마다 수행된다.
 */

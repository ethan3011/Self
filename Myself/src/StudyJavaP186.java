/*
 * 이전의 예제와 달리 change 메소드를 호출한 후에 d.x의 값이 변경되었다.
 * change메소드의 매개변수가 참조형이라서 값이 아니라 "값이 저장된 주소"를 change 메소드에게 넘겨주었기 때문에
 * 값을 읽어오는것 뿐만 아니라 변경하는 것도 가능하다.(참조형 매개변수는 값이 저장된 주소, 기본형 매개변수는 값이다.) 
 */
class Data2{ int x;}

public class StudyJavaP186 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		
		d.x = 10;
		System.out.println("main() : " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		/*
		 * 이전 예제와 달리, change 메소드의 매개변수를 참조형으로 선언했기 떄문에, x의 값이 아닌 변수 d의 주소가 매개변수 d에 복사되었다.
		 * 이제 main 메소드의 참조변수 d와 change 메소드의 참조변수 d는 같은 객체를 가르키게 된다.
		 * 그래서 매개변수로 d로 x의 값을 읽는것과 변경하는 것이 모두 가능한것이다.
		 */
		
	}
	static void change(Data2 d) {
		d.x= 1000;
		System.out.println("change() : " + d.x);
	}

}

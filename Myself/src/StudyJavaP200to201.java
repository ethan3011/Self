/*
 * 생성자에서 다른 생성자 호출하기 - this()
 * 같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다. 단, 두 조건을 만족시켜야 한다.
 * - 생성자의 이름으로 클래스이름 대신 this를 사용한다.
 * - 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다. 
 * 
 * 아래 코드는 생성자를 작성할 때 지켜야하는 두 조건을 모두 만족시키지 못해 에러가 발생한다.
 * 
 * Car(String door){
 * 		door = 5;					// 첫번째 줄
 * 		Car(color, "auto", 4);		// 에러1. 생성자의 두 번째 줄에서 다른 생성자 호출
 * }								// 에러2. this(color, "auto", 4);로 해야함
 * 
 * 생성자 내에서 다른 생성자를 호출할 때는 클래스의 이름인 "Car" 대신에 "this"를 사용해야하는데 그러지 않아서 에러이고,
 * 또 다른 에러는 생성자 호출이 첫 번째 줄이 아닌 두 번째 줄이기 때문에 에러이다.
 * 
 * 생성자에서 다른 생성자를 첫 줄에서만 호출이 가능하도록 한 이유는 생성자 내에서 초기화 작업도중 다른 생성자를 호출하게 되면,
 * 호출된 다른 생성자 내에서도 멤버변수들의 값을 초기화 할 것이므로 다른 생성자를 호출하기 이전의 초기화 작업이 무의미해질수 있기 때문이다.
 */

class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("White", "auto", 4);
	}
	
	Car3(String color){
		this(color, "auto", 4);
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class StudyJavaP200to201 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("blue");
		
		System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
		
	}

}

/*
 * 생성자 Car3()에서 또 다른 생성자 Car3(String color, String gearType, int door)를 호출하였다.
 * 이처럼 생성자간의 호출에는 생성자의 이름 대신 this를 사용해야만 하므로 "Car3" 대신 "this"를 사용했다.
 * 그리고 생성자 Car3의 첫번째 줄에서 호출하였다는 점을 유의하기를 바란다.
 * 
 * Car3(){									===>>
 * color = "white";							===>>					Car3(){
 * gearType = "auto"						===>>					this("white,auto,4)
 * door = 4;								===>>					}
 * 
 * 위 코드는 양쪽 모두 같은 일을 하지만 오른쪽 코드는 생성자 Car3(String color, String gearType, int door)를 활용해서 더 간략히 한것이다.
 * Car3 c1 = new Car3(); 와 같이 생성자 Car3()를 사용해서 Car3인스턴스를 생성한 경우에,
 * 인스턴스변수 color는 "white, gearType은 "auto", door는 4로 초기화 되도록 하였다.
 * 
 * 이것이 마치 실생활에서 자동차(Car3인스턴스)를 생산할 때, 아무런 옵션도 주지 않으면,
 * 기본적으로 흰색(white)에 자동변속기어(auto) 그리고 문의 개수가 4개인 자동차가 생산되도록 하는 것에 비유할수 있다.
 * 
 * 같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많아서 이처럼 서로 호출하도록 하여 유기적으로 연결해주면 더 좋은 코드를 얻을수 있다.
 * 그리고 수정이 필요한 경우에 보다 적은 코드만을 변경하면 되므로 유지보수가 쉬워진다.
 * }
*/
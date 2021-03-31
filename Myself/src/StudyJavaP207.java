// 연습문제

	
	 //다음과 같은 멤버변수를 갖는 Student 클래스를 정의하시오.
	class Student{
		String name;												// 이름
		int ban;													// 반
		int no;														// 번호
		int kor;													// 국어점수
		int eng;													// 영어점수
		int math;													// 수학점수
		int total(){return kor + eng + math;}						// 총점						
		double average() {return Math.round(total()*10/3.0) * 0.1;}	// 평균

		String info() {
			return name + "," + 
					ban + "," + 
					no + "," + 
					kor + "," + 
					eng + "," + 
					math + "," + 
					total() + "," + 
					average();  
			}
		
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		}
	}
	
public class StudyJavaP207 {

	// 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오.
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76); 
			String str = s.info();
			System.out.println(str);
			System.out.println();
			
			// 결과 : 홍길동,1,1,100,60,76,236,78.7
	}
}



package abstract01;
//추상화
/*	추상이라는 것은 현실화 되어질 필요가 없는
 *  즉, 인스턴스화 할 필요가 없는 성질의 클래스
 *  
 *  자바에서는 객체지향을 통해 프로그램이 실행되는데
 *  이 추상화라는 개념을 클래스에 적용시키면
 *  자신의 인스턴스를 발생시킬 수 없는 형태가 됨
 * 
 * 	결론. 인스턴스화 할 필요는 없지만 상속 새념에서
 * 	중요한 위치를 가지게 될 때 보통 추상 클래스로 선언하여 사용
 *	 
 * 	추상화 선언 규칙
 * 	1. 클래스에 정의된 메소드 중 추상 메소드가 하나라도 있다면
 * 	   추상 클래스로 선언 되어야 함 
 * 	2. 추상 메소드는 바디가 없는 형태 => {}
 * 		메소드의 바디가 없고 abstract라는 키워드가 붙은 형태
 * 		바디가 없기 때문에 ()뒤에 ;를 붙임(선언의 끝)
 * 	3. 추상 클래스는 자신의 인스턴스를 만들 수 없음
 * 		생성자, 메소드, 필드는 모두 선언/정의 할 수 있음
 * 		super타입으로 존재할 수 있음
 * 		다형성 적용 가능
 * 		상속 가능
 * 
 *	4. 만약 추상 메소드가 하나도 없을 때 클래스를 추상화 하고 싶다면
 *		Abstract를 사용하면 됨  
 *
 */
public class Abstract {

}
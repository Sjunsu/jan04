package animal;
//추상 클래스
public abstract class Animal {
	protected int age;
	protected String name;
	//추상 메소드
	public abstract void sound();
	public abstract void add();
	
	public void thehagi() {
		
	}
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
}

package what;

public class What {
	public static void main(String[] args) {
		Human h1 = Human.getInsetance();
		Human h2 = Human.getInsetance();
		Human h3 = Human.getInsetance();
		System.out.println(h1==h2);
	}
}
//데이터베이스 연결(p243)
class Human {
	
	private static Human human = new Human();
	
	private Human() {		
	}
	
	public static Human getInsetance() {	
		return human;
	}
	
}
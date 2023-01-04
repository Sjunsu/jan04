package animal;

public class Human extends Animal {
	private String ssn;
	final static int NUM = 101;
	static int check = 500;
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", ""); //가운데 - 들어오는것 제거
		if(ssn.length() < 13) {
			for(int i=1;i<=13-ssn.length();i++) {
				
				ssn += "*";
			}
		}
		this.ssn = ssn;
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public void sound() {
		//super.sound();
		System.out.println("집 가고 싶다.");
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		Human.check = 5000;
		//human.check = 100; 이렇게 써도 가능은 하지만 되도록 안하는걸로
		
		System.out.println(human.add(20, 15));
		human.setSsn("454545");
		
		System.out.println(human.getSsn());
		
	}

}

package abstract01;

public class Avengers {
	public static void main(String[] args) {
		Ironman ironman = new Ironman();
		Hulk hulk = new Hulk();
		Superman superman = new Superman();
		
		ironman.attack();
		hulk.attack();
		superman.attack();
		
		Hero[] avan = new Hero[3];
		avan[0] = ironman;
		avan[1] = hulk;
		avan[2] = superman;
		for(int i=0; i<avan.length;i++) {
			avan[i].attack();
		}
		//다형성
		Hero h1 = new Ironman();
		h1.attack();
		h1.defense();
		
		((Ironman)(h1)).javis = "";
		((Ironman)(h1)).callJavis();
		
		Ironman h2 = (Ironman) h1;
		h2.callJavis();
		
		Object obj = new Ironman();
	}

}

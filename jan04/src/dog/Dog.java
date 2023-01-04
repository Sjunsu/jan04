package dog;

import java.util.HashSet;
import java.util.Set;

import animal.Animal;
import animal.Human;

public class Dog extends Animal {
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>(); //중복제거
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		return lotto;
	}
	public void sound() {
		//super.sound();
		System.out.println("멍멍");
	}
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.sound();
		Dog dog = new Dog();
		dog.age = 10;
		Human human = new Human();
		System.out.println(dog.lotto());
		
		

	}
	

}

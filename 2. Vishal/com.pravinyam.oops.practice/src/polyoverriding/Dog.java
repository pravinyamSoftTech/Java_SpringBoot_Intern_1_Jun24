package polyoverriding;

public class Dog extends Animal {
	@Override
	public void Sound() {
		super.Sound();
		System.out.println("is barking..");
	}

}

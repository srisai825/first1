package Abstra;

public class Bmw extends car {

	public static void main(String[] args) {

		car ca = new Bmw();
		ca.carEngine();
		ca.gasDiesel();

	}

	@Override
	public void carEngine() {

		System.out.println("hii engine");

	}

	@Override
	public void gasDiesel() {

		System.out.println("hii engine");

	}

}

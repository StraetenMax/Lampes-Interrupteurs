package www.lampe;

public class Test {

	public static void main(String[] args) {
		Lampe lampe = new Lampe(true);
			System.out.println(lampe.estAllumee());//true
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());//false
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());//true
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());//false
	}

}

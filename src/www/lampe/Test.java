package www.lampe;

public class Test {

	public static void main(String[] args) {
		Lampe lampe = new Lampe(true);
			System.out.println(lampe.estAllumee());//true
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());//false
			
			System.out.println(lampe.estAllumee());
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());
	}

}

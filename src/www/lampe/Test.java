package www.lampe;

public class Test {

	public static void main(String[] args) {
		Lampe lampe = new Lampe(true);
		Interrupteur interrupteur = new Interrupteur(lampe);
		
		System.out.println(lampe.estAllumee()); //true
		System.out.println(interrupteur.getPosition()); //on
		
		
			/*System.out.println(lampe.estAllumee());//true
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());//false
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());//true
			lampe.presserInterrupteur();
			System.out.println(lampe.estAllumee());//false*/
	
		interrupteur.changerPosition();
		
		System.out.println(lampe.estAllumee()); //false
		System.out.println(interrupteur.getPosition()); //off
	
	
	}
	

}

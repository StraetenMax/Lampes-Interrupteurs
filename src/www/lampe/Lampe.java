package www.lampe;

public class Lampe {
	
	private boolean etat;
	
	public Lampe(boolean etat){
		this.etat = etat;
	}
	
	public boolean estAllumee(){
		return etat;
	}
	
	public void presserInterrupteur(){
		if(etat == true){
			etat = false;
		}else{
			etat =true;
		}
		
	}
	
	
}

package www.lampe;

public class Lampe {
	
	private boolean estAllumee;
	
	public Lampe(boolean etat){
		estAllumee = etat;
	}
	public void presserInterrupteur(){
		if(estAllumee == true){
			estAllumee = false;
		}else{
			estAllumee =true;
		}
		
	}
	
	
}

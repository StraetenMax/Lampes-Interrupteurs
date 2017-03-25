package www.lampe;

public class Interrupteur {
	private boolean position;
	private Lampe lampe;
	
	public Interrupteur(Lampe lampe){
		this.lampe = lampe;
	}

	public String getPosition(){
		if(position == true){
			return "on";
		}else{
			return "off";
		}
	}
	
}

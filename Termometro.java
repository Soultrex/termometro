public class Termometro{
	private int temp; //Solo es privado para otras clases, si estoy dentro de la clase si los puede modificar

	public Termometro(){
		this.temp=24;
	}

	public Termometro(int temp){
		this.temp=temp;
	}

	public int getTemp(){
		return temp;
	}

	public void setTemp(int t){
		temp=t;
	}

	public static void main(String[] args){
		Termometro gda=new Termometro();
		Termometro cob=new Termometro(21);

		System.out.println("La temperatura en Guadalajara es: "+gda.getTemp());
		System.out.println("La temperatura en Ciudad Obregon es: "+cob.getTemp());

		cob.setTemp(37);

		System.out.println("La temperatura en Ciudad Obregon es: "+cob.getTemp());

	}

}
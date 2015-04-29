
public class Enigma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				try {
					
					Cesar encriptacion1=new Cesar() ;
					System.out.println("El nuevo indice de la letra es" );
			//encriptar recibira el valor de k desplazamiento seguido el indice original de la letra (j)
					//devuelve el nuevo indice correspondiente a la nueva letra
					System.out.println(encriptacion1.encriptar (2,0));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
		}
	}



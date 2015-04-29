
public class Cesar {

	
	//System.out.println("a-0 b-1,c-2,d-3,e-4,f-5,g-6,h-7,i-8,j-9,k-10,l-11,m-12,n-13,ñ-14,o-15,p-16,q-17,r-18,s-19,t-20,u-21,v-22,w-23,x-24,y-25,z-26");
	
	int K;
	int j;
	
	public Cesar() {
		// TODO Auto-generated constructor stub //
		
		
		 //char abecedario1[]=new char[26];
			
		     //  abecedario1[0]="a";
			//abecedario1[1]="b";
			//abecedario1[2]="c";
			//abecedario1[3]="d";
			//abecedario1[4]="e";	
			//System.out.println(abecedario1[1]);
			//resultado=abecedario1[1];
			//System.out.println(resultado);
			
	}
	
	
	public int encriptar (int k , int j) {
		
		if (j>k-1) return  j-k;
		else return 27-k+j;
		//encriptar recibira el valor de k desplazamiento seguido el indice original de la letra (j)
		//devuelve el nuevo indice correspondiente a la nueva letra
		
	}
}

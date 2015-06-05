
public class Datos {
	//VARIABLES De DEFINICION DE IDIOMA
	final static int SP_LANG=0;
	final static int EN_LANG=1;
	
	private int language;
	
	//Datos
	private String tiposDireccDatos[]={"calle","avenida","carretera","plaza"};
	private String tiposDireccDatosEng[]={"street","avenue","road","square"};
	
	public Datos(int language) {
		this.language=language;
		System.out.println(language);
	}
	
	public String[] getTiposDirecc(){
		switch (this.language){
			case Datos.SP_LANG:
				//System.out.println(language);//system.out.println los he puesto para entender mejor el codigo
				
				return tiposDireccDatos;
			case Datos.EN_LANG:
				//System.out.println(language);
		    return tiposDireccDatosEng;
			default:
				return tiposDireccDatos;
			
		}	
		
	}

}

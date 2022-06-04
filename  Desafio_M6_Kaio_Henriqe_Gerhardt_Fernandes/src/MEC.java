
public class MEC {
	
	public void imprimeUniversidades(Universidade[] uni) {
		for(int i = 0; i < uni.length; i++) {
			
		}
		
		for (int i = 0; i < uni.length; i++) {//laço para passar por cada indice do array
			System.out.println("*** Dados da "+ i + "° Universidade ***");
			uni[i].imprimeInfo();
			
			if(uni instanceof Privada) {
				System.out.println("Tipo: Privada");
			}//else if(uni instanceof Publica)
		}
	}
}

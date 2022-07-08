import java.util.Arrays;

public class Progama {
	public static void main(String[] args) {
		//System.out.println("Boas Vindas, Ordenando o Alfabeto!");
		
			int  alfabeto = 26 ;
			String letras[] = {"a","b","c","d","e","f","g","h",
					"i","j","k","l","m","n","o","p","q","r","s","t",
					"u","v","w","x","y","z"};
			
			Arrays.sort(letras);
			System.out.println("lista em ordem alfabetica: ");
			for (int i = 0; i < alfabeto; i++) {
				System.out.println(letras[i]);
			}					
	}
}

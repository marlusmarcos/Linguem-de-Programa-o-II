import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) 
	{	/*
		frase na qual quero contar quantas vezes aparece uma determinada palavra
		*/
		String frase = "Eu tenho um barco vermelho e um carro vermelho";
		String array[] = new String[10];
		int cont = 0;
		/*
		cada posição do array é ocupada com palavras que são pegas através de um espaço " ".
		ex: a cada espaço dado, uma palavra nova é add!
		*/
		array = frase.split(" ");	
		for (String m_str : array) 
		{	/*
			função "CONTAINS, conta o número de ocorrenciar da palavra desejada"
			*/
			if (m_str.contains("vermelho")) 
			{
				cont += 1;
			}
		

		}
		//imprimindo o número de ocorrencias.
		System.out.println (cont);

	}
    
}
//conta quantas vezes a palavra "Vermelho" aparece na string

import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) 
	{
		String frase = "Eu tenho um barco vermelho e um carro vermelho";
		String array[] = new String[10];
		int cont = 0;
		array = frase.split(" ");	
		for (String m_str : array) 
		{
			if (m_str.contains("vermelho")) 
			{
				cont += 1;
			}
		

		}
		System.out.println (cont);

	}
    
}
//conta quantas vezes a palavra "Vermelho" aparece na string

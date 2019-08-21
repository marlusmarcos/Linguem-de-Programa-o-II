import java.util.ArrayList;

public class Escola extends Professor {

	 static ArrayList <Professor> listaProf = new ArrayList();
	 public static String novo;
	 public static int cont = 999;
	
	public static void main (String [] args) 
	{
		Fixo p2 = new Fixo ();
		Temporario p3 = new Temporario();
		p2.setName("marcos");
		p2.setIdade(21);
		p2.setSalario(5000);
		p2.setRegistration("2016");
		listaProf.add(p2);
		p3.setName ("Marlus");
		p3.setQtd(5);
		p3.setIdade(25);
		listaProf.add(p3);
		Fixo p1 = new Fixo();
		p1.setName("marcos jean");
		p1.setIdade(57);
		p1.setSalario(5000);
		p1.setRegistration("2015");
		listaProf.add(p1);
		
		for (Professor i : listaProf) {
			if(i.getIdade() < cont) {
				novo = i.getName();
				cont = i.getIdade();
			}
		}
		System.out.println ("O professor mais novo é: " + novo);
		
		for (Professor i: listaProf) 
		{	if (i.equals(p2) || i.equals(p1)) 
			{
				System.out.println ("Dados:\n	" + i.getName() + "\n	" + ((Fixo) i).getSalario() + "\n");
			} else {
			System.out.println ("Dados:\n	" + i.getName() + "\n	" +  ((Temporario) i).getQtd());
			}
		}
	}
	
	
}
/*********************/
public class Professor 
{
	protected String name; //the attribute refers to the teacher's name
	protected String registration; // the attribute refers to the registration  
	protected int idade;
	
	public void setName (String n1) 
	{ // this method have the function to assign  the state name to the object  
		name = n1;
	}
	/*
	 * this method refer to the registration of teacher. that is represented by a string 
	 * */
	public void setRegistration (String r1) 
	{
		registration = r1;
	}
	public void setIdade (int id) {
		idade = id;
	}
	public String getName () {
		return name;
	}
	public int getIdade() {
		
		return idade;
	}
	
}

/************************************************************************************************/
public class Fixo extends Professor {
	private double salario;
	
	public void setSalario (double s1) {
		salario= s1;
	}
	public double getSalario () {
		return salario;
	}
}
/****************************************************************/

public class Temporario extends Professor  {
	private double qtdHoras;
	public void setQtd (double qtd) {
		qtdHoras = qtd;
	}
	public double getQtd () {
		return qtdHoras;
	}
}

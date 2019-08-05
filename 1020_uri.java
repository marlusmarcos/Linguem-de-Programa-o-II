
import java.util.Scanner;

public class Main
{
    
    //atributos
    private int dia;
    private int mes;
    private int ano;
    private int valor;
    //int dias_total;
    //método construtor para iniciar a class, valor recebido
    public Main (int v) {
        valor = v;
    }
    public void formatarData () {
        while (valor >=365) {
            valor = valor - 365;
            ano = ano+1;
        }
        while (valor >=30) {
            valor = valor - 30;
            mes = mes+1;
        }
        dia = valor;
    }
    public void printData () {
        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.print(dia + " dia (s)");
    }

	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner in = new Scanner( System.in );
        //System.out.println(in.nextLine());
        //int i = in.nextInt();
        Main c1 = new Main(in.nextInt());
        c1.formatarData();
        c1.printData();
	}
}

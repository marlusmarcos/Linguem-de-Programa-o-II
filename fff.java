public class MaquinaRefrigerante {
    //atributos
    private int preco;
    private int balanco;
    private int total;
    //método construtor para inicializar os atributos
    public MaquinaRefrigerante (int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
    }
    //retorna o preço
    public int getPreco () {
        return preco;
    }
    // retonar o balanço
    public int getbalanco () {
        return balanco;
    }
    //recebe um valor em dinheiro 
    public void inserirDinheiro (int valor) {
        balanco += valor;
    }
    //imprimir o preço do refrigerante
    public void imprimirPreco() {
        System.out.println ("####################");
        System.out.println ("# Preço ############");
        System.out.println ("# Refrigerante ");
        System.out.println ("# R$ " + preco);
        System.out.println ("##################");
    }

    //criando o método execultavel da classe
    public static void main (String args [] ) {
        //Vamos instanciar a classe

        MaquinaRefrigerante maquina = new MaquinaRefrigerante (5);
        //chamando um método 
        maquina.imprimirPreco();
    }

}

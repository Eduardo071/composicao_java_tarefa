public class Caminhao {
    boolean estaEstragado;
    float preco;
    String marca;
    
    public Caminhao(boolean estaEstragado, float preco, String marca) {
        this.estaEstragado = estaEstragado;
        this.preco = preco;
        this.marca = marca;
    }

    public void enganchar(){
        System.out.println("croccc");
    }

    public void entrar(){
        System.out.println("entrei");
    }
}

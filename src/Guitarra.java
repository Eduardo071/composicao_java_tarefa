public class Guitarra {
    boolean estaEstragado;
    float preco;
    String marca;
    
    public Guitarra(boolean estaEstragado, float preco, String marca) {
        this.estaEstragado = estaEstragado;
        this.preco = preco;
        this.marca = marca;
    }

    public void ligar(){
        System.out.println("Ligado");
    }

    public void desligar(){
        System.out.println("desligado");
    }
}

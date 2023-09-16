public class Violino {
    boolean estaEstragado;
    float preco;
    String marca;
    
    public Violino(boolean estaEstragado, float preco, String marca) {
        this.estaEstragado = estaEstragado;
        this.preco = preco;
        this.marca = marca;
    }

    public void tocar(){
        System.out.println("Tocando");
    }

    public void vender(){
        System.out.println("Anunciei pra venda");
    }
}

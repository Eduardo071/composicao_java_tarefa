public class Flauta {
    boolean estaEstragado;
    float preco;
    String marca;
    
    public Flauta(boolean estaEstragado, float preco, String marca) {
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

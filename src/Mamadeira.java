public class Mamadeira {
    boolean estaVazio;
    float preco;
    String marca;
    
    public Mamadeira(boolean estaVazio, float preco, String marca) {
        this.estaVazio = estaVazio;
        this.preco = preco;
        this.marca = marca;
    }

    public void mamar(){
        System.out.println("Mamei");
    }

    public void largar(){
        System.out.println("Larguei");
    }
}

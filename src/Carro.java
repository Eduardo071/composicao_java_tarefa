public class Carro{
    boolean estaEstragado;
    float preco;
    String marca;
    Piloto piloto;
    
    public Carro(boolean estaEstragado, float preco, String marca) {
        this.estaEstragado = estaEstragado;
        this.preco = preco;
        this.marca = marca;
    }

    public void acelerar(){
        System.out.println("VRUMMMMMMMMMMMM");
    }

    public void frear(){
        System.out.println("rrrrrrrrrrrrrrrrrrrrhhh");
    }
}
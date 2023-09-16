public class Chupeta {
    boolean estaSujo;
    float preco;
    String marca;
    
    public Chupeta(boolean estaSujo, float preco, String marca) {
        this.estaSujo = estaSujo;
        this.preco = preco;
        this.marca = marca;
    }

    public void chupar(){
        System.out.println("Chupando");
    }

    public void lavar(){
        System.out.println("shwwwwaaa");
    }
}

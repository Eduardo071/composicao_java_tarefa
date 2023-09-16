public class Bone {
    boolean estaSujo;
    float preco;
    String marca;
    
    public Bone(boolean estaSujo, float preco, String marca) {
        this.estaSujo = estaSujo;
        this.preco = preco;
        this.marca = marca;
    }

    public void vestir(){
        System.out.println("coloquei");
    }

    public void lavar(){
        System.out.println("shhwwawaaa");
    }
}

public class Brinquedo {
    boolean estaEstragado;
    float preco;
    String marca;
    
    public Brinquedo(boolean estaEstragado, float preco, String marca) {
        this.estaEstragado = estaEstragado;
        this.preco = preco;
        this.marca = marca;
    }

    public void brincar(){
        System.out.println("estou brincando");
    }

    public void guardar(){
        System.out.println("guardado");
    }
}

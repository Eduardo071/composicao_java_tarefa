public class GuardaChuva {
    boolean estaEstragado;
    float preco;
    String marca;
    
    public GuardaChuva(boolean estaEstragado, float preco, String marca) {
        this.estaEstragado = estaEstragado;
        this.preco = preco;
        this.marca = marca;
    }

    public void abrir(){
        System.out.println("Aberto");
    }

    public void fechar(){
        System.out.println("Fechado");
    }

}

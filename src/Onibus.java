public class Onibus {
    boolean estaEstragado;
    float precoPassagem;
    String marca;
    
    public Onibus(boolean estaEstragado, float precoPassagem, String marca) {
        this.estaEstragado = estaEstragado;
        this.precoPassagem = precoPassagem;
        this.marca = marca;
    }

    public void entrar(){
        System.out.println("Estou dentro");
    }

    public void sair(){
        System.out.println("Sai do ônibus");
    }
}

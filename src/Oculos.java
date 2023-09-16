public class Oculos {
    boolean ehDeSol;
    float preco;
    String marca;
    
    public Oculos(boolean ehDeSol, float preco, String marca) {
        this.ehDeSol = ehDeSol;
        this.preco = preco;
        this.marca = marca;
    }

    public void colocar(){
        System.out.println("Coloquei");
    }

    public void tirar(){
        System.out.println("Tirei");
    }
}

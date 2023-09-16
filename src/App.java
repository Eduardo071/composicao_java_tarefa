public class App {
    public static void main(String[] args) throws Exception {

        // Composição

        Bone bone = new Bone(false, (float) 25.4, "Gucci");
        Onibus onibus = new Onibus(true, (float) 4.5, "Sorriso de minas");
        Violino violino = new Violino(false, (float) 953.44, "Sony");
        Brinquedo brinquedo = new Brinquedo(false, (float) 10.99, "Kinder Ovo");
        Carro carro = new Carro(false, (float) 32567.58, "BMW");
        Guitarra guitarra = new Guitarra(false, (float) 500.0, "Outlier");
        Mamadeira mamadeira = new Mamadeira(false, (float) 10.50, "joys");
        Oculos oculos = new Oculos(false, (float) 365.42, "Cryzal");
        Caminhao caminhao = new Caminhao(false, (float) 843264.45, "Mercedes-benz");
        Flauta flauta = new Flauta(false, (float) 7458.65, "Mercury");
        Chupeta chupeta = new Chupeta(false, (float) 20.50, "Love");
        GuardaChuva guardaChuva = new GuardaChuva(false, (float) 21.50, "Louis Vitton");

        // Composição

        Carro carro2 = new Carro(true, (float) 84123.99, "Porshe");
        Piloto carro2Piloto = new Piloto();
        carro2Piloto.name = "Airton Senna";
        carro2.piloto = carro2Piloto;
        
        Aluno aluno = new Aluno();
        Escola escolaAluno = new Escola();
        escolaAluno.name = "UNIPAC";
        aluno.escola = escolaAluno;

        Professor professor = new Professor();
        Graduacao graduacaoProfessor = new Graduacao();
        graduacaoProfessor.tipoGraduação ="Bacharelado";
        professor.graduacao = graduacaoProfessor;

        Porta porta = new Porta();
        Macaneta macaneta = new Macaneta();
        macaneta.funciona = true;
        porta.macaneta = macaneta;

        Endereco endereco = new Endereco();
        Proprietario proprietario = new Proprietario();
        proprietario.name = "Cleiton";
        endereco.proprietario = proprietario;

        Disciplina disciplina = new Disciplina();
        ProfessorMateria professorMateria = new ProfessorMateria();
        professorMateria.name = "Lauro";
        disciplina.professor = professorMateria;

        Pneu pneu = new Pneu();
        CarroPneu carroPneu = new CarroPneu();
        carroPneu.name = "Corolla";
        pneu.carro = carroPneu;

        Documento documento = new Documento();
        DonoDocumento donoDocumento = new DonoDocumento();
        donoDocumento.name = "Samuel";
        documento.dono = donoDocumento;
        
    }
}

package padroescomportamentais.templatemethod;

public class JogadorJuvenil extends Jogador {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}

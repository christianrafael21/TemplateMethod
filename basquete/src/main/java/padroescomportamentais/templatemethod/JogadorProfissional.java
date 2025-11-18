package padroescomportamentais.templatemethod;

public class JogadorProfissional extends Jogador {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "JogadorPro";
    }
}

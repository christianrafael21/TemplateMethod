package padroescomportamentais.templatemethod;

public abstract class Jogador {

    private int numero;
    protected String nome;
    private float pontuacaoTeste1;
    private float pontuacaoTeste2;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPontuacaoTeste1() {
        return pontuacaoTeste1;
    }

    public void setPontuacaoTeste1(float pontuacaoTeste1) {
        this.pontuacaoTeste1 = pontuacaoTeste1;
    }

    public float getPontuacaoTeste2() {
        return pontuacaoTeste2;
    }

    public void setPontuacaoTeste2(float pontuacaoTeste2) {
        this.pontuacaoTeste2 = pontuacaoTeste2;
    }

    public float calcularMedia() {
        return (this.pontuacaoTeste1 + this.pontuacaoTeste2) / 2;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Jogador";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numero=" + this.numero +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}

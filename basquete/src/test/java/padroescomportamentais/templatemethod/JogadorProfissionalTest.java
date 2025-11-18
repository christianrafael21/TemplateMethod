package padroescomportamentais.templatemethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JogadorProfissionalTest {

    @Test
    void deveRetonarAprovado() {
        JogadorProfissional jogador = new JogadorProfissional();
        jogador.setPontuacaoTeste1(7.0f);
        jogador.setPontuacaoTeste2(7.0f);
        assertEquals("Aprovado", jogador.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        JogadorProfissional jogador = new JogadorProfissional();
        jogador.setPontuacaoTeste1(7.0f);
        jogador.setPontuacaoTeste2(6.9f);
        assertEquals("Reprovado", jogador.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        JogadorProfissional jogador = new JogadorProfissional();
        jogador.setPontuacaoTeste1(7.0f);
        jogador.setPontuacaoTeste2(7.0f);
        jogador.setNome("Michael");
        jogador.setNumero(23);
        assertEquals("JogadorPro{numero=23, nome='Michael', resultado=Aprovado}", jogador.getInfo());
    }
}

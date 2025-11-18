package padroescomportamentais.templatemethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class JogadorJuvenilTest {

    @Test
    void deveRetonarAprovado() {
        JogadorJuvenil jogador = new JogadorJuvenil();
        jogador.setPontuacaoTeste1(6.0f);
        jogador.setPontuacaoTeste2(6.0f);
        assertEquals("Aprovado", jogador.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        JogadorJuvenil jogador = new JogadorJuvenil();
        jogador.setPontuacaoTeste1(6.0f);
        jogador.setPontuacaoTeste2(5.9f);
        assertEquals("Reprovado", jogador.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        JogadorJuvenil jogador = new JogadorJuvenil();
        jogador.setPontuacaoTeste1(6.0f);
        jogador.setPontuacaoTeste2(5.9f);
        jogador.setNome("Carlos");
        jogador.setNumero(10);
        assertEquals("Jogador{numero=10, nome='Carlos', resultado=Reprovado}", jogador.getInfo());
    }
}

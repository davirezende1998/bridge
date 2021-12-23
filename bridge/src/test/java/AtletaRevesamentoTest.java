import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtletaRevesamentoTest {
    @Test
    void deveRetornarQuilometrosAtletaRevesamentoDietaLeve() {
        Dieta dieta = new Leve();
        AtletaRevesamento atleta = new AtletaRevesamento(30);
        atleta.setDieta(dieta);
        assertEquals(33.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }

    @Test
    void deveRetornarQuilometrosAtletaRevesamentoDietaMedia() {
        Dieta dieta = new Media();
        AtletaRevesamento atleta = new AtletaRevesamento(30);
        atleta.setDieta(dieta);
        assertEquals(39.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }

    @Test
    void deveRetornarQuilometrosAtletaRevesamentoDietaPesada() {
        Dieta dieta = new Pesada();
        AtletaRevesamento atleta = new AtletaRevesamento(30);
        atleta.setDieta(dieta);
        assertEquals(45.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Atleta100mRasosTest {
    @Test
    void deveRetornarQuilometrosAtleta100mRasosDietaLeve() {
        Dieta dieta = new Leve();
        Atleta100mRasos atleta = new Atleta100mRasos(20);
        atleta.setDieta(dieta);
        assertEquals(22.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }

    @Test
    void deveRetornarQuilometrosAtleta100mRasosDietaMedia() {
        Dieta dieta = new Media();
        Atleta100mRasos atleta = new Atleta100mRasos(20);
        atleta.setDieta(dieta);
        assertEquals(26.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }

    @Test
    void deveRetornarQuilometrosAtleta100mRasosDietaPesada() {
        Dieta dieta = new Pesada();
        Atleta100mRasos atleta = new Atleta100mRasos(20);
        atleta.setDieta(dieta);
        assertEquals(30.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }
}
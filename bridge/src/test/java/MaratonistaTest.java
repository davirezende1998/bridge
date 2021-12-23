import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaratonistaTest {
    @Test
    void deveRetornarQuilometrosMaratonistaDietaLeve() {
        Dieta dieta = new Leve();
        Maratonista atleta = new Maratonista(40);
        atleta.setDieta(dieta);
        assertEquals(40.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }

    @Test
    void deveRetornarQuilometrosMaratonistaDietaMedia() {
        Dieta dieta = new Media();
        Maratonista atleta = new Maratonista(40);
        atleta.setDieta(dieta);
        assertEquals(40.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }

    @Test
    void deveRetornarQuilometrosMaratonistaDietaPesada() {
        Dieta dieta = new Pesada();
        Maratonista atleta = new Maratonista(40);
        atleta.setDieta(dieta);
        assertEquals(40.0f, atleta.calcularQuilometrosPorTreino(), 0.01f);
    }
}
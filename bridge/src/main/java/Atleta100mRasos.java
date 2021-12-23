public class Atleta100mRasos extends Atleta {
    public Atleta100mRasos(float quilometrosPorTreino) {
        super(quilometrosPorTreino);
    }

    public float calcularQuilometrosPorTreino() {
        return this.quilometrosPorTreino * (1 + this.dieta.quilometrosExtras());
    }
}
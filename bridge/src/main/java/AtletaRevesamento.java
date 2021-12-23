public class AtletaRevesamento extends Atleta {
    public AtletaRevesamento(float quilometrosPorTreino) {
        super(quilometrosPorTreino);
    }

    public float calcularQuilometrosPorTreino() {
        return this.quilometrosPorTreino * (1 + this.dieta.quilometrosExtras());
    }
}
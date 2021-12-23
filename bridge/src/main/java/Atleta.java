public abstract class Atleta {

    protected Dieta dieta;

    protected float quilometrosPorTreino;

    public Atleta(float quilometrosPorTreino) {
        this.quilometrosPorTreino = quilometrosPorTreino;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public void setQuilometrosPorTreino(float quilometrosPorTreino) {
        this.quilometrosPorTreino = quilometrosPorTreino;
    }

    public abstract float calcularQuilometrosPorTreino();
}
public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {

    }

    public int getHorasDescanso() {
        return horasDescanso;
    }

    public int getNumeroSemanas() {
        return numeroSemanas;
    }

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    public String getStatusGeral() {
        if (numeroSemanas > 0) {
            if (horasDescanso / numeroSemanas >= 26) {
                return "descansado";
            } else {
                return "cansado";
            }
        }
        return "cansado";
    }
}

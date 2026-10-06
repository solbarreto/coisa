package lab02;

public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;
    private String statusGeral;

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
        if (horasDescanso / numeroSemanas >= 26) {
            String statusGeral = "descansado";
        } else {
            String statusGeral = "cansado";
        }

        return this.statusGeral;
    }
}

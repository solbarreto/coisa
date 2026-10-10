/**
 * Representação do controle do tempo de descanso de um estudante
 * no sistema.
 *
 * @author Sonaly Barreto Silva
 */
public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;
    /**
     * Status geral do descanso no sistema.
     * Todo statusGeral começa como "cansado". Possui como possíveis
     * estados: "cansado" e "descansado".
     * Para mudar de statusGeral de "cansado" para "descansado" o aluno
     * precisa registrar, no mínimo, 26 horas de descanso por semana.
     */
    private String statusGeral;

    /**
     * Constrói objeto dessa classe sem parâmetros de entrada. Todo descanso
     * começa com horas de descanso e numero de semanas nulos, e com
     * o status geral de descanso como "cansado".
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
        this.statusGeral = "cansado";
    }

    /**
     * Registra ou altera o inteiro que representa a quantidade de horas de
     * descanso no sistema.
     *
     * @param horasDescanso horas de descanso
     */
    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    /**
     * Registra ou altera o inteiro que representa o número de semanas
     * de descanso no sistema.
     *
     * @param numeroSemanas numero de semanas
     */
    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    /**
     * Retorna a String que representa o status geral do descanso no sistema.
     * A representação segue formato "status".
     *
     * @return statusGeral
     */
    public String getStatusGeral() {
        if (this.numeroSemanas == 0) {
            this.statusGeral = "cansado";
        } else {
            if (this.horasDescanso / this.numeroSemanas >= 26) {
                this.statusGeral = "descansado";
            } else {
                this.statusGeral = "cansado";
            }
        }
        return this.statusGeral;
    }
}

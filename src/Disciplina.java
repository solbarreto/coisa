import java.util.Arrays;

/**
 * Representação de uma disciplina no sistema.
 *
 * @author Sonaly Barreto Silva
 */
public class Disciplina {
    /**
     * O nome da disciplina é o identificador principal de um
     * objeto dessa classe.
     */
    private String nomeDisciplina;
    /**
     * Acumulador da quantidade de horas de estudo.
     * Sempre será inicializado como nulo (0).
     */
    private int horasDeEstudo;
    /**
     * Notas da disciplina. Caso não seja informada a quantidade de notas no
     * construtor o Array será inicilizado, por padrão, com tamanho = 4.
     */
    private double[] notas;
    /**
     * Pesos das notas. Caso não seja informado no construtor será
     * inicializado, por padrão, com o tamanho do Array notas
     * e com peso 1 em cada indice.
     */
    private int[] pesos;

    /**
     * Constrói um novo objeto dessa classe recebendo como parâmetro
     * o nome da disciplina.
     *
     * @param nomeDisciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[]{0, 0, 0, 0};
        this.pesos = new int[]{1, 1, 1, 1};
    }

    /**
     * Constrói um novo objeto dessa classe recebendo como parâmeto o
     * nome da disciplina e a quantidade de notas.
     *
     * @param nomeDisciplina
     * @param qntNotas
     */
    public Disciplina(String nomeDisciplina, int qntNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[qntNotas];
        this.pesos = new int[qntNotas];
        for (int i = 0; i < qntNotas; i++) {
            this.pesos[i] = 1;
        }
    }

    /**
     * Constrói um novo objeto dessa classe recebendo como parâmetro o
     * nome da disciplina, a quantidade de notas e os pesos das notas.
     *
     * @param nomeDisciplina
     * @param qntNotas
     * @param pesos
     */
    public Disciplina(String nomeDisciplina, int qntNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasDeEstudo = 0;
        this.notas = new double[qntNotas];
        this.pesos = pesos;
    }

    /**
     * Adiciona ao acumulador de horas de estudo o novo registro de horas.
     *
     * @param horas novas horas de estudo que vão ser incrementadas no acumulador.
     */
    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    /**
     * Registra uma nova nota no indice informado.
     *
     * @param id identificador da nota
     * @param nota nova nota a ser registrada
     */
    public void cadastraNota (int id, double nota) {
        this.notas[id-1] = nota;
    }

    /**
     * Realiza o cálculo da média do estudante na disciplina e retorna
     * e retorna a mesma ao final.
     *
     * @return média do estudante na disciplina em double.
     */
    public double calculaMedia() {
        double media = 0;
        for (int i = 0; i < this.notas.length; i++) {
            media += this.notas[i] / this.pesos[i];
        }

        int total = 0;
        for (int peso : this.pesos) {
            total += peso;
        }

        return (media / total);
    }

    /**
     * Retorna o status de aprovação do estudante na disciplina. Irá retornar
     * "true" para aprovado e "false" para reprovado.
     *
     * @return representação da aprovação em boolean.
     */
    public boolean aprovado() {
        return calculaMedia() >= 7;
    }

    /**
     * Retorna a String que representa a disciplina no sistema. A representação
     * segue o formato:
     * "<Nome da disciplina> <Horas de estudo> <Média> <Notas>."
     *
     * @return a representação em String da disciplina no sistema.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }

}

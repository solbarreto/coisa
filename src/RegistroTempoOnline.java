/**
 * Representação do registro de tempo online de um estudante no sistema.
 *
 * @author Sonaly Barreto Silva
 */
public class RegistroTempoOnline {
    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Acumulador do tempo online investido pelo estudante na
     * disciplina.
     */
    private int tempoOnlineInvestido;
    /**
     * Tempo online esperado à ser cumprido pelo estudante na disciplina.
     * Quando não informado no construtor será inicializado, por padrão, com
     * o valor 120.
     */
    private int tempoOnlineEsperado;

    /**
     * Constrói um objeto dessa classe recebendo como parâmetro o nome
     * da disciplina.
     * O tempoOnlineEsperado é inicializado com 120 como padrão do sistema.
     *
     * @param nomeDisciplina
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineInvestido = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Constrói um objeto dessa classe recebendo como parâmetro o nome da
     * disciplina e o tempo online esperado.
     *
     * @param nomeDisciplina
     * @param tempoOnlineEsperado
     */
    public RegistroTempoOnline(String nomeDisciplina,int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineInvestido = 0;
    }

    /**
     * Realiza o acréscimo do tempo online investido pelo estudante
     * na disciplina.
     *
     * @param tempoInformado
     */
    public void adicionaTempoOnline(int tempoInformado) {
        this.tempoOnlineInvestido += tempoInformado;
    }

    /**
     * Retorna um boolean decorrente da verificação da condição do
     * tempo online investido pelo estudante ter alcançãdo o tempo
     * online esperado.
     *
     * @return boolean
     */
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnlineInvestido >= this.tempoOnlineEsperado;
    }

    /**
     * Retorna a String que representa o registro de tempo online de um
     * estudante no sistema.
     * A representação segue o seguinte formato:
     * "<Nome da Disciplina> <Tempo Online Investido>/<Tempo Online Esperado>."
     *
     * @return a representação em String do registro de tempo online.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineInvestido + "/" + this.tempoOnlineEsperado;
    }


}


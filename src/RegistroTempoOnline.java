public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineInvestido;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineInvestido = 0;
        this.tempoOnlineEsperado = 120;
    }

    public RegistroTempoOnline(String nomeDisciplina,int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineInvestido = 0;
    }

    public void adicionaTempoOnline(int tempoOnlineInvestido) {
        this.tempoOnlineInvestido += tempoOnlineInvestido;
    }

    public boolean atingiuMetaTempoOnline() {
        return tempoOnlineInvestido >= tempoOnlineEsperado;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineInvestido + "/" + this.tempoOnlineEsperado;
    }


}


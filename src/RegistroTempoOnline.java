package lab02;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineInvestido;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina){
        this.tempoOnlineInvestido = 0;
        this.tempoOnlineEsperado = 120;
    }

    public RegistroTempoOnline(String nomeDisciplina,int tempoOnlineEsperado) {
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineInvestido = 0;
    }

    public void adicionaTempoOnline(int tempoOnlineInvestido) {
        this.tempoOnlineInvestido += tempoOnlineInvestido;
    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoOnlineInvestido >= tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineInvestido + "/" + this.tempoOnlineEsperado;
    }


}


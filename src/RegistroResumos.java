package lab02;

public class RegistroResumos {
    private String[] resumos;
    private int qntResumos;
    private String[] temas;
    private int i;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new String[numeroDeResumos];
        this.temas = new String[numeroDeResumos];
        this.qntResumos = 0;
        this.i = 0;
    }

    public void adiciona(String tema, String conteudo) {
        if (!(checaTema(tema))) {
            this.resumos[i] = conteudo;
            this.temas[i] = tema;
            this.i = (this.i + 1) % resumos.length;
        }
    }

    private boolean checaTema(String tema) {
        for (int i = 0; i < this.temas.length; i++) {
            if (temas[i] == null) {
                return false;
            }
            else if (this.temas[i].equals(tema)) {
                    return true;
                }
        }
        return false;
    }

    public String[] pegaResumos() {
        return this.resumos;
    }

    public String imprimeResumos() {
        String saida = "- " + qntResumos + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0; i < this.temas.length; i++) {
            if (this.temas[i] == null) {
                break;
            } else {
                saida += this.temas[i] + " | ";
            }
        }
        return saida;
    }

    public int conta() {
        return this.qntResumos;
    }

    public boolean temResumo(String tema) {
        if (checaTema(tema)) {
            return true;
        } return false;
    }
}

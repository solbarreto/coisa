import java.util.Arrays;

/**
 * Representação do registro de resumos no sistema.
 *
 * @author Sonaly Barreto Silva
 */
public class RegistroResumos {
    private Resumo[] resumos; // Array do tipo Resumo
    /**
     * qntResumos é um acumulador. Irá acumular a quantidade de resumos
     * registrados no sistema.
     */
    private int qntResumos;
    /**
     * iResumo é o iterador do Array resumos. Irá apontar o índice vazio mais
     * próximo ao começo do Array.
     */
    private int iResumo;

    /**
     * Constrói um objeto dessa classe a partir do número limite
     * de resumos que haverá no registro.
     * O número de resumos irá definir o tamanho do Array de resumos.
     *
     * @param numeroDeResumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.qntResumos = 0;
        this.iResumo = 0;
    }

    /**
     * Registra um novo resumo no Array resumos. O registro só acontece caso
     * não exista outro resumo no Array com o mesmo tema.
     * Caso todos os espaços do Array resumos tenham sido preenchidos, os
     * próximos resumos serão adicionados do primeiro indice do Array em diante.
     *
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public void adiciona(String tema, String conteudo) {
        if (!(temResumo(tema))) {
            this.resumos[iResumo] = new Resumo(tema, conteudo);
            this.iResumo = (this.iResumo + 1) % resumos.length;

            if (this.qntResumos < this.resumos.length) {
                this.qntResumos++;
            }
        }
    }

    /**
     * Checa a possibilidade de existir algum resumo com o tema
     * passado como parâmetro.
     *
     * @param tema tema do resumo
     * @return boolean que informa se o tema existe (true) ou não (false)
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.qntResumos; i++) {
            if (this.resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna a representação dos resumos em um Array de Strings.
     *
     * @return representação em Array de Strings dos resumos.
     */
    public String[] pegaResumos() {
        String[] resumos = new String[this.qntResumos];

        for (int i = 0; i < this.qntResumos; i++) {
            resumos[i] = this.resumos[i].toString();
        }
        return resumos;
    }

    /**
     * Retorna a representação textual dos registro de resumos do sistema.
     *
     * A representação segue o seguinte formato:
     * """
     * - <numeroDeResumos> resumo(s) cadastrado(s) no sistema.
     * - <tema1>
     * - <tema2>
     * ...
     * - <temaN>
     * """
     *
     * @return representação textual dos registros de resumos.
     */
    public String imprimeResumos() {
        StringBuffer saida = new StringBuffer();
        saida.append("Resumos:\n");
        saida.append("- " + this.qntResumos + " resumo(s) cadastrado(s)\n");

        if (this.qntResumos > 0) {
            saida.append("- ");
            for (int i = 0; i < this.qntResumos; i++) {
                saida.append(this.resumos[i].getTema());
                if (i < this.qntResumos - 1) {
                    saida.append(" | ");
                }
            }
        }
        return saida.toString();
    }

    public int conta() {
        return this.qntResumos;
    }

    /**
     * Busca a String chaveDeBusca no Array resumos e retorna
     * um Array de Strings com os temas dos resumos encontrados.
     *
     * @param chaveDeBusca
     * @return Array de Strings com os temas dos resumos encontrados.
     */
    public String[] busca(String chaveDeBusca) {
        String[] base = new String[this.qntResumos];
        int iResult = 0;

        for (int i = 0; i < this.qntResumos; i++) {
            if (this.resumos[i].getConteudo().contains(chaveDeBusca)) {
                base[iResult++] = this.resumos[i].getTema();
            }
        }

        String[] resultados = new String[iResult];
        for (int i = 0; i < iResult; i++) {
            resultados[i] = base[i];
        }

        Arrays.sort(resultados);
        return resultados;
    }
}

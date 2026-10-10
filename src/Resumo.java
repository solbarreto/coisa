/**
 * Representação de um Resumo no Sistema.
 * Ligação de composição com RegistroResumos.
 *
 * @author Sonaly Barreto Silva
 */

public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * Constrói um objeto dessa classe a partir de seu tema e conteudo.
     * Todo resumo possui tema e conteudo.
     *
     * @param tema
     * @param conteudo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna a String que representa o tema do resumo.
     *
     * @return o tema do resumo.
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Retorna a String que representa o conteudo do resumo.
     *
     * @return o conteudo do resumo.
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Retorna a String que representa o resumo. A representação segue
     * o formato "Tema: Conteudo".
     *
     * @return a representação em String de um resumo.
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}

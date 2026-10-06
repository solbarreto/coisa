package lab02;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.horas = 0;
        this.notas = new double[]{0, 0, 0, 0};
    }

    public void cadastraHoras(int horas) {
        this.horas = horas;
    }

    public void cadastraNota (int id, double nota) {
        this.notas[id-1] = nota;
    }

    private double calculaMedia() {
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        return (soma / 4);
    }

    public boolean aprovado() {
        double media = calculaMedia();
        if (media >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horas + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }

}

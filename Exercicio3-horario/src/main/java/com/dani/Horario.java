package com.dani;

public class Horario {
    int hora;
    int minuto;
    int segundo;

    public Horario(int hora, int minuto, int segundo) {
        this.hora = validarHora(hora);
        this.minuto = validarMinutoOuSegundo(minuto, "minuto");
        this.segundo = validarMinutoOuSegundo(segundo, "segundo");
    }

    public Horario(int hora) {
        this.hora = validarHora(hora);
    }

    public Horario() {
    }


    /**
     * Valida o valor da hora.
     *
     * @param hora O valor da hora a ser validado
     * @return o valor da hora, ou 0 se o valor estiver fora do intervalo permitido
     */
    private int validarHora(int hora){
        if (hora < 0 || hora > 23) {
            System.out.println("Erro no valor da hora");
            return 0;
        }
        return hora;
    }


    /**
     * Valida o valor do minuto ou segundo.
     *
     * @param valor O valor do minuto ou segundo a ser validado
     * @param tipo O tipo de valor ("minuto" ou "segundo") para mensagens de erro
     * @return o valor do minuto ou segundo, ou 0 se o valor estiver fora do intervalo permitido
     */
    private int validarMinutoOuSegundo(int valor, String tipo) {
        if (valor < 0 || valor > 59) {
            System.out.println("Erro no valor do " + tipo);
            return 0;
        }
        return valor;
    }


    @Override
    public String toString() {
        return "Horario{" + "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
    }
}

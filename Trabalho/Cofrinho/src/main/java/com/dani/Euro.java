package dani;

public class Euro extends Moeda {

    /*
     * classe dani.Euro que herda dani.Moeda, implementa metodos da classe mae
     */

    public Euro() {
    }

    @Override
    public String getNome() {
        return "Euro";
    }

    @Override
    public String info() {
        return String.format("Euro:      %.2f €", getValorSaldo());
    }

    @Override
    public double converter() {

        return (getValorSaldo() * getCotacao());
    }
}

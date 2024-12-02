package models;

public class Mesa {
    private String numeroMesa;
    private double valorReserva;
    private EnumTipo tipoMesa;

    public Mesa(String numeroMesa, double valorReserva, EnumTipo tipoMesa) {
        this.numeroMesa = numeroMesa;
        this.valorReserva = valorReserva;
        this.tipoMesa = tipoMesa;
    }

    @Override
    public String toString() {
        return String.format("Mesa:\n" +
                             "  Número: %s\n" +
                             "  Valor da Reserva: R$ %.2f\n" +
                             "  Tipo: %s",
                             numeroMesa, valorReserva, tipoMesa);
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;

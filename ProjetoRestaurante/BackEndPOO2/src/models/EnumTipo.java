package models;

public enum EnumTipo {

    COMUM("Comum"),
    VIP("VIP"),
    RESERVADA("Reservada");

    private String valor;

    private EnumTipo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

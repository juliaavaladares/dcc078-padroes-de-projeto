package main.java.padroesEstruturais.flyweight;

public enum CafeSabores {
    CAPPUCCINO("Cappuccino"),
    EXPRESSO("Expresso"),
    FRAPPUCCINO("Frappuccino"),
    AFFOGATO("Affogato"),
    LATTE("Latte");

    private String name;

    CafeSabores(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

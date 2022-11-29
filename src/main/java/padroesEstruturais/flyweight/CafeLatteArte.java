package main.java.padroesEstruturais.flyweight;

public enum CafeLatteArte {
    DISNEY("Disney"), 
    COELHO("Coelho"), 
    ARTE_TRADICIONAL("Arte Tradicional"),
    ESPINHA_PEIXE("Espinha De Peixe"), 
    GATO("Gato"),
    CORACAO("Coracao");
    
    private String name;

     CafeLatteArte(String name) {
        this.name = name;
    }
    public String getName() { return name;}
}

package main.java.padroesCriacao.builder;

public class PizzaBuilder {

    private Pizza pizza;
    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public Pizza build(){
        if (pizza.getTamanho() == 0) {
            throw new IllegalArgumentException("Tamanho não informado");
        }
        
        return pizza;
    }
    
    public PizzaBuilder setTamanho(int tamanho) {
        pizza.setTamanho(tamanho); 
        return this;
    }
   
    public PizzaBuilder setQueijo(boolean queijo) {
        pizza.setQueijo(queijo);
        return this;
    }
    
    public PizzaBuilder setTomate(boolean tomate) {
        pizza.setTomate(tomate);
        return this;
    }
    
    public PizzaBuilder setBacon(boolean bacon) {
        pizza.setBacon(bacon);
        return this;
    }
   
    public PizzaBuilder setBorda(boolean borda) {
        pizza.setBorda(borda);
        return this;
    }
   
    public PizzaBuilder setSaborBorda(String saborBorda) {
        pizza.setSaborBorda(saborBorda);
        return this;
    }

    
}

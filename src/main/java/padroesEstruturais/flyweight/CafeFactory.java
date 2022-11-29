package main.java.padroesEstruturais.flyweight;

import java.util.Map;
import java.util.HashMap;

public class CafeFactory {
    private static Map<CafeSabores, Cafe> cafes = new HashMap<CafeSabores, Cafe>();

    public static Cafe fazerCafe(CafeSabores nomeSabor, CafeLatteArte latteArte) {
        Cafe Cafe = cafes.get(nomeSabor);

        if (Cafe == null) {
            Cafe = new Cafe(nomeSabor);
            cafes.put(nomeSabor, Cafe);
        }

        Cafe.applyLatteArte(latteArte);

        return Cafe;

    }

    public static int getNumeroDeCafes() {
        return cafes.size();
    }
}

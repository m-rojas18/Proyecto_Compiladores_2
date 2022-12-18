import java.util.*;

public class TablaSimbolo {

    Map<String, Simbolo> lista_simbolos;
    private String scope = "global";

    public TablaSimbolo(){
        this.lista_simbolos = new HashMap<String, Simbolo>();
    }

    public String getScope(){
        return this.scope;
    }

    public void add_type(String id, String type){
        Simbolo sim = new Simbolo(id, type);
        lista_simbolos.put(sim.getNombre(),sim);
    }

    public String get_type(String id){
        return  lista_simbolos.get(id).getTipo();
    }

}

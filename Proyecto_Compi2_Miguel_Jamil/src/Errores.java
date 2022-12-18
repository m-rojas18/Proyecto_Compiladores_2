public class Errores {
     private int linea;
     private int columna;
     private String tipo;
     private String tokenInvalido;

    public Errores(int linea, int columna, String tipo, String tokenInvalido) {
        this.linea = linea;
        this.columna = columna;
        this.tipo = tipo;
        this.tokenInvalido = tokenInvalido;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTokenInvalido() {
        return tokenInvalido;
    }

    public void setTokenInvalido(String tokenInvalido) {
        this.tokenInvalido = tokenInvalido;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Error " + getTipo() +", token invalido : " + getTokenInvalido() +
                " (linea: " + getLinea() + ", columna: " + getColumna() + "); "
                ;
    }
}


import org.antlr.v4.runtime.*;

import java.util.ArrayList;

public class MyVisitor extends GrammarPascalBaseVisitor<Object> {

    public TablaSimbolo tablaSim ;
    public ArrayList<String> erroresSemanticos = new ArrayList<String>();

    public MyVisitor (TablaSimbolo tablaSimbolo){
        this.tablaSim = tablaSimbolo;
    }

    public TablaSimbolo getTablaSim(){
        return tablaSim;
    }

    public ArrayList<String> getErroresSemanticos()  {
        return erroresSemanticos;
    }

    @Override public Object visitPrograma(GrammarPascalParser.ProgramaContext ctx) {
        //System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Object visitInicioPrograma(GrammarPascalParser.InicioProgramaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitListaIdentificadores(GrammarPascalParser.ListaIdentificadoresContext ctx) {
        //System.out.println("ID: " + ctx.getText());
        return visitChildren(ctx); }

    @Override public Object visitIdentificador(GrammarPascalParser.IdentificadorContext ctx) {
        //System.out.println("ID: " + ctx.getText());
        /*
        * Verificar antes de agregar a la tabla si esta vacia, y si ya existe la variable duplicada
        * */
        return visitChildren(ctx);
    }
    @Override public Object visitDeclaraciones(GrammarPascalParser.DeclaracionesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitEspacioDeclaracionVar(GrammarPascalParser.EspacioDeclaracionVarContext ctx) { return visitChildren(ctx); }

    @Override public Object visitListaDeclaracionVar(GrammarPascalParser.ListaDeclaracionVarContext ctx) {

            //Revisar si hay mas de 1 identificador
            try {
                if(ctx.listaIdentificadores().listaIdentificadores() == null){
                    //Solo hay un Identificador
                    String nombre = ctx.listaIdentificadores().identificador().getText();
                    //System.out.println(ctx.especificadorTipo().tipo);
                    //Verificar que el elemento no este duplicado en la tabla de simbolos
                    if(!tablaSim.lista_simbolos.isEmpty() && tablaSim.lista_simbolos.get(nombre) != null){
                        //Indicar error semantico de variable duplicada
                        Token t = ctx.getStart();//Obtener objeto token para conseguir linea e indicar el error
                        int linea_error = t.getLine();
                        erroresSemanticos.add("Error Semantico: " + "linea(" + linea_error + ") la variable \'" + nombre
                                + "\' esta duplicada,  ya fue declarada en el espacio de declaraciones para variables." );
                    } else {
                        tablaSim.add_type(nombre, ctx.especificadorTipo().tipo);
                    }

                } else {
                    //Hay una lista de identificadores
                    String[] result = ctx.listaIdentificadores().getText().split(",");
                    for(int i = 0; i < result.length; i ++){
                        if(!tablaSim.lista_simbolos.isEmpty() && tablaSim.lista_simbolos.get(result[i]) != null){
                            //Indicar error semantico de variable duplicada
                            Token t = ctx.getStart();//Obtener objeto token para conseguir linea e indicar el error
                            int linea_error = t.getLine();
                            erroresSemanticos.add("Error Semantico: " + "linea(" + linea_error + ") la variable \'" + result[i]
                                    + "\' esta duplicada,  ya fue declarada en el espacio de declaraciones para variables." );
                        } else {
                            tablaSim.add_type(result[i], ctx.especificadorTipo().tipo);
                        }

                    }
                }
            }catch(NullPointerException e){
                 //Ignorar null pointer para no quebrar el programa
            }


        return visitChildren(ctx);
    }

    @Override public Object visitSentencia_compuesta(GrammarPascalParser.Sentencia_compuestaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSentencia(GrammarPascalParser.SentenciaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSentenciaAsignacion(GrammarPascalParser.SentenciaAsignacionContext ctx) {

        //Validacion semantica
        /* Revisar si el identificador se ha declarado antes(esta en la tabla de simbolos),
        sino es error semantico*/
        //Revisar si se puso el nombre de id

        Token t = ctx.getStart();//Obtener objeto token para conseguir linea e indicar el error
        int linea_error = t.getLine();
        if(ctx.ID().getText() != null){

            String idAsignacion = ctx.ID().getText();
            if(!tablaSim.lista_simbolos.isEmpty()){
                //Revisar si
                if( tablaSim.lista_simbolos.get(idAsignacion) == null) {
                    erroresSemanticos.add("Error Semantico: " + "linea(" + linea_error + ") la variable \'" + idAsignacion
                            + "\' no se ha declarado anteriormente.");
                }//Sino no agrega nada, existe la variable

            } else {
                //Tabla de simbolos esta vacia, agregar de un solo el error
                erroresSemanticos.add("Error Semantico: " + "linea(" + linea_error + ") la variable \'" + idAsignacion
                        + "\' no se ha declarado anteriormente." );
            }
        }

        //Validacion de asignacion de expresion  correcta
        /*  1. Obtener el valor de la constante de variables
            2. Ver que tipo de dato es ese valor (int, char, bool)
            3. Comparar el idAsigacion si da match su tipo, con el de el valor
        * */

        try {
            //1.
            String valor = ctx.expresion().expresion_Simple().termino().operando().constanteVariable().getText();
            //2.
            if(!tablaSim.lista_simbolos.isEmpty()){
                //Revisar si el valor es un numero
                boolean verificarNumero = isNumber(valor);
                String tipoValor = "";
                String nombre = ctx.ID().getText();//Nombre variable en idAsignacion
                String tipoIDAsignacion = tablaSim.get_type(nombre);//Obtener tipo de esa id asignacion

                if(verificarNumero){ //El valor es un numerp
                    tipoValor = "integer";
                } else {
                    //Valor no es un numero, verificar si el valor es un booleano
                    if(checkBoolean(valor))//Es un booleano
                        tipoValor = "boolean";
                     else //Es un char
                        tipoValor = "char";
                }
                //Hacer comparacion de tipos
                compararTipos(nombre, tipoIDAsignacion, tipoValor, linea_error);
            }

        } catch (NullPointerException e) {

        }


        return visitChildren(ctx);
    }

    public void compararTipos(String idAsignacion , String tipoVariable, String tipoValor, int linea_error) {
        if(!tipoVariable.equals(tipoValor)){

            erroresSemanticos.add("Error Semantico: " + "linea(" + linea_error + ") A la variable \'" + idAsignacion
                    + "\' de tipo " +tipoVariable + " se le intento asignar incorrectamente una expresion de tipo "+
                    tipoValor +"."
            );

        }
    }
    public boolean checkBoolean(String valor){
        String temp = valor.toLowerCase();
        if(temp.equals("true") || temp.equals("false")){
            return true;
        } else {
            return false;
        }
    }
    public boolean isNumber(String numero){
        try {
            int valor = Integer.parseInt(numero);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    @Override public Object visitSentencia_condicional(GrammarPascalParser.Sentencia_condicionalContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSentencia_ciclo(GrammarPascalParser.Sentencia_cicloContext ctx) {
        //System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Object visitSentencia_funciones(GrammarPascalParser.Sentencia_funcionesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpresion(GrammarPascalParser.ExpresionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCondicion(GrammarPascalParser.CondicionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpresionBooleana(GrammarPascalParser.ExpresionBooleanaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpresionRelacional(GrammarPascalParser.ExpresionRelacionalContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpresionIgual(GrammarPascalParser.ExpresionIgualContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpresion_Simple(GrammarPascalParser.Expresion_SimpleContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTermino(GrammarPascalParser.TerminoContext ctx) { return visitChildren(ctx); }

    @Override public Object visitOperando(GrammarPascalParser.OperandoContext ctx) { return visitChildren(ctx); }

    @Override public Object visitConstanteVariable(GrammarPascalParser.ConstanteVariableContext ctx) { return visitChildren(ctx); }

    @Override public Object visitEspecificadorTipo(GrammarPascalParser.EspecificadorTipoContext ctx) {
       // System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    @Override public Object visitSigno(GrammarPascalParser.SignoContext ctx) { return visitChildren(ctx); }
}

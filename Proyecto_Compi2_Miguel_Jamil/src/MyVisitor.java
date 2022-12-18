
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
        System.out.println(ctx.getText());
            if(ctx.listaIdentificadores().listaIdentificadores() == null){
                //Solo hay un Identificador
                String nombre = ctx.listaIdentificadores().identificador().getText();
                System.out.println(ctx.especificadorTipo().tipo);
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
                        int linea_error = t.getLine() + 1;
                        erroresSemanticos.add("Error Semantico: " + "linea(" + linea_error + ") la variable \'" + result[i]
                                + "\' esta duplicada,  ya fue declarada en el espacio de declaraciones para variables." );
                    } else {
                        tablaSim.add_type(result[i], ctx.especificadorTipo().tipo);
                    }

                }
            }

        return visitChildren(ctx);
    }

    @Override public Object visitSentencia_compuesta(GrammarPascalParser.Sentencia_compuestaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSentencia(GrammarPascalParser.SentenciaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSentenciaAsignacion(GrammarPascalParser.SentenciaAsignacionContext ctx) {

        return visitChildren(ctx);
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

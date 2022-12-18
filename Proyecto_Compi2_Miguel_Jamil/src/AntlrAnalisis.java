
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class AntlrAnalisis{

    public static void main(String[] args){

        ArrayList<Errores> erroresAnalisis = new ArrayList<Errores>();
        try {
            String nombreArchivo = "program TestWhile;  \n " +
                    "var \n" +
                    "i :integer;\n" +
                    "i: boolean; ";
//            CharStream charStream = CharStreams.fromFileName(nombreArchivo);

            //Llamar al lexer CharStreams.fromString("cadena"
            CharStream charStream = CharStreams.fromString(nombreArchivo);
            GrammarPascalLexer lexer = new GrammarPascalLexer(charStream);//Generar objeto lexer
            //Seccion errores lexicos
            lexer.removeErrorListeners();//Deshabilitar manejo de errores de antlr
            lexer.addErrorListener(new BaseErrorListener(){
                @Override//Sobreescribir metodo de errores de ANTLR
                public void syntaxError(Recognizer<? , ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
                    //Obtener token
                    int index = msg.indexOf(':');
                    erroresAnalisis.add(new Errores(line, charPositionInLine, "Lexico", msg.substring(index + 1)));
                }
            });

            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            GrammarPascalParser parser = new GrammarPascalParser(commonTokenStream);
            //Seccion errores parser
            parser.removeErrorListeners();

            ParseTree tree = parser.programa();//Nombre produccion inicial
            TablaSimbolo tablaSimbolo = new TablaSimbolo();
            MyVisitor visitor = new MyVisitor(tablaSimbolo );


            //Mostrar errores lexicos
           /* if(!erroresAnalisis.isEmpty()){
                for (Errores e : erroresAnalisis){
                    System.err.println(e);
                }
            } else {
                System.out.println("No hubo errores lexicos.");
            }*/
            visitor.visit(tree);
            tablaSimbolo = visitor.getTablaSim();
            System.out.println(tablaSimbolo.lista_simbolos);
            for(String i : visitor.getErroresSemanticos()){
                System.err.println(i);
            }
        } catch(Exception e){
            e.printStackTrace();
        }




    }
}
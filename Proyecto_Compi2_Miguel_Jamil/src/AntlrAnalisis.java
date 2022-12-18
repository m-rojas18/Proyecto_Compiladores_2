
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AntlrAnalisis{

    public static void main(String[] args){

        ArrayList<String> erroresAnalisis = new ArrayList<String>();
        TablaSimbolo tablaSimbolo = new TablaSimbolo();
        try {
            String nombreArchivo = args[0];
            if(nombreArchivo != null){
                CharStream charStream = CharStreams.fromFileName("./" + nombreArchivo);

                GrammarPascalLexer lexer = new GrammarPascalLexer(charStream);//Generar objeto lexer
                //Seccion errores lexicos
                lexer.removeErrorListeners();//Deshabilitar manejo de errores de antlr
                lexer.addErrorListener(new BaseErrorListener(){
                    @Override//Sobreescribir metodo de errores de ANTLR
                    public void syntaxError(Recognizer<? , ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
                        //Obtener token
                        int index = msg.indexOf(':');
                        Errores temp = new Errores(line, charPositionInLine, "Lexico", msg.substring(index + 1));
                        erroresAnalisis.add(temp.getMensajeError());
                    }
                });

                CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
                GrammarPascalParser parser = new GrammarPascalParser(commonTokenStream);
                //Seccion errores parser
                parser.removeErrorListeners();//Quitar errores de parser automaticos
                MyErrorListener listenerErroresParser = new MyErrorListener();
                parser.addErrorListener(listenerErroresParser);

                ParseTree tree = parser.programa();//Nombre produccion inicial
                //Obtener errores sintacticos y mostralos
                if(!listenerErroresParser.getErroresSintacticos().isEmpty()){
                    System.out.println("Hola");
                    for(String error : listenerErroresParser.getErroresSintacticos()){
                        erroresAnalisis.add(error);//Recorrer lista de errores sintacticos y
                    }
                }


                MyVisitor visitor = new MyVisitor(tablaSimbolo );

                visitor.visit(tree);
                tablaSimbolo = visitor.getTablaSim();
                //Poner errores semanticos en lista de errores
                for(String errorSemantico : visitor.getErroresSemanticos()){
                    erroresAnalisis.add(errorSemantico);
                }
                imprimirErrores(erroresAnalisis);
            }
            //Llamar al lexer CharStreams.fromString("cadena"
            //CharStream charStream = CharStreams.fromString(nombreArchivo);

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    static public void imprimirErrores(ArrayList<String> errores){
        System.out.print("Errores en analisis de codigo fuente: \n");
        for(String e: errores){
            System.err.println(e);
        }
    }
}
import org.antlr.v4.runtime.*;

import java.util.ArrayList;

public class MyErrorListener extends BaseErrorListener{

    public ArrayList<String> erroresSintacticos = new ArrayList<String>();

    public void MyErrorListener(){};

    public ArrayList<String> getErroresSintacticos(){
        return erroresSintacticos;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int columna, String msg, RecognitionException e)
    {
        erroresSintacticos.add("Error Sintactico: (linea: "+line+", columna: "+columna +") "+msg);

        underlineError(recognizer,(Token)offendingSymbol,
                line, columna);
    }
    protected void underlineError(Recognizer recognizer, Token offendingToken, int linea, int columna) {
        CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[linea - 1];
        //erroresSintacticos.add(errorLine);
        //System.err.println(errorLine);
        String inidicador ="";
        for (int i=0; i<columna; i++) inidicador += " ";//System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start>=0 && stop>=0 ) {
            //erroresSintacticos.add(inidicador + "^");//System.err.print("^");
        }
        //erroresSintacticos.add("\n");
        //System.err.println();
    }
}

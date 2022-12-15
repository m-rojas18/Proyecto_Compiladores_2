
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class AntlrAnalisis{

    public static void main(String[] args) throws IOException{
        CharStream charStream = CharStreams.fromFileName("./ejemplo.pas");
        System.out.println();
    }
}
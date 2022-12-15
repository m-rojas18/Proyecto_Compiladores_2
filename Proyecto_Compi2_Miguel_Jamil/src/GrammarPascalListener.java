// Generated from /Users/miguel/Documents/UNITEC/4 year/Trimestre 14/Compiladores II/Proyecto/Proyecto_Compiladores_2/Proyecto_Compi2_Miguel_Jamil/src/GrammarPascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarPascalParser}.
 */
public interface GrammarPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GrammarPascalParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GrammarPascalParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#inicioPrograma}.
	 * @param ctx the parse tree
	 */
	void enterInicioPrograma(GrammarPascalParser.InicioProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#inicioPrograma}.
	 * @param ctx the parse tree
	 */
	void exitInicioPrograma(GrammarPascalParser.InicioProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void enterListaIdentificadores(GrammarPascalParser.ListaIdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void exitListaIdentificadores(GrammarPascalParser.ListaIdentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(GrammarPascalParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(GrammarPascalParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#espacioDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void enterEspacioDeclaracionVar(GrammarPascalParser.EspacioDeclaracionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#espacioDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void exitEspacioDeclaracionVar(GrammarPascalParser.EspacioDeclaracionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#listaDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracionVar(GrammarPascalParser.ListaDeclaracionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#listaDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracionVar(GrammarPascalParser.ListaDeclaracionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#sentencia_compuesta}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_compuesta(GrammarPascalParser.Sentencia_compuestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#sentencia_compuesta}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_compuesta(GrammarPascalParser.Sentencia_compuestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#sentencias_opcionales}.
	 * @param ctx the parse tree
	 */
	void enterSentencias_opcionales(GrammarPascalParser.Sentencias_opcionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#sentencias_opcionales}.
	 * @param ctx the parse tree
	 */
	void exitSentencias_opcionales(GrammarPascalParser.Sentencias_opcionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(GrammarPascalParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(GrammarPascalParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#sentenciaAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaAsignacion(GrammarPascalParser.SentenciaAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#sentenciaAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaAsignacion(GrammarPascalParser.SentenciaAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#sentencia_condicional}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_condicional(GrammarPascalParser.Sentencia_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#sentencia_condicional}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_condicional(GrammarPascalParser.Sentencia_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#sentencia_ciclo}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_ciclo(GrammarPascalParser.Sentencia_cicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#sentencia_ciclo}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_ciclo(GrammarPascalParser.Sentencia_cicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#sentencia_funciones}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_funciones(GrammarPascalParser.Sentencia_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#sentencia_funciones}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_funciones(GrammarPascalParser.Sentencia_funcionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GrammarPascalParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GrammarPascalParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(GrammarPascalParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(GrammarPascalParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#expresionBooleana}.
	 * @param ctx the parse tree
	 */
	void enterExpresionBooleana(GrammarPascalParser.ExpresionBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#expresionBooleana}.
	 * @param ctx the parse tree
	 */
	void exitExpresionBooleana(GrammarPascalParser.ExpresionBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelacional(GrammarPascalParser.ExpresionRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelacional(GrammarPascalParser.ExpresionRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#expresionIgual}.
	 * @param ctx the parse tree
	 */
	void enterExpresionIgual(GrammarPascalParser.ExpresionIgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#expresionIgual}.
	 * @param ctx the parse tree
	 */
	void exitExpresionIgual(GrammarPascalParser.ExpresionIgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#expresion_Simple}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_Simple(GrammarPascalParser.Expresion_SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#expresion_Simple}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_Simple(GrammarPascalParser.Expresion_SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(GrammarPascalParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(GrammarPascalParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(GrammarPascalParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(GrammarPascalParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#constanteVariable}.
	 * @param ctx the parse tree
	 */
	void enterConstanteVariable(GrammarPascalParser.ConstanteVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#constanteVariable}.
	 * @param ctx the parse tree
	 */
	void exitConstanteVariable(GrammarPascalParser.ConstanteVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#especificadorTipo}.
	 * @param ctx the parse tree
	 */
	void enterEspecificadorTipo(GrammarPascalParser.EspecificadorTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#especificadorTipo}.
	 * @param ctx the parse tree
	 */
	void exitEspecificadorTipo(GrammarPascalParser.EspecificadorTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarPascalParser#signo}.
	 * @param ctx the parse tree
	 */
	void enterSigno(GrammarPascalParser.SignoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarPascalParser#signo}.
	 * @param ctx the parse tree
	 */
	void exitSigno(GrammarPascalParser.SignoContext ctx);
}
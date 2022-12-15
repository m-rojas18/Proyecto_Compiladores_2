// Generated from /Users/miguel/Documents/UNITEC/4 year/Trimestre 14/Compiladores II/Proyecto/Proyecto_Compiladores_2/Proyecto_Compi2_Miguel_Jamil/src/ParserPascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserPascal}.
 */
public interface ParserPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserPascal#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ParserPascal.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ParserPascal.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#inicioPrograma}.
	 * @param ctx the parse tree
	 */
	void enterInicioPrograma(ParserPascal.InicioProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#inicioPrograma}.
	 * @param ctx the parse tree
	 */
	void exitInicioPrograma(ParserPascal.InicioProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void enterListaIdentificadores(ParserPascal.ListaIdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void exitListaIdentificadores(ParserPascal.ListaIdentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(ParserPascal.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(ParserPascal.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#espacioDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void enterEspacioDeclaracionVar(ParserPascal.EspacioDeclaracionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#espacioDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void exitEspacioDeclaracionVar(ParserPascal.EspacioDeclaracionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#listaDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracionVar(ParserPascal.ListaDeclaracionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#listaDeclaracionVar}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracionVar(ParserPascal.ListaDeclaracionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#sentencia_compuesta}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_compuesta(ParserPascal.Sentencia_compuestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#sentencia_compuesta}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_compuesta(ParserPascal.Sentencia_compuestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#sentencias_opcionales}.
	 * @param ctx the parse tree
	 */
	void enterSentencias_opcionales(ParserPascal.Sentencias_opcionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#sentencias_opcionales}.
	 * @param ctx the parse tree
	 */
	void exitSentencias_opcionales(ParserPascal.Sentencias_opcionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ParserPascal.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ParserPascal.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#sentenciaAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaAsignacion(ParserPascal.SentenciaAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#sentenciaAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaAsignacion(ParserPascal.SentenciaAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#sentencia_condicional}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_condicional(ParserPascal.Sentencia_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#sentencia_condicional}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_condicional(ParserPascal.Sentencia_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#sentencia_ciclo}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_ciclo(ParserPascal.Sentencia_cicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#sentencia_ciclo}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_ciclo(ParserPascal.Sentencia_cicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#sentencia_funciones}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_funciones(ParserPascal.Sentencia_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#sentencia_funciones}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_funciones(ParserPascal.Sentencia_funcionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ParserPascal.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ParserPascal.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#expresionBooleana}.
	 * @param ctx the parse tree
	 */
	void enterExpresionBooleana(ParserPascal.ExpresionBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#expresionBooleana}.
	 * @param ctx the parse tree
	 */
	void exitExpresionBooleana(ParserPascal.ExpresionBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#expresion_Simple}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_Simple(ParserPascal.Expresion_SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#expresion_Simple}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_Simple(ParserPascal.Expresion_SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(ParserPascal.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(ParserPascal.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(ParserPascal.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(ParserPascal.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#constanteVariable}.
	 * @param ctx the parse tree
	 */
	void enterConstanteVariable(ParserPascal.ConstanteVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#constanteVariable}.
	 * @param ctx the parse tree
	 */
	void exitConstanteVariable(ParserPascal.ConstanteVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserPascal#especificadorTipo}.
	 * @param ctx the parse tree
	 */
	void enterEspecificadorTipo(ParserPascal.EspecificadorTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserPascal#especificadorTipo}.
	 * @param ctx the parse tree
	 */
	void exitEspecificadorTipo(ParserPascal.EspecificadorTipoContext ctx);
}
// Generated from /Users/miguel/Documents/UNITEC/4 year/Trimestre 14/Compiladores II/Proyecto/Proyecto_Compiladores_2/Proyecto_Compi2_Miguel_Jamil/src/ParserPascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserPascal}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserPascal#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ParserPascal.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#inicioPrograma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicioPrograma(ParserPascal.InicioProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#listaIdentificadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIdentificadores(ParserPascal.ListaIdentificadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(ParserPascal.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#espacioDeclaracionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacioDeclaracionVar(ParserPascal.EspacioDeclaracionVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#listaDeclaracionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracionVar(ParserPascal.ListaDeclaracionVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#sentencia_compuesta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_compuesta(ParserPascal.Sentencia_compuestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#sentencias_opcionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias_opcionales(ParserPascal.Sentencias_opcionalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ParserPascal.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#sentenciaAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaAsignacion(ParserPascal.SentenciaAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#sentencia_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_condicional(ParserPascal.Sentencia_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#sentencia_ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_ciclo(ParserPascal.Sentencia_cicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#sentencia_funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_funciones(ParserPascal.Sentencia_funcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(ParserPascal.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#expresionBooleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionBooleana(ParserPascal.ExpresionBooleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#expresion_Simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_Simple(ParserPascal.Expresion_SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(ParserPascal.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(ParserPascal.OperandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#constanteVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstanteVariable(ParserPascal.ConstanteVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserPascal#especificadorTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecificadorTipo(ParserPascal.EspecificadorTipoContext ctx);
}
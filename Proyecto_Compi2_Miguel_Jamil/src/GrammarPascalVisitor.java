// Generated from /Users/miguel/Documents/UNITEC/4 year/Trimestre 14/Compiladores II/Proyecto/Proyecto_Compiladores_2/Proyecto_Compi2_Miguel_Jamil/src/GrammarPascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GrammarPascalParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#inicioPrograma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicioPrograma(GrammarPascalParser.InicioProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIdentificadores(GrammarPascalParser.ListaIdentificadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(GrammarPascalParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#espacioDeclaracionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacioDeclaracionVar(GrammarPascalParser.EspacioDeclaracionVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#listaDeclaracionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracionVar(GrammarPascalParser.ListaDeclaracionVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#sentencia_compuesta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_compuesta(GrammarPascalParser.Sentencia_compuestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#sentencias_opcionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias_opcionales(GrammarPascalParser.Sentencias_opcionalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(GrammarPascalParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#sentenciaAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaAsignacion(GrammarPascalParser.SentenciaAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#sentencia_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_condicional(GrammarPascalParser.Sentencia_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#sentencia_ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_ciclo(GrammarPascalParser.Sentencia_cicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#sentencia_funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_funciones(GrammarPascalParser.Sentencia_funcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GrammarPascalParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(GrammarPascalParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#expresionBooleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionBooleana(GrammarPascalParser.ExpresionBooleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#expresionRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelacional(GrammarPascalParser.ExpresionRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#expresionIgual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionIgual(GrammarPascalParser.ExpresionIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#expresion_Simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_Simple(GrammarPascalParser.Expresion_SimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(GrammarPascalParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(GrammarPascalParser.OperandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#constanteVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstanteVariable(GrammarPascalParser.ConstanteVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#especificadorTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecificadorTipo(GrammarPascalParser.EspecificadorTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarPascalParser#signo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno(GrammarPascalParser.SignoContext ctx);
}
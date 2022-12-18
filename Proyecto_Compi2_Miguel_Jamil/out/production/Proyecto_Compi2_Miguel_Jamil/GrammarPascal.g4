grammar GrammarPascal;

options { caseInsensitive = true;}


programa: inicioPrograma declaraciones;

inicioPrograma:     P_PROGRAM ID PUNTOCOMA
                |   P_PROGRAM ID LPAR listaIdentificadores RPAR PUNTOCOMA;

listaIdentificadores:   identificador
                    |   listaIdentificadores COMMA identificador;

identificador : ID;

declaraciones: espacioDeclaracionVar sentencia_compuesta;

espacioDeclaracionVar: VAR listaDeclaracionVar
                    |/*lambda*/;

listaDeclaracionVar :  listaIdentificadores COLON especificadorTipo PUNTOCOMA listaDeclaracionVar
                    | listaIdentificadores COLON especificadorTipo PUNTOCOMA {System.out.println("Declarando variable");}
                    ;

sentencia_compuesta: BEGIN (sentencia)* END (PUNTOCOMA)?;


sentencia: sentenciaAsignacion
        | sentencia_compuesta
        | sentencia_condicional
        | sentencia_ciclo
        | sentencia_funciones
        ;
//alternativo tipo de variable
sentenciaAsignacion:  ID ASIGNACION expresion PUNTOCOMA;

sentencia_condicional:  IF expresion THEN sentencia (ELSE)? (sentencia)?;


sentencia_ciclo: WHILE expresion DO sentencia
                | FOR ID ASIGNACION expresion TO expresion DO sentencia
                | REPEAT sentencia UNTIL expresion
                ;
//* Arreglar const string
sentencia_funciones: READ LPAR ID RPAR
                | WRITE LPAR (CONSTSTRING | ID) RPAR PUNTOCOMA
                | WRITE LPAR (CONSTSTRING | ID) COMMA ID RPAR
                | WRITELN PUNTOCOMA
                | WRITELN LPAR (CONSTSTRING | ID) RPAR PUNTOCOMA
                ;

expresion: expresion_Simple
            | expresionIgual
            | expresionRelacional
            | expresionBooleana
            ;

condicion : expresion_Simple
          | expresionIgual
          | expresionRelacional
          ;
expresionBooleana: condicion OPBOOL condicion
                    | NOT expresion
                    ;

expresionRelacional:expresion_Simple OPREL expresion_Simple;

expresionIgual: expresion_Simple EQUALS expresion_Simple;

expresion_Simple:termino
                |expresion_Simple OPSUM termino
                ;
termino:    operando
        |  termino OPMULT operando
        ;

operando: ID
            | LPAR expresion RPAR
            | signo ID
            | NIL
            | NOT operando
            | constanteVariable
            ;
constanteVariable:  INTEGER_VAL
                  | CHAR_VAL
                  | BOOLEAN_VAL
                  | signo INTEGER_VAL
                  ;

especificadorTipo returns[String tipo]:
                    INTEGER {$tipo = "integer";}
                  | CHAR    {$tipo = "char";}
                  | BOOLEAN {$tipo = "boolean";}
                  ;
signo : OPSUM;


//Palabras reservadas
P_PROGRAM : 'program';
BEGIN : 'begin';
END: 'end';
VAR: 'var';
BOOLEAN : 'boolean';
CHAR: 'char';
INTEGER: 'integer';
WHILE : 'while';
DO : 'do';
WRITE : 'write';
WRITELN: 'writeln';
READ: 'read';
READLN: 'readln';
IF: 'if';
ELSE: 'else';
FOR: 'for';
REPEAT: 'repeat';
THEN: 'then';
UNTIL: 'until';
NIL: 'nil';
DIV: 'div';
MOD: 'mod';
NOT: 'not';
TO: 'to';
//Operadores booleanos
OPBOOL: 'and' | 'or' ;
//Boolean
BOOLEAN_VAL : 'true' | 'false';


fragment  DIGITO : [0-9];
fragment LETRA : [a-z]  | '_';
//Identificador
ID : LETRA(LETRA | DIGITO)*;
//Integer
INTEGER_VAL: DIGITO+;

//Operadores Aritmeticos
OPSUM : '+' | '-';
OPMULT : '*' | '/' | DIV | MOD;

//Operadores Relacionales
OPREL : '<>'|'>'|'<'|'>='|'<=';

EQUALS: '=';



//Asginacion
ASIGNACION : ':=';
PUNTOCOMA: ';';
PUNTO: '.';
COMMA: ',';
COLON: ':';
LPAR : '(';
RPAR : ')';
R_BRACKET: ']';
L_BRACKET: '[';

//Caracteres Especiales
CARACTERES_ESP : PUNTO |'-'|'@'|'#'|'$'|'%'|'^'|'&'|'!' |'?'|'\''|COMMA|
PUNTOCOMA|LPAR|RPAR| R_BRACKET |EQUALS| L_BRACKET | COLON | OPBOOL | OPREL | OPSUM;

//Char
CHAR_VAL : '\'' (LETRA | DIGITO | CARACTERES_ESP)'\'';

//Constante String
CONSTSTRING: '\''(LETRA | DIGITO | CARACTERES_ESP | ' ')+ '\'';


//WhiteSpace
WS : [ \r\t\n]+ -> skip ;
//Comentarios
COMMENT : '{' .*? '}' -> skip;

//Simbolos error léxico
//Ignorar el resto
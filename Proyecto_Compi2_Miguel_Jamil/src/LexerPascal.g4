lexer grammar LexerPascal;


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

fragment  DIGITO : [0-9];
fragment LETRA : [a-z] | [A-Z] | '_';
//Identificador
ID : LETRA(LETRA | DIGITO)*;

//Integer
INTEGER_VAL: DIGITO+;


//Boolean
BOOLEAN_VAL : 'true' | 'false';
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
INICIO_COMMENT: '{' -> skip, pushMode(COMMENT);

//Simbolos error léxico
LEX_ERROR_SYMBOL: .  {System.out.println("Error Lexico. Token invalido: < en linea: ");};



mode COMMENT;
//Fin comentario

FIN_COMMENT : '}' -> skip, popMode;
NL: '\n' -> skip;
VALOR: . -> skip;
//Ignorar el resto
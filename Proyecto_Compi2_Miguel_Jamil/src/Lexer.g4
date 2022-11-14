lexer grammar Lexer;
//options {caseInsensitive = true;}

//Palabras reservadas
PROGRAM : 'program';
BEGIN : 'begin';
END: 'end';
WHILE : 'while';
DO : 'do';
WRITE : 'write';
WRITELN: 'writeln';
IF: 'if';
ELSE: 'else';
FOR: 'for';
REPEAT: 'repeat';
THEN: 'then';
UNTIL: 'until';
NIL: 'nil';
DIV: 'div';
MOD: 'mod';
AND: 'and';
OR: 'or';
NOT: 'not';

fragment  DIGITO : [0-9];
fragment LETRA : [a-z] | [A-Z] | '_';
//Identificador
ID : LETRA(LETRA | DIGITO)*;

//Integer
INTEGER : DIGITO+;

//Char
//Boolean
BOOLEAN : 'true' | 'false';
//Operadores Aritmeticos
OPSUM : '+' | '-';
OPMULT : '*' | '/' | DIV | MOD;

//Operadores Relacionales
OPREL : '<>'|'='|'>'|'<'|'>='|'<=';

//Operadores booleanos
OPBOOL: AND | OR | NOT ;

//Asginacion
ASIGNACION : ':=';

SEMICOLON: ';';
PUNTO: '.';
COMMA: ',';
COLON: ':';
LPAR : '(';
RPAR : ')';
R_BRACKET: ']';
L_BRACKET: '[';
INICIO_COMMENT: '{' -> pushMode(COMMENT);

//Constante String

//Comments
//WhiteSpace
WS : [ \r\t\n]+ -> skip;



mode COMMENT;
//Fin comentario
FIN_COMMENT : '}' -> popMode;
//Ignorar el resto

lexer grammar Lexer;
options { caseInsensitive = true; }

//Palabras reservadas
PROGRAM : 'program';
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
AND: 'and';
OR: 'or';
NOT: 'not';

fragment  DIGITO : [0-9];
fragment LETRA : [a-z] | [A-Z] | '_';
//Identificador
ID : LETRA(LETRA | DIGITO)*;

//Integer
INTEGER_VAL: DIGITO+;

//Char
CHAR_VAL : '\''.'\'';

//Boolean
BOOLEAN_VAL : 'true' | 'false';
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

//Constante String


//WhiteSpace
WS : [ \r\t\n]+ -> skip;

//Comentarios
INICIO_COMMENT: '{' -> skip, pushMode(COMMENT);

mode COMMENT;
//Fin comentario

FIN_COMMENT : '}' -> skip, popMode;
NL: '\n' -> skip;
VALOR: . -> skip;
//Ignorar el resto

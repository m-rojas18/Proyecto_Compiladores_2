parser grammar ParserPascal;

options {tokenVocab = LexerPascal;}

programa: inicioPrograma cuerpoPrograma;

inicioPrograma:     PROGRAM ID PUNTOCOMA
                |   PROGRAM ID LPAR listaIdentificadores RPAR PUNTOCOMA;

listaIdentificadores:   ID
                    |   listaIdentificadores COMA ID;

cuerpoPrograma: BEGIN sentencias END;

sentencias: sentenciaAsig
          | cuerpoPrograma
          | statements;

//alternativo tipo de variable
sentenciaAsig:  ID ASIGNACION expresion PUNTOCOMA;

expresion: ;

statements: ;

constanteVariable:  INTEGER_VAL
                  | CHAR_VAL
                  | BOOLEAN_VAR;

especificadorTipo:  INTEGER
                  | CHAR
                  | BOOLEAN;


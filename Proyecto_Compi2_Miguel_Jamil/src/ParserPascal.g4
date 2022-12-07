parser grammar ParserPascal;

options {tokenVocab = LexerPascal;}

programa: inicioPrograma declaraciones;

inicioPrograma:     PROGRAM ID PUNTOCOMA
                |   PROGRAM ID LPAR listaIdentificadores RPAR PUNTOCOMA;

listaIdentificadores:   ID
                    |   listaIdentificadores COMA ID;

declaraciones: espacioDeclaracionVar sentencia_compuesta;

espacioDeclaracionVar: VAR listaDeclaracionVar;

listaDeclaracionVar : listaDeclaracionVar ID COLON especificadorTipo PUNTOCOMA
                    | ID COLON especificadorTipo PUNTOCOMA
                    ;

sentencia_compuesta: BEGIN sentencias_opcionales END;

sentencias_opcionales: lista_sentencias
          |/*lambda*/
          ;
lista_sentencias : sentencia PUNTOCOMA
                |lista_sentencias sentencia PUNTOCOMA
                ;
sentencia: sentenciaAsignacion
        | sentencia_compuesta
        | sentencia_condicional
        | sentencia_ciclo
        | sentencia_funciones
        ;
//alternativo tipo de variable
sentenciaAsignacion:  ID ASIGNACION expresion PUNTOCOMA
                    |
                    ;

sentencia_condicional: IF expresion THEN sentencia ELSE sentencia
                    | IF expresion THEN sentencia
                    ;
sentencia_ciclo: WHILE expresion DO sentencia
                | FOR ID ASIGNACION expresion TO expresion DO SENTENCIA
                | REPEAT sentencia UNTIL expresion
                ;
//* Arreglar const string
sentencia_funciones: READ LPAR ID RPAR
                | WRITE LPAR CONST_STR RPAR
                | WRITE LPAR CONST_STR COMMA ID RPAR
                ;

expresion: expresion_Simple
            | expresion_Simple EQUALS expresion_Simple
            |expresion_Simple OPREL expresion_Simple
            ;
expresion_Simple:termino
                |
                ;
constanteVariable:  INTEGER_VAL
                  | CHAR_VAL
                  | BOOLEAN_VAR;

especificadorTipo:  INTEGER
                  | CHAR
                  | BOOLEAN;


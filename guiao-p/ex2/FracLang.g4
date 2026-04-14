grammar FracLang;

program: stat* EOF;

stat: 'display' expr ';'         #StatDisplay
    | ID '<=' expr ';'           #StatAssignment
    ;

expr: expr '/' expr              #ExprFraction
    | NUMBER                     #ExprNumber
    | ID                         #ExprId
    | '(' expr ')'               #ExprParens
    ;

ID: [a-z]+ ;
NUMBER: [0-9]+ ;
WS: [ \t\n\r]+ -> skip ;
COMMENT: '--' ~[\n]* -> skip ;

grammar FracLang;

program: stat* EOF;

stat: 'display' expr ';'         #StatDisplay
    | ID '<=' expr ';'           #StatAssignment
    ;

expr: expr op=('*'|':') expr     #ExprOp
    | expr op=('+'|'-') expr     #ExprOp
    | FRAC                       #ExprFrac
    | ID                         #ExprId
    | '(' expr ')'               #ExprParens
     ;

ID: [a-z]+ ;
FRAC: [0-9]+ ('/' [0-9]+)? ;
WS: [ \t\n\r]+ -> skip ;
COMMENT: '--' ~[\n]* -> skip ;

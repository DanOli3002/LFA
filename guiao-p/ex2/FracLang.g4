grammar FracLang;

program: stat* EOF;

stat: 'display' expr ';'         #StatDisplay
    | ID '<=' expr ';'           #StatAssignment
    ;

expr: op=('+' | '-') expr        #ExptUni
    | expr op=('*'|':') expr     #ExprOp
    | expr op=('+'|'-') expr     #ExprOp
    | FRAC                       #ExprFrac
    | ID                         #ExprId
    | '(' expr ')'               #ExprParens
     ;

ID: [a-zA-Z]+ ;
FRAC: [0-9]+ ('/' [0-9]+)? ;
WS: [ \t\n\r]+ -> skip ;
COMMENT: '--' ~[\n]* -> skip ;

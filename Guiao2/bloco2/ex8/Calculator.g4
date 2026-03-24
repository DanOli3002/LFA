grammar Calculator;

program: stat* EOF;

stat: assignment NEWLINE      #StatAssignment
    | expr? NEWLINE           #StatExpr;

assignment: ID '=' expr;

expr: op=('+'|'-') expr             #ExprUnary
    | expr op=('*'|'/'|'%') expr    #ExprMultDivMod
    | expr op=('+'|'-') expr        #ExprAddSub
    | Integer                       #ExprInteger
    | ID                            #ExprId
    | '(' expr ')'                  #ExprParent;

Integer: [0-9]+;
ID: [a-zA-Z]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' ~[\n]* -> skip;
grammar Calculator_fractions;

program: stat* EOF;

stat: 'print' expr ';'           #StatPrint
    | expr '->' ID ';'           #StatAssignment
    | expr ';'                   #StatExpr
    | NEWLINE                    #EmptyStat;

expr: op=('+'|'-') expr                        #ExprUnary
    | expr op=('*'|'/'|':'|'%') expr           #ExprMultDiv
    | expr op=('+'|'-') expr                   #ExprAddSub
    | expr '^' expr                            #Pow
    | 'reduce' expr                            #Reduce
    | 'read' STRING                            #ReadPrompt
    | Integer '/' Integer                      #ExprFraction
    | Integer                                  #ExprInteger
    | ID                                       #ExprId
    | '(' expr ')'                             #ExprParent;

ID      : [a-zA-Z][a-zA-Z0-9_]* ;
Integer : [0-9]+ ;
STRING  : '"' ~["\n]* '"' ;
NEWLINE : ('\r'? '\n') ;
WS      : [ \t]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
grammar StrLang;

prog: stat* EOF;

stat: 'print' expr          #StatPrint
    | ID ':' expr           #StatAssignment
    ;

expr: STRING               #ExprString
    | ID                   #ExprID
    | 'input' '(' STRING ')' #ExprInput
    ;

ID: [a-zA-Z]+ [a-zA-Z0-9]*;
STRING: '"' ~[\r\n]* '"';
WS: [ \t\r\n]+ -> skip;
COMMENTS: '//' ~[\r\n]* -> skip;
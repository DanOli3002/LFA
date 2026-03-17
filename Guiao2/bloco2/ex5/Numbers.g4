grammar Numbers;

prog  : line* EOF ;
line  : words EOL? | EOL ;
words : WORD (WS WORD)* ;

WORD   : [a-zA-Z]+ ;
WS     : [ \t]+ ;
EOL    : '\r'? '\n' ;
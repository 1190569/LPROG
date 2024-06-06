grammar JobReqspec_1;

// Define tokens
LPAREN  : '(' ;
RPAREN  : ')' ;
COMMA   : ',' ;
COLON   : ';' ;
ID      : [a-zA-Z]+ ;
INT     : [0-9]+ ;
STRING  : '"' (~["\r\n])* '"' ;

// Ignore spaces, tabs, and line breaks
WS      : [ \t\r\n]+ -> skip ;

// Define rules
plugin : 'JobRequirementSpec' ID '(' jobReqParams ')' ;

jobReqParams : 'Title' ':' STRING
               'Description' ':' STRING
               'Requirements' ':' reqList ;

reqList : '(' reqItem (COLON reqItem)* ')' ;

reqItem : STRING ;
grammar JobReqspec_1;

// Define tokens
LPAREN          : '(' ;
RPAREN          : ')' ;
COMMA           : ',' ;
COLON           : ':' ;
ID              : [a-zA-Z]+ ;
INT             : [0-9]+ ;
STRING          : '"' (~["\r\n])* '"' ;

// Ignore spaces, tabs, and line breaks
WS              : [ \t\r\n]+ -> skip ;

// Define rules
plugin          : 'JobRequirementSpec' ID LPAREN jobReqParams RPAREN ;

jobReqParams    : 'Title' COLON STRING
                  COMMA
                  'Description' COLON STRING
                  COMMA
                  'Requirements' COLON reqList ;

reqList         : LPAREN
                  degreeArea
                  COMMA
                  degreeLevel
                  COMMA
                  tools
                  COMMA
                  yearsOfExperience
                RPAREN ;

degreeArea      : 'Degree area' COLON STRING (COMMA STRING)* ;
degreeLevel     : 'Degree level' COLON STRING (COMMA STRING)* ;
tools           : 'Tools' COLON STRING (COMMA STRING)* ;
yearsOfExperience : 'Years of experience' COLON INT ;

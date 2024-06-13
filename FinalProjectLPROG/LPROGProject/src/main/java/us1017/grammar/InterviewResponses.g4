grammar InterviewResponses;

// Define tokens
LPAREN   : '(' ;
RPAREN   : ')' ;
COMMA    : ',' ;
COLON    : ':' ;
ID       : [a-zA-Z]+ ;
INT      : [0-9]+ ;
STRING   : '"' ~["\r\n]* '"' ;
TRUE     : 'True' ;
FALSE    : 'False' ;
HYPHEN   : '-' ;
SLASH: '/' ;

// Ignore spaces, tabs, and line breaks
WS       : [ \t\r\n]+ -> skip ;

// Define rules
plugin : 'InterviewModel' ID '(' interviewParams ')' ;

interviewParams : 'Title' COLON STRING
                 'Description' COLON STRING
                 'Questions' COLON questionList ;

questionList : LPAREN questionResponse (COMMA questionResponse)* RPAREN ;

questionResponse : LPAREN STRING LPAREN questionType COMMA INT RPAREN RPAREN COLON response ; // resposne should have been '"' response '"', thats why only text

questionType : 'TrueFalse'
             | 'ShortTextAnswer'
             | 'SingleChoice'
             | 'MultipleChoice'
             | 'NumericScale'
             | 'IntegerNumber'
             | 'DecimalNumber'
             | 'Date'
             | 'Time';

response : booleanResponse // could have been only boolean
         | fraction
         | date
         | time
         | INT
         | STRING ;

booleanResponse : TRUE | FALSE;
fraction : INT SLASH INT  ;
date : INT HYPHEN INT HYPHEN INT ;  // Format: YYYY-MM-DD
time : INT COLON INT ;  // Format: HH:MM
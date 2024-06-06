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
HYPEN    : '-' ;

// Ignore spaces, tabs, and line breaks
WS       : [ \t\r\n]+ -> skip ;

// Define rules
plugin : 'InterviewModel' ID '(' interviewParams ')' ;

interviewParams : 'Title' COLON STRING
                 'Description' COLON STRING
                 'Questions' COLON questionList ;

questionList : LPAREN questionResponse (COMMA questionResponse)* RPAREN ;

questionResponse : LPAREN STRING LPAREN questionType COMMA INT RPAREN RPAREN COLON response ;

questionType : 'TrueFalse'
             | 'ShortTextAnswer'
             | 'SingleChoice'
             | 'MultipleChoice'
             | 'IntegerNumber'
             | 'DecimalNumber'
             | 'Date'
             | 'Time'
             | 'NumericScale' ;

response : STRING
         | INT
         | date
         | time
         | TRUE
         | FALSE ;

date : INT HYPEN INT HYPEN INT ;  // Format: YYYY-MM-DD
time : INT HYPEN INT ;  // Format: HH:MM
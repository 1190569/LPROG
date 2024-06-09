grammar InterviewModel_2;

// Define tokens
LPAREN   : '(' ;
RPAREN   : ')' ;
COMMA    : ',' ;
COLON    : ':' ;
ID       : [a-zA-Z]+ ;
INT      : [0-9]+ ;
STRING   : '"' ~["\r\n]* '"' ;

// Ignore spaces, tabs, and line breaks
WS       : [ \t\r\n]+ -> skip ;

// Define rules
plugin : 'InterviewModel' ID '(' interviewParams ')' ;

interviewParams : 'Title' COLON STRING
                 'Description' COLON STRING
                 'Questions' COLON questionList ;

questionList : LPAREN question (COMMA question)* RPAREN ;

question : LPAREN STRING LPAREN questionType COMMA INT RPAREN RPAREN ;

questionType : 'TrueFalse'
             | 'ShortTextAnswer'
             | 'SingleChoice'
             | 'MultipleChoice'
             | 'IntegerNumber'
             | 'DecimalNumber'
             | 'Date'
             | 'Time'
             | 'NumericScale' ;
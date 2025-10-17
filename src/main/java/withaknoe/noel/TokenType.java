package withaknoe.noel;

/**
 *
 * @author Brent
 *      I use  https://designmodo.com/font-psychology/ to come up with 
 *          terminology for some of the tokens (positions in this case)
 */
public enum TokenType {
    // single character tokens
    LBRACE, RBRACE, DOT, MINUS, PLUS, STAR,
    DASH, COLON, COMMA, LPAREN, RPAREN,
    QUOTE,
    // positions (fancy font words, baselines)
    TOP, MIDDLE, BASE, DESCEND,
    
    // literals
    IDENTIFIER, // a, b, C, ...
    NUMERIC,    // literal nums like "90", "0.5", "2"
    STRING,
    // keywords
    LETTER, NUMBER, SYMBOL, OTHER,
    USES, LINE, ARC, ROTATE, SCALE, END,
    FALSE, TRUE, IF, ELSE, IFELSE,
    // misc
    EOF
}

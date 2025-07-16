package withaknoe.noel;

/**
 *
 * @author Brent
 *      I use  https://designmodo.com/font-psychology/ to come up with 
 *          terminology for some of the tokens (positions in this case)
 */
public enum TokenType {
    // keywords
    LETTER, NUMBER, SYMBOL, OTHER,
    USES, LINE, ARC, ROTATE, SCALE, END,
    
    // puncuation
    COLON, COMMA, LPAREN, RPAREN,
    
    // positions (fancy font words, base lines)
    TOP, MIDDLE, BASE, DESCEND,
    
    // literals
    IDENTIFIER, // a, b, C, ...
    NUMERIC,    // literal nums like "90", "0.5", "2"
    
    // misc
    EOF
}

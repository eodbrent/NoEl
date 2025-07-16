/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package withaknoe.noel;

/**
 *
 * @author Brent
 */
public enum TokenType {
    // keywords
    LETTER, NUMBER, SYMBOL, OTHER,
    USES, LINE, ARC, ROTATE, SCALE, END,
    
    // puncuation
    COLON, COMMA, LPAREN, RPAREN,
    
    // positions (base lines)
    TOP, MIDDLE, BASE, DESCEND,
    
    // literals
    IDENTIFIER, // a, b, C, ...
    NUMERIC,    // literal nums like "90", "0.5", "2"
    
    // misc
    EOF
}

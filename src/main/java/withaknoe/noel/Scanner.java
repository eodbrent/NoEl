package withaknoe.noel;

import java.util.*;
/**
 *
 * @author Brent
 */
public class Scanner {
   private final String source;
   private final List<Token> tokens = new ArrayList<>();
   
   private int start = 0;
   private int current = 0;
   private int line = 1;
   
   private static final Map<String, TokenType> keywords;
   
   static {
       keywords = new HashMap<>();
       keywords.put("letter", TokenType.LETTER);
       keywords.put("number", TokenType.NUMBER);
       keywords.put("symbol", TokenType.SYMBOL);
       keywords.put("other", TokenType.OTHER);
       keywords.put("uses", TokenType.USES);
       keywords.put("line", TokenType.LINE);
       keywords.put("arc", TokenType.ARC);
       keywords.put("rotate", TokenType.ROTATE);
       keywords.put("scale", TokenType.SCALE);
       keywords.put("end", TokenType.END);
       keywords.put("top", TokenType.TOP);
       keywords.put("middle", TokenType.MIDDLE);
       keywords.put("base", TokenType.BASE);
       keywords.put("descend", TokenType.DESCEND);
   }
   
   public Scanner(String source) {
       this.source = source;
   }
   
   public List<Token> scanTokens() {
       while (!isAtEnd()) {
            start = current;
            scanToken();
       }
       
       tokens.add(new Token(TokenType.EOF, "", null, line));
       return tokens;
   }
   
   private void scanToken() {
       char c = advance();
       switch (c) {
           case '(': addToken(TokenType.LPAREN); break;
           case ')': addToken(TokenType.RPAREN); break;
           case ':': addToken(TokenType.COLON); break;
           case ',': addToken(TokenType.COMMA); break;
           
           case '\n': line++; break;
           case  ' ':
           case '\r':
           case '\t': break; //ignore white space
           default:
               if (isDigit(c)) {
                   number();
               } else if (isAlpha(c)) {
                   identifier();
               } else {
                   System.err.println("Unexpected character: " + c);
               }
               break;
       }
   }
   
   private void identifier() {
       while (isAlphaNumeric(peek())) advance();
       String text = source.substring(start, current);
       
       TokenType type = keywords.getOrDefault(text, TokenType.IDENTIFIER);
       addToken(type);
   }
   
   private void number() {
       while (isDigit(peek())) advance();
       
       if  (peek() == '.' && isDigit(peekNext())) {
           advance(); // consume '.'
           while (isDigit(peek())) advance();
       }
       String value = source.substring(start, current);
       addToken(TokenType.NUMERIC, Double.parseDouble(value));
   }
   
   private boolean isAlpha(char c) {
       return Character.isLetter(c);
   }
   
   private boolean isAlphaNumeric(char c) {
       return isAlpha(c) || isDigit(c);
   }
   
   private boolean isDigit(char c) {
       return Character.isDigit(c);
   }
   
   private char advance() {
       return source.charAt(current++);
   }
   
   private char peek() {
       if (isAtEnd()) return '\0';
       return source.charAt(current);
   }
   
   private char peekNext() {
       if (current + 1 >= source.length()) return '\0';
       return source.charAt(current + 1);
   }
   
   private boolean isAtEnd(){
       return current >= source.length();
   }
   
   private void addToken(TokenType type) {
       addToken(type, null);
   }
   
   private void addToken(TokenType type, Object literal) {
       String text = source.substring(start, current);
       tokens.add(new Token(type, text, literal, line));
   }
}

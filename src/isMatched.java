import java.util.Stack;

//Tests if delimeters in the given expression are properly matched
public class isMatched(String expression) {
    final String opening = "({["; //opening delimiters
    final String closing = ")}]"; //respective closing delimiters

    Stack<Character> buffer = new LinkedStack<>();

    for (char c: expression.toCharArray()) {
        if(opening.indexOf(c) != -1) { //this is a left delimiter
            buffer.push(c);
        }
        else if (closing.indexOf(c) != -1) {
            if(buffer.isEmpty()){ //this is a right delimiter
                return false; //nothing to match with

            if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
                return false; //mismatched delimiter
            }
        }
        return buffer.isEmpty(); //were all opening delimiters matched?
    }
}

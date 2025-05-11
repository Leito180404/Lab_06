package ejercicio4;

import Actividad1.ExceptionEmpty;
import ejercicio1.StackLink;

public class Aplication {
    public static boolean symbolBalancing(String s) {
        StackLink<Character> stack = new StackLink<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                try {
                    char top = stack.pop();
                    
                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                        return false;  
                    }
                } catch (ExceptionEmpty e) {
                    return false;  
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Pruebas
        System.out.println(symbolBalancing("()()()[()]()"));  // true
        System.out.println(symbolBalancing("((()))[]"));    // true
        System.out.println(symbolBalancing("([])[]("));       // false
        System.out.println(symbolBalancing("([{)]}"));       // false
        System.out.println(symbolBalancing("[")); //false
        System.out.println(symbolBalancing("[][][]{{{}}}")); // true
    }
}


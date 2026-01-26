import java.util.*;
public class valid_Parentheses {
    public static boolean validParentheses(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2!=0)return false;
        for(int i =0; i<n;i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(ch==')' ||ch==']' || ch=='}'){
                if(st.size()==0) return false;
                else if(ch==')' && st.peek()=='(') st.pop();
                else if(ch==']' && st.peek()=='[') st.pop();
                else if(ch=='}' && st.peek()=='{') st.pop();
                else return false;
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Parentheses");
        String s = sc.nextLine();
        System.out.println(validParentheses(s));
    }
    
}

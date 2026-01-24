import java.util.*;
public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(7);
        st.push(3);
        st.push(978);
        st.push(33);
        st.push(-54);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        st.pop();
        System.out.println(st.size());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st.isEmpty());
        
    }
    
}

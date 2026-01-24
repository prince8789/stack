import java.util.*;
public class copyInSameorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n ;
        System.out.println("enter the size of element in stack ");
        n = sc.nextInt();
        System.out.println("enter the "+n+" element");
        for(int i =0;i<n;i++){
            st.push(sc.nextInt());
        }
        System.out.println(st);
        // copy the element of one stack in to another stack in reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            // int x = st.peek();
            // rt.push(x);
            // st.pop();
            rt.push(st.pop());
        }
        System.out.println(rt);
        //copy the element of st in ct in same order by the help of third stack are used
        Stack<Integer> ct = new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }
        System.out.println("copy stack in same order in stack ct ");
        System.out.println(ct);
    }
    
}

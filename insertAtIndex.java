import java.util.*;
public class insertAtIndex {
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

        //insert the elememt in any index 
        int index;
        System.out.println("enter the number of index");
        index = sc.nextInt();
        System.out.println("enter the element ");
        int num =sc.nextInt();
        Stack<Integer> rt = new Stack<>();
        while(st.size()>index){
            rt.push(st.pop());
        }
        st.push(num);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
    
    
}

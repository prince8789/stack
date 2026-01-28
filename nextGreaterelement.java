import java.util.*;
public class nextGreaterelement {
    public static int[] NextGreaterElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[res.length-1]=-1;
        for(int i=arr.length-1;i>=0;i--){
            while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();

            st.push(arr[i]);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array element ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans =NextGreaterElement(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

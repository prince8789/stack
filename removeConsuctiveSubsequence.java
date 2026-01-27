import java.util.*;
public class removeConsuctiveSubsequence {
    public static int[] consuctivesubsequence(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if(st.peek()==arr[i]){
                if(i==arr.length-1 || st.peek()!=arr[i+1]){
                    st.pop();
                }
            }
            
        } 
        int[] res = new int[st.size()];
        for(int i =st.size()-1;i>=0;i--){
            res[i]=st.pop();
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
        int[] ans =consuctivesubsequence(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}

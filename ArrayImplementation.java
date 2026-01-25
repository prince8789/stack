public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[50];
        private int idx = 0;
        void push(int x){
            if(idx==arr.length){
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            idx--;
            int x = arr[idx];
            arr[idx]=0;
            
            return x;
        }
        int peek(){
           if(idx==0){
              System.out.println("stack is empty");
            return -1;
             }
            return arr[idx-1];
        }

        int capacity(){
            return arr.length;
        }
        boolean isEmpty(){
            if(idx==0) return true;

            return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
        void display(){
            for(int i =0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.display();//5
        st.push(7);
        st.push(9);
        st.push(3);
        st.push(8);
        st.push(9);
        st.push(0); 
        st.display();// 5 7 9 3 8 9 0
        st.peek(); //0
        System.out.println(st.size()); //7
        System.out.println(st.pop()); //0
        System.out.println(st.size()); //6
        st.display(); // 5 7 9 3 8 9
        st.pop();
        st.display(); // 5 7 9 3 8 
        



        
    }
    
}

import java.util.*;

public class stack1 {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int currprice = stock[i];
            while (!s.isEmpty() && currprice > stock[s.peek()]) {
                s.pop();

            }
            if (s.isEmpty()) {
                span[i] = i + 1;

            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static boolean isValid(String str){
        Stack<Character>s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //opening
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
                //closing
        }else{
            if(s.isEmpty()){
                return false;
            }
            if(s.peek()=='('&&ch==')'||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){
                s.pop();    
            
            


    }else{
        return false;
    }
}
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;


                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{//opening
               s.push(ch);
            }
        }
        return false;
    }
    public static void MaxAreaHistogram(int arr[]){
        int MaxArea=0;
        int nsl[]=new int [arr.length];
        int nsr[]=new int [arr.length];
        //nsr
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;

            }else{
                nsr[i]=s.peek();

            }
            s.push(i);

        }
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            MaxArea=Math.max(currArea,MaxArea);
        }
        System.out.println("Max Area is "+MaxArea);

    }
    

    public static void main(String args[]) {
        //int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        //int span[] = new int[stock.length];
        //stockSpan(stock, span);
        //int arr[]={6,8,0,1,3};
       // Stack<Integer> s=new Stack<>();
        //int nxtGreater[]=new int [arr.length];
        //for(int i=0;i<arr.length;i++){
           // while(!s.isEmpty()&&arr[s.peek()]<arr[i]){
                //s.pop();
            //}
            //if(s.isEmpty()){
               // nxtGreater[i]=-1;
           // }else{
              //  nxtGreater[i]=arr[s.peek()];
           // }
            //s.push(i);
       // }
        //for(int i=0;i<nxtGreater.length;i++){
          //  System.out.println(nxtGreater[i]);
        //}
        // String str = "Sudarshan";
        // String result = reverseString(str);
        // System.out.println(result);

        // Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);

        // pushAtBottom(s, 0);

        // reverseStack(s);
        // printStack(s);
        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }
        //for (int i = 0; i < span.length; i++) {
           // System.out.println(span[i] + "");
            //String str="({})[]";
            //System.out.println(isValid(str));
           // String str="((a+b))";
            //String str2="(a-b)";
          //  System.out.println(isDuplicate(str));
           //  System.out.println(isDuplicate(str2));
           int arr[]={2,1,5,6,2,3};
           MaxAreaHistogram(arr);
        }
       
    }


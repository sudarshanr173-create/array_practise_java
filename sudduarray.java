

public class sudduarray {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static int linearsearch(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
               
                return i;

            }
        }
        System.out.println("not found");
        return -1;
    }
    public static void linearsearch(String menu[],String key){
        for (int i=0;i<menu.length;i++){
            if(menu[i]==key){
                System.out.println("found at index"+i);
                return;

            }
        }
        System.out.println("not found");
        return;
    }
    public static int getLargest(int numbers[]){
        int largest=numbers[0];
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest=numbers[i];

            }
            if (smallest>numbers[i]){
                smallest=numbers[i];

            }
        }
        System.out.println("smallest number is "+smallest);
        return largest;
    }
    public static int binarysearch(int numbers[],int key){
        int start=0,end= numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            
            }
        }  
        return -1;
            }
            public static void printpairs(int numbers[],int key){
                for (int i=0;i<=numbers.length;i++){
                    for (int j=i+1;j<numbers.length;j++){
                        int counter=numbers[i];
                        System.out.println("counter"+counter+","+numbers[j]);
                    }
                    System.out.println();
                }
                System.out.println("total pairs ="+(numbers.length*(numbers.length-1)/2));
            }
            public static void printsubarrays(int numbers[]){
            
                for(int i=0;i<numbers.length;i++){
                    for(int j=i;j<numbers.length;j++)
                    {
                        int start=i;
                        int end=j;
                        for(int k=start;k<=end;k++){
                            System.out.print(numbers[k]+" ");
                        }
                        System.out.println();
                    }
                }
            }
            public static void kadanes(int numbers[]){
                int curr=0;
                int max=Integer.MIN_VALUE;
                for(int i=0;i<numbers.length;i++){
                    curr=curr+numbers[i];
                    if(curr<0){
                        curr=0;
                    }
                    max=Math.max(curr,max);

                }
                System.out.println("max sum is "+max);
            }
            
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
        
        //printsubarrays(numbers);
        
        
        }
    }
       
    

    
    


        
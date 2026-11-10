package Week1.Day7;

public class InPlaceArray {
    public static void main(String args[]){
        int[] arr = {2,3,3,2};
        int remove = 3;
        int write = 0;
        for(int read = 0;read < arr.length ;read++){
            if(arr[read] != remove){
                arr[write] = arr[read];
                write++;
            }
        }
        System.out.println("Valid portion:");
        for(int i = 0 ;i < write; i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println("in place"+ write);

        }
    }
    

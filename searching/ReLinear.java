
class ReLinear{

    public static void main(String s[]){
        int a[]={4,5,2,7,9,6,3};
        System.out.println(search(a,0,7));
    }

    public static int search(int a[],int i,int x){
       
        if(i>=a.length-1){
            return -1;           
        }else    if(a[i]==x){
               return i;
            }else{
           return search(a, i+1, x);
    
        }
  
    }
}
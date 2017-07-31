class Linear{
    public static void main(String s[]){
        int a[]={5,6,7,9,6,3,14,58,66};
        System.out.println(search(a,14));
    }

    public static int search(int arr[],int num){
        int i,l=arr.length;
        int answer=-1;
        for(i=0;i<l;i++){
            if(arr[i]==num){
                 answer=1;
                 break;
               // return arr[i];
             }
        }
           
          return answer;
    }
} 
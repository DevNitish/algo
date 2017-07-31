class Binary{
    public static void main(String s[]){
               int a[]={5,6,7,9,14,58,66};
               
        //System.out.println(binarySearch(a,7));
        System.out.println(binarySearchRecurcive(a,0,a.length-1,14));
    }

    public static int binarySearch(int a[],int x){
        int p=0;
        int r=a.length-1;
        while(p<=r){
            int q=(p+r)/2;
            
            if(x<a[q]) r=q-1;
            else if(x>a[q]) p=q+1;
            else return q;
        }
        return -1;  
      }//binarySearch

      public static int binarySearchRecurcive(int a[],int p,int r,int x){//p q r
        
        if(r<p){
            return -1;
        }else {     
                    int q=(p+r)/2;
                    if(x==a[q]){
                        return q;
                    }else if(x<a[q]){
                        return binarySearchRecurcive(a, p,q-1,x);
                    }else{
                        return binarySearchRecurcive(a,q+1,r,x);
                    }
              }
      }//rec binary
     
}
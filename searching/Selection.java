
class Selection{

    public static void main(String s[]){
        int a[]={4,5,2,7,9,6,3};
        int b[]=selection(a);
        for(int i=0;i<a.length;i++){
        System.out.println(b[i]);
    }
    }

    public static int [] selection(int a[]){
       int min=0;
       int l=a.length;
       for(int i=0;i<l;i++){
           min=i;
           for(int j=i+1;j<l;j++){
               if(a[j]<a[min])
               min=j;
               int tmp=a[i];
               a[i]=a[min];
               a[min]=tmp;
           }
       }
       return a;
    }
}
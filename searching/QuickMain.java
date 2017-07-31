import java.lang.*;
class QuickMain{

    public static void main(String arg[]){
        int a[]={6,3,8,9,2,0,9,6,9,2,1};
        Quick m=new Quick();

        m.sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
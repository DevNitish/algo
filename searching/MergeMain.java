import java.lang.*;
class MergeMain{

    public static void main(String arg[]){
        int a[]={6,3,8,9,2,0,9,6,9,2,1};
        Merge m=new Merge();

        m.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
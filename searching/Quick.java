class Quick{

    public void sort(int a[],int p,int r){
      
        if(p<r){
            int pp=partition(a,p,r);
            sort(a,p,pp-1);
            sort(a,pp+1,r);
        }
    }

    public int partition(int a[],int p,int r){
        int pivot=a[r];//pivoit
        int i=p-1;
        for(int j=p;j<=r-1;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int ival=a[i+1];
                a[i+1]=pivot; 
                a[r]=ival;
                return (i+1);

    }
}
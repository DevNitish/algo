class Merge {

    public void sort(int a[]){

         sort(a,0,a.length-1);
    }

    public void sort(int inputArray[], int start, int end){
        if(end<=start){
            return;
        }
        int mid=(start+end)/2;
        sort(inputArray, start, mid);//left half of array
        sort(inputArray,mid+1,end);//right half of array
        merge(inputArray,start,mid,end);//merge sorted result into the inputArry
    }

    public void merge(int ina[], int s, int m,int e){
        int temp[]=new int[e-s+1];
        int leftSlot=s;
        int rightSlot=m+1;
        int k=0;

        while(leftSlot<=m &&rightSlot<=e){

            if(ina[leftSlot]<ina[rightSlot]){
                temp[k]=ina[leftSlot];
                leftSlot++;
            }else{
                temp[k]=ina[rightSlot];
                rightSlot++;
            }
            k++;
        }
        //this step is confusing
        if( leftSlot<=m){
            while(leftSlot<=m){
                temp[k]=ina[leftSlot];
                leftSlot++;
                k++;    
            }
        }else if(rightSlot<=e){
             while(rightSlot<=e){
                temp[k]=ina[rightSlot];
                rightSlot++;
                k++;
            }
        }

        //copy temp to ina
        for(int i=0;i<temp.length;i++){
            ina[s+i]=temp[i];
        }
    }
}
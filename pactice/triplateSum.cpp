#include <iostream>
using namespace std;
int tripletCount(int a[],int s);
int main() {
	int n,s;
	cin>>n;   
	for(int i=0;i<n;i++){
	    cin>>s;
	    int arr[s];
	    for(int j=0;j<s;j++)
	    cin>>arr[j];
	    cout<<tripletCount(arr,s)<<endl;
	}
	return 0;
}

int tripletCount(int a[],int s){
    int i,j,k;
    int count=0;
    for(i=0;i<s;i++){
        for(j=0;j<s;j++){
            for(k=0;k<s;k++){
                if(a[i]!=a[j]){
                    if((a[i]+a[j])==a[k]){
                        count++;
                    }
                }
            }
        }
    }
    
    if(count>0)
    return count/2;
    else
    return -1;
}
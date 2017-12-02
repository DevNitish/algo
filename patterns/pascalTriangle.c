#include <iostream>
using namespace std;
int fact(int a);
int combi(int a,int b);
void pascale(int a);
int main (){
   pascale(7);
      
               
	              return 0;
		      }

		      void pascale(int line){
		                  int i,j,k,r;
				            for(i=1;i<=line;i++){ 
					                      k=1;
							                        r=0;
										               for(j=1;j<=line*2-1;j++){
											                          
														                         if(j>=line+1-i&&j<=line-1+i&&k==1){
																	                                 cout<<combi(i-1,r);
																					                                         k=0;
																										                                        r++;
																															                               }
																																		                                       else{
																																						                                        cout<<" ";
																																											                                k=1;
																																															                                }
																																																			                       }
																																																					                               cout<<"\n";
																																																								                       
																																																										                 }
																																																												 }
																																																												 int combi(int n, int r){
																																																												         
																																																													         return (fact(n)/fact(r)/fact(n-r));        
																																																														 }

																																																														 int fact(int a){
																																																														         
																																																															         if(a==1||a==0)
																																																																         return 1;
																																																																	         else
																																																																		         return a*fact(a-1);
																																																																			 }




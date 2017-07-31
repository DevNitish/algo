var arr=[1,2,3,4,5,6,7];
//ooutput
//[ 3, 4, 5, 6, 7, 1, 2 ]

var pos=arr.indexOf(3);

for(var i=0;i<pos+1;i++){
    var temp=arr[0];
    for(var j=0;j<arr.length;j++){
        arr[j]=arr[j+1];
    }
    arr[arr.length-1]=temp;
}

console.log(arr);
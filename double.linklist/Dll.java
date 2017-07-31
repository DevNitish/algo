

class Dll{
    public Node first;
    public Node last;
    public Dll(){
        this.first=null;
        this.last=null;
    }

    public boolean isEmpty(){
        return (this.first==null);
    }

    public void inserFirst(int data){
         
        Node newNode=new Node();
        newNode.data=data;
        if(isEmpty()){
            last=newNode;
        }else{
             first.pre=newNode;
        }
        newNode.next=first;
        first=newNode;
    }

    	public void display(){
			Node current=new Node();
			current=first;
			while(current!=null){
				
				System.out.println(current.data);
				current=current.next;

			}
		}
}
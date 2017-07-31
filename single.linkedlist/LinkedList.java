class LinkedList{
	private Node first;
	public LinkedList (){
		
	}

	public void insertFirst(int data){
		Node newNode=new Node();
		newNode.data=data;
		
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
	public boolean isEmpty(){
		return first.next==null;
	}
}
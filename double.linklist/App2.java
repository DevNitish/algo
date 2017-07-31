class App2{
    public static void main(String []a){
       Dll l=new Dll();
       l.inserFirst(8);
       l.inserFirst(90);
       l.inserFirst(7);
       l.inserFirst(5);
       l.display();
       System.err.println("====");;
       System.out.println(l.last.data);
       System.out.println(l.first);
     
    }
}
//Riany Rezeqy Utamie 13020210088

interface A{
            public void aaa();
        }
        interface B extends A{
            public void aaa ();
        }

class Central0088 implements A, B{
    public void aaa(){
    System.out.println("aaa");
}
    
   public static void main(String[] args){
       System.out.println("main");
       Central0088 obj=new Central0088();
       obj.aaa();
   }
}
 class A 
 {
    public void f1(int x){
        System.out.println("class A has "+x);
    }
 }
 class B extends class A
 {
     public void f1(int x, int y){
         System.out.println("class B has "+x+"and"+y);
     }
 }
 public class Example{
     public static void main(String[] args){
        B obj = new B();
        obj.f1(3);
        obj.f1(4,5);
        
     }
 }
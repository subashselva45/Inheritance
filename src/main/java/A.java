public class A {
    public int sum(int a, int b){
        return a+b;
    }
}
 class B extends A{
     @Override
     public int sum(int a, int b) {
         return super.sum(a, b);
     }
 }

class C extends B{
    public void dummyCMethod(){
        System.out.println("C Method");
    }
}

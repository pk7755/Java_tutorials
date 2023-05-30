public class Method2 {
     public static void Test(){
          System.out.println("I am test method.");
     }
     public static void main(String[] args){
          Test();
          Test();
          System.out.println("I am main method");
          Test();
          Demo();
          Demo();
          Demo();
     }
     public static void Demo(){
          System.out.println("I am Demo method.");
     }
}

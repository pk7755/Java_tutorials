public class EmployDriver {
     public static void main(String[] args) {
          Employ e1 = new Employ();
          e1.ename = "Pradyuman Kumar";
          e1.eid = 18786;
          e1.salary = 600000;
          e1.work();
          System.out.println("-------------------------------The Details of the first Employ----------------------");
          System.out.println(e1.ename);
          System.out.println(e1.ename);
          System.out.println(e1.salary);

          Employ e2 = new Employ();
          e2.ename = "Shivam Kumar";
          e2.eid = 18790;
          e2.salary = 500000;
          e2.work();
          System.out.println("-------------------------------The Details of the Second Employ----------------------");
          System.out.println(e2.ename);
          System.out.println(e2.ename);
          System.out.println(e2.salary);
     }
     
}

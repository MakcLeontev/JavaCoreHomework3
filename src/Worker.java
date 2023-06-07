public abstract class Worker {
       String name;
       String lastName;
       int age;
       int averageSal;

       public Worker(String name, String lastName, int age) {
              this.name = name;
              this.lastName = lastName;
              this.age = age;
       }

       public abstract int payroll();


}





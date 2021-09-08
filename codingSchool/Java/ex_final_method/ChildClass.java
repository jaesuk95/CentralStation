package ex_final_method;

public class ChildClass extends ParentClass{

  //  @Override
  //  public void printThis() {
 //       System.out.println("I am from Child");      // since we are not changing the method, so it's fine
  //  }                                               // but if we had another class that tried to change that
                                                    // method we can't because final is final and that's it
                                                    // override procedure cannot be executed since "printThis()"
                                                    // has already been 'finalised' in Parentclass.

// extends and implement takes the method from the class above it
}

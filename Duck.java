
public abstract class Duck {
      FlyBehaviour flyBehaviour;
      QuackBehaviour quackBehaviour;
      
      abstract void display();
      
      void performFly() {
    	  flyBehaviour.fly();
      }
      
      void performQuack() {
    	  quackBehaviour.quack();
      }
      
      
      
      
}


public class MallardDuck extends Duck {
      
	public void display() {
    	  System.out.println("this is Mallard duck");
      }
      
     
    public MallardDuck() {
    	quackBehaviour= new  Quack();
    	flyBehaviour = new FlyWithWings();
    	
    }
    
    
    
    
      
      
      
}

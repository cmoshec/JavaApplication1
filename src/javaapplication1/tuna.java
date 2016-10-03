
package javaapplication1;


public class tuna {
    
    private int hour;
    private int minute;
    private int second;
   
    public tuna(){
        this(0,0,0);
    }
            
     public tuna(int h){
        this(h,0,0);
        
    }
    
    
    public tuna (int h,int m,int s){
        
      this.hour=h;
      this.minute=m;
      this.second=s;
        
        
    }
    
  public void printmessage (){
      
      System.out.println(this.hour+" "+this.minute+ " "+this.second);
      
      
  }
  
  
    
}

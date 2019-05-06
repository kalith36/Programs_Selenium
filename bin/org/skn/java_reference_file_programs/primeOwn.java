public class PrimeCheck {
    
    public static boolean isPrime(int num){
        
        if (num<=1){
            return false;
            
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String args[]) {
      int num=8;
      boolean prime=true;
      for(int i=2;i<num;i++){
       if(num % i==0)  {
           prime=false;
           break;
       } 
      }
    if(prime){
        System.out.println(" prime");
    }else{
        System.out.println("not prime");
    }
    
    System.out.println(isPrime(8)); 
    
    
    
    
}
}

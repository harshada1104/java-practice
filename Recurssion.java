public class Recurssion {
    
    public static void main(String[] args) {
       RecurssionName(0); 
       linear(3);
    }
//printing name 5times
    static void RecurssionName(int count){
   
      if(count >= 5){
        return;
      }else{
        System.out.println("harshada");
        
        RecurssionName(count+1);
      }
    }
//print linearly from 1 to n
static void linear(int n){
    int deductor = 0;
   if (deductor==5){
   return;
   }else{
    System.out.println(deductor);
  
     linear( deductor++);
   }
}

static void linear1(int n){
    int deductor = 0;
   if (deductor==5){
   return;
   }else{
    System.out.println(deductor);
  
     linear( deductor++);
   }
}
static void linear2(int n){
    int deductor = 0;
   if (deductor==5){
   return;
   }else{
    System.out.println(deductor);
  
     linear( deductor++);
   }
}
static void linear4(int n){
    int deductor = 0;
   if (deductor==5){
   return;
   }else{
    System.out.println(deductor);
  
     linear( deductor++);
   }
}

}

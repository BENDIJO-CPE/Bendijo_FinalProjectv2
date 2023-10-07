package bendijo_exam3;
import java.util.Scanner;


public class Bendijo_Exam3 {
        
public class PriorityQueueArray{
    int priority;
    int  data;
    PriorityQueueArray next;
    

}

private PriorityQueueArray front = null;
private int PrintCount = 0;

private void insertion(int item,int priority) throws Exception{
    PriorityQueueArray  node = new PriorityQueueArray();
    
    node.data = item;
    node.priority = priority;
    node.next = null;
    
     if(front == null || priority <= front.priority){
         node.next = front;
         front  = node;
        
        }else{
          PriorityQueueArray temporary = front ;
          
          while (temporary.next != null && temporary.next.priority <= priority){
              temporary = temporary.next;
          }
          
          node.next = temporary.next;
          temporary.next = node;   
     }
     
     PrintCount++;
     
     if(PrintCount > 5){
         deletion();
         PrintCount--;
     }
         }
    


public int deletion () throws Exception {
    if (front == null){
        throw new Exception ("Queue is empty:");
    }
    
    int temporary = front.data;
    front = front.next;
    
   return temporary;
}

public void display ()throws Exception{
     if (front == null){
        throw new Exception ("Queue is empty:");
    }

     PriorityQueueArray temporary = front;
     
     System.out.println("Priority \t\t Pages");
     
     while (temporary != null){
    System.out.println(temporary.priority +"\t\t\t" + temporary.data);
            temporary = temporary.next;
     }
     
     
      System.out.println("\n");
}

    
    

    public static void main(String[] args) throws Exception {
        Bendijo_Exam3 dis = new Bendijo_Exam3();
        Scanner scan = new Scanner(System.in);       
        boolean start = true;
        
        while (true){

                    System.out.println("Input pages");
                    int num = scan.nextInt();
                    System.out.println("Enter Priority");
                    int priority = scan.nextInt();
                    
                    dis.insertion(num,priority);
                   
                    dis.display();
  
        }

    }
    }


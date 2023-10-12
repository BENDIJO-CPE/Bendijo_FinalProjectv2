
package bendijo_4exam;

import java.util.Scanner;


public class Bendijo_4Exam {
    
private class StackNode {
    
    String productName;
    int quantity;
    
    StackNode next;
}
private StackNode top, quantop;
private int size;
private int quantitysize;



private StackNode createnewNode(String element, int quan) throws Exception {
    StackNode node = new StackNode();
    
    if(node == null){
        throw new Exception("Store is Full");
    }else{
        node.productName = element;
        node.quantity = quan;
        node.next = null;
        return node;
    }
}
  public void push(String element, int quan) throws Exception {
      StackNode node = createnewNode(element, quan);
      if (size == 0 || quantitysize == 0){
          top = node;
          quantop = node;
      }else {
          node.next = quantop;
          node.next = top;
          top = node;
          quantop = node;
      }
      quantitysize++;
      size++;
  }
  public String popProduct(String element) throws Exception {
      if (size == 0){
          throw new Exception ("Store is EMPTY");
      }
      
      
      String temporary = peek(element);
    
      quantop = quantop.next;
      top = top.next;
      
      return temporary;
  
  }
   public int popQuantity(int quan) throws Exception {
      
      if (quantitysize == 0){
          throw new Exception ("Product is EMPTY");
      }else  if (quan != 0){
          System.out.println(quantitysize - quan);
      }
     
      int tempo = peek2(quan);
      quantop = quantop.next;
      
      
      return tempo;
   }
   
  public String peek(String element) throws Exception{
      if(size == 0){
          throw new Exception("Store is EMPTY");
      }
      
      return top.productName;
  }
  
  public int peek2(int quan) throws Exception{
      if(quantitysize == 0){
          throw new Exception("Store is EMPTY");
      }else if(quantitysize != 0){
       
      }
      return quantop.quantity;
  }
  
  public void display(int quan) throws Exception {
        if(size == 0){
            throw new Exception ("Store is empty");
        }else if(size != 0){
            System.out.println(quantop.quantity - quan);
        }
        StackNode temporary = top;
        StackNode tempo = quantop;
        
        while (temporary != null || tempo != null){
            System.out.println("ProductName:  -> " + temporary.productName + "        Quantity: -> " + tempo.quantity);
            temporary = temporary.next;
            tempo = tempo.next;
        }
        
        
        System.out.println("NULL");
  }
  
    public static void main(String[] args) throws Exception {
        Bendijo_4Exam hehe = new Bendijo_4Exam();
        Scanner scan = new Scanner(System.in);
        boolean start = true;
        
        while(start) {
            System.out.println("---Bendijo Store---");
            System.out.println("1. Insert Product");
            System.out.println("2. Sell Product");
            System.out.println("3. Display Product");
            int choice = scan.nextInt();
            
            
            
            switch (choice) {
                case 1:
                    System.out.println("Insert product");
                    scan.nextLine();
                    String product = scan.nextLine();
                    System.out.println("Enter Quantity");
                    int quantity = scan.nextInt();
                    hehe.push(product, quantity);
                    break;
                case 2:
                    boolean oo = true;
                    
                    while(true){
                    
                    System.out.println("Enter a product to sell");
                    scan.nextLine();
                    String sell = scan.nextLine();
                    
                    String element = sell;
                    String posi = hehe.peek(element);
                    if (posi == null){
                        System.out.println("Product doesn't exist");
                    }else if(posi != null){
                    System.out.println("Enter quantity to buy");
                    int quanti = scan.nextInt();
                    

                        int qua = quanti;
                        
                    if (qua != 0) {
                         System.out.println("You buy " + qua + " " + element);
                         hehe.popQuantity(qua);
                    }
                    }
                   break;
                    }
                case 3:
                    hehe.display(0);
                    break;
                default:
                    
                    throw new AssertionError();
            }
        }

    }
    }   


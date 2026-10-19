/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import com.mycompany.messagedemo.Message;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MessageDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
          System.out.println("==========================");
          System.out.println("=    MESSAGE DEMO APP    =");
          System.out.println("==========================");
          
          System.out.println("how many messages would you wish to send");
          int numberOfMessages = input.nextInt();
          
          for (int i = 0; i<numberOfMessages; i++){
              System.out.println();
              System.out.println("Message "+ (i + 1));
              System.out.println("===========================================");
              
              String recipient;
              Message messageObject;
              
              do{
                  System.out.println("Enter recipient cell number using +27: ");
                  recipient = input.nextLine();
                  
                  messageObject = new Message (i, recipient, "Temporary message");
                  System.out.println(messageObject.isCheckRecipientCell());
            }while(!messageObject.isCheckRecipientValid());
              
            String messageText;
            
            do{
                System.out.println("Enter your message: ");
                messageText = input.nextLine();
                
                messageObject = new Message(i, recipient, messageText);
                System.out.println(messageObject.checkMessageLength());
            }while(!messageObject.isMessageValid());
            
            Message finalMessage = new Message(i, recipient, messageText);
            
              System.out.println();
              System.out.println("Generate Information");
              System.out.println("====================");
              
              System.out.println("Message ID: "+ finalMessage.getMessageID());
              System.out.println("Message Hash: "+ finalMessage.getMessageHash());
              
              System.out.println();
              System.out.println("What would you like to do now?");
              System.out.println("1 - send message");
              System.out.println("0 - Disregard message");
              System.out.println("2 - store message");
              
              System.out.println("select an option");
              int option = input.nextInt();
              
              if(option ==1){
                  System.out.println(finalMessage.sentMessage(1));
                  
                  System.out.println();
                  System.out.println("MESSAGE DETAILS");
                  System.out.println(finalMessage.printMessagesDetails());
              }else if (option ==0){
                  System.out.println(finalMessage.sentMessage(0));
              }else if (option ==2){
                  System.out.println(finalMessage.sentMessage(2));
                  System.out.println(finalMessage.storeMessage());
              }else {
                  System.out.println("Invalid option.");
                
                  
            }
            
        }
          
        System.out.println();
        System.out.println("====================================");
        System.out.println("=             SUMMARY              =");
        System.out.println("====================================");
        
        Message summary = new Message(
                "000000",
                0,
                "+27365458695",
                "summary"
        );
        
        System.out.println("Total message sent: " + summary.returnTotalMessages());
        System.out.println();
        System.out.println("MESSAGE SENT");
        System.out.println(summary.printMessages());
        
        input.close();
          
        
    }
}

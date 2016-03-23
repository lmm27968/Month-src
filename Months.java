
import javax.swing.JOptionPane;
public class Months { 
   public enum AccountType {December, January, February, March, April, May, June, July, August, September, October, November}
 public static void main(String[] args) { 
             AccountType[] choices = { AccountType.December, AccountType.January, AccountType.February, AccountType.March, AccountType.April, AccountType.May, AccountType.June, AccountType.July, AccountType.August, AccountType.September, AccountType.October, AccountType.November }; 
             AccountType input = (AccountType) JOptionPane.showInputDialog(null,"Select the month you like.", "Months", 
                                                                           JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]); 
             while (input!=null) { 
                      //Fill in switch case code below to check for account type and return appropriate Welcome message
  
                      input = (AccountType) JOptionPane.showInputDialog(null,"Select the month you like!.", "Months", 
                    		  	JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
      
			switch(input) {
             case December:
            	 JOptionPane.showMessageDialog(null, "Do you wanna build a snow man?");
            	 break;
             case January:
            	 JOptionPane.showMessageDialog(null, "Do you wanna build a snow man?");
            	 break;
             case February:
            	 JOptionPane.showMessageDialog(null, "Do you wanna build a snow man?");
            	 break;
             case March:
            	 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
            	 break;
             case April:
            	 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
            	 break;
             case May:
            	 JOptionPane.showMessageDialog(null, "Happy Spring Days!");
            	 break;
             case June:
            	 JOptionPane.showMessageDialog(null, "It's Summer time!");
            	 break;
             case July:
            	 JOptionPane.showMessageDialog(null, "It's Summer time!");
            	 break;
             case August:
            	 JOptionPane.showMessageDialog(null, "It's Summer time!");
            	 break;
             case September:
            	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                 break;
             case October:
            	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
            	 break;
             case November:
            	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
            	 break;
            	 default:
                	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");

            	 

         	

             }
             
             
             
             
             } 
             
             
   }
}
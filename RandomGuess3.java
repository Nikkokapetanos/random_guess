// Nikko Kapetanos 5/18/2023 exercise
import javax.swing.JOptionPane;
public class RandomGuess3 
{
    
    
    public static void main(String[] args)
    {
           
           int secretNumber = (int) (Math.random()*10)+1; 
           JOptionPane.showMessageDialog("Please think of a number from 1 to 10");
           JOptionPane("The secret number was " + randomNumber);
          
    }
}
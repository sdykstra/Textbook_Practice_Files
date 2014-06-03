import javax.swing.JOptionPane;


/**
 *
 * @author Scott Dykstra
 */
public class IncomeDisplay {
    
    public static void main(String[] args)
    {
    String inputString;
    double income;
    inputString =JOptionPane.showInputDialog("Please enter your annual income");
    income = Double.parseDouble(inputString);
    System.exit(0);
        
    }
   
}

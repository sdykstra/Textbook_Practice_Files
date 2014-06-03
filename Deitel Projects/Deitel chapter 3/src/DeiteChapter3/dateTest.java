package DeiteChapter3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ft
 */
public class dateTest {
    
    public static void main(String[]args){
    
    Date date1 = new Date();
    
    date1.setMonth(12);
    date1.setDate(31);
    date1.setYear(2011);;
    System.out.println(date1.displayDate());
}//end main
}// end datetest
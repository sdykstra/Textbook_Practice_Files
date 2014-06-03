package DeiteChapter3;

import java.util.Scanner;


public class GradeBookTest {
    
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
        GradeBook myGradeBook1 = new GradeBook("java 101");
        
        GradeBook myGradeBook2 = new GradeBook("java 201");
        
        
        System.out.printf("gradebook1 name is: %s\n\n",
                myGradeBook1.getCourseName());
        
       System.out.printf("gradebook2 name is: %s\n\n",
                myGradeBook2.getCourseName());
       
       myGradeBook2.displayMessage();
       
       myGradeBook1.inputGrades();
       myGradeBook1.displayGradeReport();
       myGradeBook2.determineClassAverage();
       
    }// end main
    
}// end GradeBookTest

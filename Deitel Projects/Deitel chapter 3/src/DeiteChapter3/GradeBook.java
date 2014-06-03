package DeiteChapter3;


import java.util.Scanner;

public class GradeBook {

    Scanner input = new Scanner(System.in);
    private String courseName;
    private int total, gradeCounter, aCount, bCount, cCount, dCount, fCount;

    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the Grade Book for \n%s!\n",
                getCourseName());
    }

    public void determineClassAverage() {
        int total, gradeCounter, grade;
        double average;

        total = 0;
        gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit:");
        grade = input.nextInt();

        while (grade != -1) {

            total += grade;
            gradeCounter++;

            System.out.print("Enter grade or -1 to quit:");
            grade = input.nextInt();

        }// end while

        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;

            System.out.printf("\nTotal of all %d grades is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
        } else {
            System.out.println("No grades entered");
        }
    }// end determineClassAverage

    public void inputGrades() {
        
        int grade;
        System.out.printf("%s\n%s\n    %s\n   %s\n",
              "Enter the integer grades in range 1-100",
              "Type the end-of-file indicator to terminate input: ",
              "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
              "On Windows type<Ctrl> z then press enter ");
        
        while(!input.hasNext()){
            grade = input.nextInt();
            total += grade;
            ++gradeCounter;
            
            incrementLetterGradeCounter(grade);
        }// end while
        
        }// end inputGrades
    
    private void incrementLetterGradeCounter(int grade){
        switch(grade/10){
            case 9:
            case 10:
                ++aCount;
                break;
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;
                              
        }// end switch
    }// end incrementLetterGradeCounter
    
    public void displayGradeReport(){
        System.out.println("\nGrade Report: ");
        
        if (gradeCounter !=0){
            
            double average = (double)total/gradeCounter;
            
            System.out.printf("Total of the %d grades entered is %d\n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of Students who received each grade: ",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
            
        }else{
            System.out.println("No grades were entered!");
        }
    }
    
}//end GradeBook

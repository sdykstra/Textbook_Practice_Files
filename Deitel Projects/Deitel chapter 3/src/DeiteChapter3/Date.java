package DeiteChapter3;




public class Date {

    int month, date,year;
    
    public void Date(){
        year = 0;
        date = 0;
        month = 0;
    }
    
    public void setMonth(int setMonth){
        if(setMonth<= 12){
            if(0 < setMonth){
            month = setMonth;
            }
        }
    }// end setMonth
   
     public void setDate(int setDate){
        if(setDate<= 366){
            if(0 < setDate){
            date = setDate;
            }
        }
    }// end setDate
     
      public void setYear(int setYear){
        if(setYear<= 3000){
            if(0 < setYear){
            year = setYear;
            }
        }
    }// end setYear
    
      public String displayDate(){
          String d;
          
          d = "" + month + "\\" + date + "\\" + year;
          
          return d;
      }
      
}// end Date class

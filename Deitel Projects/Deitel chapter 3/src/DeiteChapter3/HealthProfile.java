package DeiteChapter3;


/**
 *
 * @author ft
 */
public class HealthProfile {

    int birthMonth, birthDay, birthYear,maximumHeartRate;
    String firstName, lastName, gender;
    int currentYear = 2012;
    int age = currentYear - birthYear;
    int height, weight;
    public void HealthProfile() {
        firstName = null;
        lastName = null;
        birthYear = 0;
        birthDay = 0;
        birthMonth = 0;
        gender = null;
        height = 0;
        weight = 0;
    }

    public void setLastName(String lastN) {
        lastName = lastN;
    }

    public void setFirstName(String firstN) {
        firstName = firstN;
    }

    public void setGender(String genderIn) {
        gender = genderIn;
    }

    public void setMonth(int setMonth) {
        if (setMonth <= 12) {
            if (0 < setMonth) {
                birthMonth = setMonth;
            }
        }
    }// end setMonth

    public void setDay(int setDate) {
        if (setDate <= 31) {
            if (0 < setDate) {
                birthDay = setDate;
            }
        }
    }// end setDate

    public void setYear(int setYear) {
        if (setYear <= currentYear) {
            if (0 < setYear) {
                birthYear = setYear;
            }
        }
    }// end setYear
    
    public void setHeight(int heightIn){
        height = heightIn;
    }
    
    public void setWeight(int weightIn){
        weight = weightIn;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getGender(){
        return gender;
    }

    public String getBirthDate() {
        String d;

        d = "" + birthMonth + "\\" + birthDay + "\\" + birthYear;

        return d;
    }
    
     public int getHeight(){
        return height;
    }
     
     public int getWeight(){
        return weight;
    }

    public int getAge() {
        age = currentYear - birthYear;
        return age;
    }
      public int maximumHeartRate() {
        maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    public String targetHeartRate() {

        double lowTargetHeartRate = .50 * maximumHeartRate;
        double highTargetHeartRate = .85 * maximumHeartRate;
        String s = " between " + lowTargetHeartRate + " and " + highTargetHeartRate + " ";

        return s;
    }
    
    public String BMI(){
        String s;
        int bmi = (weight*703)/(height*height);
        s = "       BMI VALUES\n Underweight: less than 18.5\n Nornal: "+
                "between 18.5 and 24.9\n Overweight: between 25 and 29.9\n" +
                "Obese: 30 or greater\n Your BMI is " + bmi ;
        return s;
    }
    
}// end HealthProfile

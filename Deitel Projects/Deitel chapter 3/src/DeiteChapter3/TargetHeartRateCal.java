package DeiteChapter3;

/**
 *
 * @author ft
 */
public class TargetHeartRateCal {

    int birthMonth, birthDay, birthYear, maximumHeartRate, age;
    String firstName, lastName;
    int currentYear = 2012;

    public void TargetHeartRateCal() {
        firstName = null;
        lastName = null;
        birthYear = 0;
        birthDay = 0;
        birthMonth = 0;

    }

    public void setLastName(String lastN) {
        lastName = lastN;
    }

    public void setFirstName(String firstN) {
        firstName = firstN;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
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

    public String displayBirthDate() {
        String d;

        d = "" + birthMonth + "\\" + birthDay + "\\" + birthYear;

        return d;
    }

    public int age() {
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
}

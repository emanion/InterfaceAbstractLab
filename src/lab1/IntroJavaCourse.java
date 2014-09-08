package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 * 
 * 
 * EM changes...
 *    change to extend CollegeCourse
 *    changed constructor to use SETTER methods  (better for validation)
 *    added methods  setCourseName, getCourseName
 *    corrected recursion in method setCredits  (i.e. method called itself)
 */
public class IntroJavaCourse extends CollegeCourse{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public void setCourseName(String courseName)
    {
        // validation of input goes here....
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    
    
    public String toString()
    {
        String result = "\nIntro Java course" + 
                        "\nCourse Name = " + getCourseName() +
                        "\nCourse Number = " + getCourseNumber() + 
                        "\nCredits = " + getCredits() +
                        "\nPrerequisites = " + getPrerequisites() + 
                        "\n";
        return result;                
                        
    }
    
    

}

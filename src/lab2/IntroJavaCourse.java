package lab2;  

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 * 
 * 
 * EM changes...
 *    change to implement CollegeCourse
 *    added toString method
 *    added courseName getters and setters
 *    fixed constructor to use setter methods
 * 
 */
public class IntroJavaCourse implements CollegeCourse{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public String getCourseName() {
        return courseNumber;
    }

    public void setCourseName(String courseName) {
        //input validations go here.....
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
    @Override
    public String toString()
    {
        String result = "\nAdvanced Java course" + 
                        "\nCourse Name = " + getCourseName() +
                        "\nCourse Number = " + getCourseNumber() + 
                        "\nCredits = " + getCredits() +
                        "\nPrerequisites = " + getPrerequisites() + 
                        "\n";
        return result;                
                        
    }
    
}

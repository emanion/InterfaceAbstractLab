package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 * 
 * 
 * EM changes...
 *    change to extend CollegeCourse
 *    added toString method
 *    corrected recursion in method setCredits  (i.e. method called itself)
 *    added method getCredits()
 */
public class AdvancedJavaCourse extends CollegeCourse {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public double getCredits()
    {
        return credits;
    }
    
    public void setCredits(double credits) {
        
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
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

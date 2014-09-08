package lab1;

/**
 * Write a description of class CollegeCourseTestDrive here.
 * 
 * @author (Ed Manion) 
 * @version (09/05/14)
 * 
 * 
 * 
 * 
 * 
 * Abstract super classes are a great way to ensure uniformity in   
 * sub-classes.  But the bottom line is that you still need to know
 * the nature of the application.  If the commonality will never change, it
 * is probably better to use concrete super classes.  But when in doubt,
 * use either abstract or interface super-classes.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class CollegeCourseTestDrive
{
    public static void main(String[] args)
    {
    
        System.out.println("\nstarting CollegeCourseTestDrive");
        
        
        // start constructing an Intro to Programming Course Ojbect
        
        String courseName = "Intro to Programming 2014";
        String courseNumber = "001";
        
        IntroToProgrammingCourse courseC = new IntroToProgrammingCourse(courseName, courseNumber);
        double credits = 1.0;
        courseC.setCredits(credits);
        System.out.println(courseC.toString());
        
        
        
        // start constructing an Intro Java Course Ojbect
        
        courseName = "Intro Java 2014";
        courseNumber = "101";
        
        IntroJavaCourse courseB = new IntroJavaCourse(courseName, courseNumber);
        credits = 3.0;
        courseB.setCredits(credits);
        courseB.setPrerequisites("intro to programming");
        System.out.println(courseB.toString());
        
        
        
        
        
        // start constructing an Advanced Java Course Ojbect
        courseName = "Advanced Java 2014";
        courseNumber = "201";
        
        AdvancedJavaCourse courseA = new AdvancedJavaCourse(courseName, courseNumber);
        credits = 3.0;
        courseA.setCredits(credits);
        courseA.setPrerequisites("intro to Java");
        
        System.out.println(courseA.toString());
        
        
        
        // start constructing Liskov Substitution
        courseName = "Advanced Java 2014 - Test";
        courseNumber = "222";
        
        CollegeCourse courseD = new AdvancedJavaCourse(courseName, courseNumber);
        // cannot use methods that are not in super class now........
        //credits = 3.0;
        //(AdvancedJavaCourse)courseD.setCredits(credits);
        //courseD.setPrerequisites("intro to Java");
        
        System.out.println(courseD.toString());
        
        
    
    }
}

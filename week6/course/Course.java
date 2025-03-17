public class Course {
    private String courseID;
    private String courseName;
    protected int durationWeeks;

    //default constructor
    public Course(){
        this.courseID = null;
        this.courseName = "N/A";
        this.durationWeeks = 0;

    }

    //parameterized constructor
    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    public void displayCourseDetails(){
        System.out.print("Course ID: " + courseID);
        System.out.print("Course Name: " + courseName);
        System.out.print("Durations: " + durationWeeks + " weeks");
    }

    public double calculateTotalFee(){
        return 10000.00;
    }

    public double calculateTotalFee(double discountPercentage){
        return calculateTotalFee()*(1-discountPercentage/100);
    }
}

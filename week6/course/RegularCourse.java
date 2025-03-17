public class RegularCourse extends Course{

    private boolean hasLiveSession;

    //default constructor
    public RegularCourse(){
        super();
        this.hasLiveSession = false;
    }

    //parameterized constructor

    public RegularCourse(String courseID, String courseName, int durationWeeks, boolean hasLiveSession) {
        super(courseID, courseName, durationWeeks);
        this.hasLiveSession = hasLiveSession;
    }

    @Override
    public double calculateTotalFee() {
        return 100*durationWeeks;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Live Sessions: " + (hasLiveSession ? "Include" : "Not Include"));
        System.out.println("Total Fee: " + calculateTotalFee());
    }
}

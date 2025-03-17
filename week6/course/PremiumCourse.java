public class PremiumCourse extends Course{

    private boolean includeCertification;

    //default constructor

    public PremiumCourse() {
        super();
        this.includeCertification = false;
    }

    public PremiumCourse(String courseID, String courseName, int durationWeeks) {
        super(courseID, courseName, durationWeeks);
        this.includeCertification = includeCertification;
    }

    public double calculateTotalFee(){
        double fee = (150*durationWeeks);
        if (includeCertification){
            fee += 50;
        }
        return fee;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println();
        System.out.println("total Fee: " + calculateTotalFee());
    }
}

public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

    public ScholarshipStudent(int studentId, String studentName, double scholarshipPercentage) {
        super(studentId, studentName);
        this.scholarshipPercentage = scholarshipPercentage;
    }

    // getters and setters
    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }
    @override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }
    @override
    public void displayStudentInfo(boolean showScholarship) {
        super.displayStudentInfo(showMarks);
        }
    }
@override
    public void generateReportCard() {
        // Implementation for generating report card for scholarship student
        System.out.println("Generating report card for scholarship student: " + getStudentName());
    }

    @override
    public void eligibleForScholarship() {
        System.out.println("Eligibility for scholarship student: " + getStudentName());
    }
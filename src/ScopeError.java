public class ScopeError {
    private int score;

    public ScopeError(int score) {
        this.score = score;
    }

    public String grade() {
        if (score >= 90) {
            String grade = "";
            grade = "A";
        } else if (score >= 80){
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}

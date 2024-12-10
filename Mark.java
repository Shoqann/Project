package ProjectB;
public class Mark {
    private float att1;
    private float att2;
    private float finalExam;

    public Mark(float att1, float att2, float finalExam) {
        this.att1 = att1;
        this.att2 = att2;
        this.finalExam = finalExam;
    }

    public float calculateTotal() {
        return att1 + att2 + finalExam;
    }

    // Getters and setters
    public float getAtt1() {
        return att1;
    }

    public void setAtt1(float att1) {
        this.att1 = att1;
    }

    public float getAtt2() {
        return att2;
    }

    public void setAtt2(float att2) {
        this.att2 = att2;
    }

    public float getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(float finalExam) {
        this.finalExam = finalExam;
    }
}
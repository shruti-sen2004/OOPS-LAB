abstract class Student {
    String studentName;
    int rollNo;

    void setInfo(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }
    abstract void giveExam();
}

class CseStudent extends Student {
    private String stream = "CSE";

    void giveExam() {
        System.out.println(studentName + " with roll: " + this.rollNo + " from " + this.stream + " gives exam");
    }
}

class ItStudent extends Student {
    String stream = "IT";

    void giveExam() {
        System.out.println(this.studentName + " with roll: " + this.rollNo + " from " + this.stream + " gives exam");
    }
}

class Main {
    public static void main(String[] args) {
        CseStudent student1 = new CseStudent();
        ItStudent student2 = new ItStudent();
        student1.setInfo("Avi", 48);
        student1.giveExam();
        student2.setInfo("Shru", 22);
        student2.giveExam();

        System.out.println();
        Student student;
        student = new CseStudent();
        student.setInfo("Shru", 22);
        student.giveExam();

        student = new ItStudent();
        student.setInfo("Avi", 48);
        student.giveExam();
    }
}
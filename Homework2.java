import java.util.Scanner;
class Student {
    long studentId;
    String name;
    String major;
    long phoneNumber;

    public Student(long studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
    public long getStudentId() {
        return studentId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public String getFormattedPhoneNumber() {
        String numStr = String.format("%011d", phoneNumber);
        return numStr.substring(0, 3) + "-" + numStr.substring(3, 7) + "-" + numStr.substring(7);
    }
}
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        String[] order = {"첫번째", "두번째", "세번째"};
        for(int i=0;i<students.length;i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String s = sc.nextLine();
            String[] parts = s.split(" ");

            long studentId = Long.parseLong(parts[0]);
            String name = parts[1];
            String major = parts[2];
            long phoneNumber = Long.parseLong(parts[3]);

            students[i] = new Student(studentId, name, major, phoneNumber);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            System.out.println(order[i] + " 학생: " +
                    students[i].getStudentId() + " " +
                    students[i].getName() + " " +
                    students[i].getMajor() + " " +
                    students[i].getFormattedPhoneNumber());
        }
        sc.close();
    }
}
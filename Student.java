public class Student {

  private int studentNo;
  private String studentLastName;
  private String studentFirstName;
  private String className;
  private String gender;


  public Student(int studentNo, String studentLastName, String studentFirstName,
      String className, String gender) {
    this.studentNo = studentNo;
    this.studentLastName = studentLastName;
    this.studentFirstName = studentFirstName;
    this.className = className;
    this.gender = gender;
  }

  public int getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(int studentNo) {
    this.studentNo = studentNo;
  }

  public String getStudentLastName() {
    return studentLastName;
  }

  public void setStudentLastName(String studentLastName) {
    this.studentLastName = studentLastName;
  }

  public String getStudentFirstName() {
    return studentFirstName;
  }

  public void setStudentFirstName(String studentFirstName) {
    this.studentFirstName = studentFirstName;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        Student a1=new Student(sc.nextInt(), sc.next(), sc.next(), sc.next());


        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        sc=new Scanner(System.in);
        Student a2=new Student(sc.nextInt(), sc.next(), sc.next(), sc.next());

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        sc=new Scanner(System.in);
        Student a3=new Student(sc.nextInt(), sc.next(), sc.next(), sc.next());


        System.out.println("첫번째 학생: "+a1.print());
        System.out.println("두번째 학생: "+a2.print());
        System.out.println("세번째 학생: "+a3.print());

    }
}


class  Student{
    int studentnumber;
    String name;
    String major;
    String phonenum;

    public Student(int studentnumber, String name, String major, String phonenum) {
        this.studentnumber = studentnumber;
        this.name = name;
        this.major = major;
        this.phonenum = phonenum;
    }
    void setStudentnumber(int studentnumber) {
        this.studentnumber = studentnumber;
    }
    int getStudentId() {
        return studentnumber;
    }
    void setName(String name){
        this.name=name;
    }
    String getName() {
        return name;
    }
    void setMajor(String major) {
        this.major=major;
    }
    String getMajor() {
        return major;
    }
    void setPhoneNum(String phonenum) {
        this.phonenum=phonenum;
        Integer.parseInt(phonenum);
    }
    String getPhoneNum() {
        return phonenum;
    }

    public String print() {
        phonenum=phonenum.substring(0,3)+"-"+phonenum.substring(3,7)+"-"+phonenum.substring(7,11);
        return "학번 : "+studentnumber+", "+"이름 : "+name+", "+"전공 : "+major+", "
                +"전화번호 : "+phonenum;
    }
}

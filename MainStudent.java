

public class MainStudent {
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2 = new Student();
        Student student3= new Student();

        student1.setName("Xiaoming Wang");
        student1.setstudent ID("108021085");
        student1.setheight("159");
        student1.setGrade("1A");
        student1.setGender("male");


        student2.setName("Xiaoli Zhang");
        student2.setstudent ID("108021186");
        student2.setheight("169");
        student2.setGrade("2B");
        student2.setGender("female");


        student3.setName("Xiao Wei Xu");
        student3.setstudent ID("108021259");
        student3.setheight("173");
        student3.setGrade("3A");
        student3.setGender("female");

        System.out.println("Student1 for Xiaoming Wang ");
        student1.showInfo();
        System.out.println("Student2 for Xiaoli Zhang ");
        student2.showInfo();
        System.out.println("Student3 for Xiao Wei Xu ");
        student3.showInfo();
    }
}


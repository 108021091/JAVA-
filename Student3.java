public class Student3 {
    private String name, student ID,Body type, height,Gender;


    public Student3() {
    }


    public void Student() {
        System.out.println("Student object has created");


    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setstudent ID(String newstudent ID) {

        this.student ID = newstudent ID;
    }

    public Object getstudent ID() {
        return this.student ID;
    }


    public void setheight(String newheight) {
        this.height = newheight;
    }

    public String getheight() {
        return this.height;
    }

    public void setGrade(String newGrade) {
        this.Grade = newGrade;
    }

    public String getGrade() {
        return this.Grade;
    }

    public void setGender(String newGender) {
        this.Gender = newGender;
    }

    public String getGender() {
        return  this.Gender;
    }
    public void Study(){

    }
    public void Sleep(){

    }
    public void Eat(){

    }
    public void showInfo(){
        System.out.println("Student Name:"+this.name+","+"student ID : "+this.student ID+","+"Study Body type:"+this.Body type+","+"height:"+this.height+","+"Gender:"+this.Gender );
    }
}

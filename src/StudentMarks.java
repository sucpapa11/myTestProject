public class StudentMarks {

    String Name;
    int RollNum;
    int Marks;

    StudentMarks(int RollNum, String Name, int Marks){

        this.Marks=Marks;
        this.RollNum=RollNum;
        this.Name=Name;
    }

    void PassedFailed(){
        if (Marks>34) {
            System.out.println("Student is passed");
                }
            else {
                System.out.println("Student is Failed");
            }
        }
    }


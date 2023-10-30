
package classroommanager;


public class Classroom {
    
    //Attributes
    private int id;
    private Teacher teacher;
    private Alumn[] alumn;
    private String subject;
    
    //Constants
    private final int MAX_ALUMNS =  20; //Maximun alumns per classroom
    public static final String [] SUBJECTS = {"Mathematics", "Philosophy", "Physics"};
    
    //Builder
    public Classroom() {
        id = 1;
        teacher = new Teacher();
        alumn = new Alumn[MAX_ALUMNS];
        addAlumns();
        subject = SUBJECTS[Person.generateRandomNumber(0, 2)];
    }
    
    public void addAlumns() {
        for (int i = 0; i<alumn.length; i++) {
            alumn[i] = new Alumn();
        }
    }
    
    public boolean isStudentAssistance() {
        int count = 0;
            for (int i=0; i<alumn.length; i++) {
                if (alumn[i].isAvailability()) {
                    count++;
                }
            }
            if (count >= ((int)(MAX_ALUMNS/2))) {
                return true;
            }
            else {
                return false;
            }
    }
    
    public boolean ableToTeach() {
        if (!teacher.isAvailability()) {
            System.out.println("The teacher is not available");
            return false;
        }
        else if (!teacher.getSubject().equals(subject)) {
            System.out.println("This teacher cannot teach the same subject as the class");
            return false;
        }
        else if (!isStudentAssistance()){
            System.out.println("There is not enough student attendance to teach class");
            return false;
        }
        System.out.println("The classroom is able to teach");
        return true;
    }
    
    public void qualification() {
        int maleCount = 0;
        int femaleCount = 0;
        for (int i=0; i<alumn.length; i++) {
            if (alumn[i].getQualification() >= 5) {
                if(alumn[i].getGender() == 'M') {
                    maleCount++;
                }
                else {
                    femaleCount++;
                }
                System.out.println(alumn[i].toString());
            }
        }
        System.out.println("There are " + maleCount + " male alumns and " + femaleCount + " female alumns approved");     
    }
    
    
    
    
}

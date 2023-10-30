
package classroommanager;

public class Main {

    public static void main(String[] args) {
        
        Classroom classroom = new Classroom();
        
        if(classroom.ableToTeach()) {
            classroom.qualification();
        }
        
    }
    
}

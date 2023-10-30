
package classroommanager;

public class Teacher extends Person {
    
    //Attributes
    private String subject; //mathematics, philosophy or physics

    //Builders
    public Teacher() {  
    }
    
    public Teacher(String subject, String name, int age, char gender) {
        super(name, age, gender);
        this.subject = subject;
    }
    
    //Getters & Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        subject = Classroom.SUBJECTS[Person.generateRandomNumber(0, 2)];
                
    }
    
    @Override
    public void setAge(int age) {
        age= Person.generateRandomNumber(30, 60);
    }

    public void setAvailability() {
        int probability = Person.generateRandomNumber(0, 100);
        if (probability>=20) {
            super.setAvailability(true);
        }
        else {
            super.setAvailability(false);
        }
    }

    @Override
    public boolean isAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

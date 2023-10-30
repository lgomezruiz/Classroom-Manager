
package classroommanager;

public class Alumn extends Person {
    
    //Attributes
    private int qualification; //0 to 10
    
    //Builders
    public Alumn() {
    }
    
    public Alumn(int qualification, String name, int age, char gender) {
        super(name, age, gender);
        this.qualification = qualification;
    }

    //Getters & Setters
    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        qualification = Person.generateRandomNumber(0, 10);
    }

    @Override
    public void setAge(int age) {
        age= Person.generateRandomNumber(12, 18);
    }

    public void setAvailability() {
        int probability = Person.generateRandomNumber(0, 100);
        if (probability>=50) {
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
    
    @Override
    public String toString() {
        return "Nombre: " + super.getName() + ", Gender: " + super.getGender() + ", Age: " + super.getAge() + ", Qualification: " + qualification;
    }
   
}

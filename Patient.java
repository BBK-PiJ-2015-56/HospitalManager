  public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	public void addPatient(Patient newPatient){
		if(this.nextPatient == null){
			this.nextPatient = newPatient;
		}
		else{
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patientToDelete){     
		if (this.nextPatient == null)
			return false;
		else{
			if (this.nextPatient.name.equals(patientToDelete.name)){
				this.nextPatient = nextPatient.nextPatient;
			    return true;
			}
			else{
				return this.nextPatient.deletePatient(patientToDelete);
			}
		
	    }
	
	}
		
	public void printThisPatientAndRecur(){
		System.out.println("This patient's name is " + this.name + ". There age is " + this.age +". There illness is " + this.illness + "."); 
        if (nextPatient == null)
			System.out.println ("End of List.");
		else
		    nextPatient.printThisPatientAndRecur();		                               
	}
		

	public String getName(){
		return name;
	}
	public Patient getNextPatient(){
		return nextPatient;
	}
	
} 
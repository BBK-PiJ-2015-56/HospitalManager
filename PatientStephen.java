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
	
	public boolean deletePatient(Patient patientToDelete){     //why cant we have if something for this patient??
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
	
	
	//Stephen's advice:a method should only do what it needs to do - so only returning the string. 
	public String getPatientList(Patient p){
		return p.toString() + getPatientList(p.nextPatient)
	}
	
	public String toString(){
		return "/n";
	}
	
	
	public void printThisPatientAndRecur(){
		System.out.println("This patient's name is " + this.name + ". There age is " + this.age +". There illness is " + this.illness + "."); 
        if (nextPatient == null)
			System.out.println ("End of List.");
		else
		    nextPatient.printThisPatientAndRecur();		                               
	}
		//could we do with toString? what is first patient ==null? ie no patients
		// it looks wrong in hospital manager, as it looks like only 1 patient is printed 

} 
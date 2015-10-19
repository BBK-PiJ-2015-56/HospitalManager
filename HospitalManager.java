public class HospitalManager{
	private Patient patientListStart = null;    
	//creates and points to a first patient space in memory, but this space doesn't point to any values for the patient (ie null)
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		//this creates the object hm - no constructor class so it just creates a super object of the type HospitalManager.
		hm.launch();
	}
	
	
	//we have a launch method that creates the first patient and then points the starter object "patientListStart" to it.
	public void launch(){
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
	
		Patient secondPatient = new Patient("simon", 56, "Meningitis");
		patientListStart.addPatient(secondPatient);
	
		Patient thirdPatient = new Patient("James", 16, "broken leg");
		patientListStart.addPatient(thirdPatient);
	
		Patient fourthPatient = new Patient("Catherine", 32, "flu");
		patientListStart.addPatient(fourthPatient);
	
		//	Patient fifthPatient = new Patient("Pedro", 34, "confused about Java (but enjoying it)");
		//	patientListStart.addPatient(fifthPatient);
	
		patientListStart.addPatient(new Patient("Pedro", 34, "confused about Java (but enjoying it)"));
		//need to test - how would I delete Pedro if it is done like this?
		System.out.println("" + patientListStart.getLength());
		firstPatient.printThisPatientAndRecur();                  
		//how do we have indices with lists. do we keep a separate int instance variable and keep passing it as a constructor arg for patient?
		//Q) wouldn't it be better to have a method printPatientList from within the hm object, which calls the recurring print method in patient??
		deletePatientIncludingFirst(thirdPatient); 
		//had hm.delete.... but it couldn't find it. Then I took hm. away and it worked. why?
		
		firstPatient.printThisPatientAndRecur();
		System.out.println("" + patientListStart.getLength());
		
		
		deletePatientIncludingFirst(patientListStart);
		firstPatient.printThisPatientAndRecur();
	}
	private boolean deletePatientIncludingFirst(Patient patientToDelete){
		if (patientListStart.getName().equals(patientToDelete.getName())){  //q) why cant it see patientToDelete.name?
			patientListStart = patientListStart.getNextPatient(); //this doesn't seem to be deleting patientListStart!
			return true;
		}
		else{
			return patientListStart.deletePatient(patientToDelete);
		}
		
	}
	
	
	
	
	
	
}
package com.bussiness.association.boot;

import com.bussiness.association.app.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in HospitalRunner");
		
		Hospital hospital = new Hospital();
		System.out.println("**********for Doctor************");
		hospital.addDoctor();
		hospital.findDoctorByName();
		
		System.out.println("**********for Nurse************");
		hospital.findNurseById();
		hospital.getNurseByShift();
		
		System.out.println("**********for Patient************");
		hospital.admitPatient();
		hospital.givePresciption();
	}

}

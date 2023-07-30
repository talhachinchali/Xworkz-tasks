package com.bussiness.association.app;

public class Hospital {

	public Doctor doctor = new Doctor();
	public Nurse nurse = new Nurse();
	public Patient patient = new Patient();
	
	public void addDoctor()
	{
		System.out.println("invoking addDoctor() method in Hospital");
		if(doctor!=null)
		{
			doctor.checkPatient();
		}
		else {
			System.out.println("doctor has null value, so cann't invoke checkPatient()");
		}
	}
	
	public void findDoctorByName()
	{
		System.out.println("invoking findDoctorByName() method in Hospital");
		if(doctor!=null)
		{
			doctor.prescribeMedicine();
		}
		else {
			System.out.println("doctor has null value, so cann't invoke prescribeMedicine()");
		}
	}
	
	public void findNurseById()
	{
		System.out.println("invoking  findNurseById() method in Hospital");
		if(nurse!=null)
		{
			nurse.takeVitalSigns();
		}
		else {
			System.out.println("nurse has null value, so cann't invoke prescribeMedicine()");
		}
	}
	
	public void getNurseByShift()
	{
		System.out.println("invoking  getNurseByShift() method in Hospital");
		if(nurse!=null)
		{
			nurse.giveMedicines();
		}
		else {
			System.out.println("nurse has null value, so cann't invoke giveMedicines()");
		}
	}
	
	public void admitPatient()
	{
		System.out.println("invoking  admitPatient() method in Hospital");
		if(patient!=null)
		{
			patient.requistAppointment();
		}
		else {
			System.out.println("nurse has null value, so cann't invoke requistAppointment()");
		}
	}
	
	public void givePresciption()
	{
		System.out.println("invoking  givePresciption() method in Hospital");
		if(patient!=null)
		{
			patient.getPrescription();
		}
		else {
			System.out.println("nurse has null value, so cann't invoke getPrescription()");
		}
	}
}

class Person
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<120)
            this.age = age;
    }

    public String getDetails()
    {
        return "Person: " + name + ", " + age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Patient extends Person
{
    String disease;

    public Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    public String getDetails()
    {
        return "Patient: " + getName() + ", " + getAge() + ", " + disease;
    }
}

class Doctor extends Person
{
    String specialization;
    Patient [] assignedPatients = new Patient[5];
    int patientCount = 0;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getDetails()
    {
        return "Doctor: " + getName() + ", " + getAge() + ", " + specialization;
    }

    public void addPatient(Patient p)
    {
        if(patientCount < 5)
        {
            assignedPatients[patientCount] = p;
            patientCount++;
        }
    }

    public void patientInfo()
    {
        for(int i = 0; i< patientCount; i++)
            System.out.println(assignedPatients[i].getDetails());
    }

}

class Treatment
{
    private String treatmentCode;
    private String description;

    public String getDescription() {
        return description;
    }

    public Treatment(String treatmentCode, String description) {
        this.treatmentCode = treatmentCode;
        this.description = description;
    }

    public Treatment(String treatmentCode) {
        this.treatmentCode = treatmentCode;
        description = "General Checkup";
    }

    public String treatmentInfo()
    {
        return "Treatment: " + treatmentCode + " - " + description;
    }
}

class Appointment
{
    Patient patient;
    Doctor doctor;
    Treatment treatment;
    double fee = -1;

    public Appointment(Patient patient, Doctor doctor, Treatment treatment) {
        this.patient = patient;
        this.doctor = doctor;
        this.treatment = treatment;
    }

    public void assignFee(double fee)
    {
        if(fee>0) this.fee = fee;
    }

    public String getReport()
    {
        if(fee != -1) return patient.getName() + " treated by " + doctor.getName() + " for " + treatment.getDescription() + ": " + fee;
        else return patient.getName() + " treated by " + doctor.getName() + " for " + treatment.getDescription() + ": Pending";
    }
}

public class HospitalMain {

    public static void main(String[] args) {

        Person [] arr = new Person[6];
        arr[0] = new Patient("Alice", 10, "Fever");
        arr[1] = new Patient("Bob", 11, "Common Cold");
        arr[2] = new Patient("Charles", 12, "Stomach Pain");
        arr[3] = new Patient("Dan", 13, "Food Poisoning");
        arr[4] = new Doctor("Dr. Einstein", 50, "Common Disease");
        arr[5] = new Doctor("Dr. Gates", 50, "Stomach Disease");

        for(Person p: arr)
            System.out.println(p.getDetails());

        ((Doctor)arr[4]).addPatient((Patient)arr[0]);
        ((Doctor)arr[4]).addPatient((Patient) arr[1]);
        ((Doctor)arr[5]).addPatient((Patient)arr[2]);
        ((Doctor)arr[5]).addPatient((Patient)arr[3]);

        Treatment t1 = new Treatment("X12", "Eat Medicine");
        Treatment t2 = new Treatment("Y12");

        System.out.println(t1.treatmentInfo());
        System.out.println(t2.treatmentInfo());

        Appointment a1 = new Appointment((Patient)arr[0],(Doctor)arr[4],t1);
        Appointment a2 = new Appointment((Patient)arr[1],(Doctor)arr[4],t1);

        a1.assignFee(90);
        a2.assignFee(-10);

        System.out.println(a1.getReport());
        System.out.println(a2.getReport());

        ((Doctor)arr[4]).patientInfo();
        ((Doctor)arr[5]).patientInfo();
    }
}

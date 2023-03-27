package appointmentsystem

class BootStrap {

    def init = { servletContext ->
        def surgery = new com.sp2292.sas.model.Surgery
        (
            name: 'City Health Centre',
            address: '21 Marble Street, Sheffield',
            postcode: 'S11 5TY',
            telephone: '0114 555 555',
            numberOfPatients: 50,
            description: 'Lorem ipsum',
            openingTime: '09:00 - 17:00',
            registeringNewPatients: true
        ).save()

        def doctor = new com.sp2292.sas.model.Doctor
        (
            doctorName: 'Dr Sarah Macdonald',
            qualifications: 'MBChB(Sheffield)',
            position: 'GP, Surgeon',
            doctorEmail: 's.macdonald@myemail.com',
            password: 'secret222',
            doctorOffice: 'D-9888',
            doctorPhone: '01111777',
            bio: 'Lorem ipsum',
            surgery: surgery
        ).save()

        def patient = new com.sp2292.sas.model.Patient
        (
            patientName: 'Tom Rivers',
            patientAddress: '2 One Way Street, Eckington',
            patientResidence: 'Sheffield, Barnsley, Doncaster',
            patientDOB: '1988-09-20',
            patientID: 'E25555',
            dateRegistered: '2021-02-26',
            patientPhone: '0114 222 4444',
            surgery: surgery
        ).save()

        def receptionist = new com.sp2292.sas.model.Receptionist
        (
            recepName: 'Rob Kingston',
            recepEmail: 'r.kingston@email.com',
            recepUsername: 'rking',
            recepPassword: 'secret2019',
            recepPhone: '0114 222 4445',
            surgery: surgery
        ).save()

        def nurse = new com.sp2292.sas.model.Nurse
        (
            nurseName: 'Susan Peters',
            qualifications: 'Registered General Nurse',
            nurseEmail: 's.peters@myemail.com',
            nurseOffice: 'B-455',
            nursePhone: '0114 222 4433',
            surgery: surgery
        ).save()

        def appointment = new com.sp2292.sas.model.Appointment
        (
            appDateTime: new Date(2021 - 1900, 3, 11, 15, 0, 0),
            duration: 60,
            roomNumber: 'A-1111',
            surgery: surgery,
            doctor: doctor,
            patient: patient
        ).save()

        def prescription = new com.sp2292.sas.model.Prescription
        (
            pharmacyName: 'City Centre Pharmacy',
            prescriptionNumber: 56788,
            medicine: 'Paracetamol',
            daysSupply: 10,
            totalCost: 5.9,
            dateIssued: new Date(2021 - 1900, 4, 25),
            patientPaying: false,
            doctor: doctor,
            patient: patient
        ).save()
    }
    def destroy = {
    }
}

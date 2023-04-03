package com.sp2292.sas.model

class Doctor extends Worker
{
    String qualifications
    String position
    String password
    String doctorOffice
    String bio

    static constraints =
    {
        qualifications()
        position()
        password()
        doctorOffice()
        bio()
    }

    static belongsTo = Nurse

    static hasMany =
    [
        nurses: Nurse,
        appointments: Appointment,
        prescriptions: Prescription
    ]
}
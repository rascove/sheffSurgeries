package com.sp2292.sas.model

class Patient extends Person
{
    String patientAddress
    String patientResidence
    Date patientDOB
    String patientID
    Date dateRegistered

    static constraints =
    {
        patientAddress()
        patientResidence()
        patientDOB()
        patientID()
        dateRegistered()
    }

    static hasMany =
    [
        surgeries: Surgery,
        appointments: Appointment,
        prescriptions: Prescription
    ]
}
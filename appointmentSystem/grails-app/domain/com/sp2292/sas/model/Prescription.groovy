package com.sp2292.sas.model

class Prescription
{
    String pharmacyName
    String prescriptionNumber
    String medicine
    int daysSupply
    double totalCost
    Date dateIssued
    boolean patientPaying

    String toString()
    {
        return prescriptionNumber
    }

    static constraints =
    {
        prescriptionNumber(unique: true)
        pharmacyName()
        medicine()
        daysSupply()
        totalCost()
        dateIssued()
        patientPaying()
    }

    static hasOne =
    [
        doctor: Doctor,
        patient: Patient
    ]
}
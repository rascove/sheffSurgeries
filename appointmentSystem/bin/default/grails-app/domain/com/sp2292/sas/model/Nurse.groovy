package com.sp2292.sas.model

class Nurse
{
    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    String toString()
    {
        return nurseName
    }

    static constraints =
    {
        nurseName()
        qualifications()
        nurseEmail()
        nurseOffice()
        nursePhone()
    }

    static hasOne = [surgery: Surgery]
    
    static hasMany = [doctors: Doctor]
}
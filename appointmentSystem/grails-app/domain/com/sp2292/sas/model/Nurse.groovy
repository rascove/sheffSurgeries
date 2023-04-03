package com.sp2292.sas.model

class Nurse extends Worker
{
    String qualifications
    String nurseOffice

    static constraints =
    {
        qualifications()
        nurseOffice()
    }
    
    static hasMany = [doctors: Doctor]
}
package com.sp2292.sas.model

class Appointment
{
    Date appDateTime
    int duration
    String roomNumber

    String toString()
    {
        return appDateTime
    }

    static constraints =
    {
        appDateTime()
        duration()
        roomNumber()
    }

    static hasOne =
    [
        surgery: Surgery,
        doctor: Doctor,
        patient: Patient
    ]
}
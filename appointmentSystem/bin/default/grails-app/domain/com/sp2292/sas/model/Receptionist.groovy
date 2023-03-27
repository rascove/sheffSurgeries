package com.sp2292.sas.model

class Receptionist
{
    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone

    String toString()
    {
        return recepName
    }

    static constraints =
    {
        recepName()
        recepEmail()
        recepUsername()
        recepPassword()
        recepPhone()
    }

    static hasOne = [surgery: Surgery]
}
package com.sp2292.sas.model

class Receptionist extends Worker
{
    String recepUsername
    String recepPassword

    static constraints =
    {
        recepUsername()
        recepPassword()
    }
}
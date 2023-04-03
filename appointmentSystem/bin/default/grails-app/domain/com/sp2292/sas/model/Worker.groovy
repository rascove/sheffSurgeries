package com.sp2292.sas.model

class Worker extends Person
{
    String email

    static constraints =
    {
        email()
    }

    static hasOne = [surgery: Surgery]
}
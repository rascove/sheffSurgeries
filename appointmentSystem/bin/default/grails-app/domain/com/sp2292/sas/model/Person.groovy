package com.sp2292.sas.model

class Person
{
    String name
    String phone

    String toString()
    {
        return name
    }

    static constraints =
    {
        name()
        phone()
    }
}
package com.kodilla.hibernate.manytomany.facade;

public class ExceptionHandler extends Exception{
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found.";
    public static String  ERR_COMPOANY_FOT_FOUND= "Comapany not found.";
    public static String ERR_FILED_NOT_EXIST ="Entered field is not exist.";

    public ExceptionHandler(String errMessage){
        super(errMessage);
    }


}

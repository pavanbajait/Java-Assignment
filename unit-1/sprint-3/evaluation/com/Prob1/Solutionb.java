package com.Prob1;

public class Solutionb {
    /*
    * Checked Exception: This exception are forced to handle at compile time
    * For handle such type of exception, code must throw exception & use throws keyword with method or should handle in catch block
    *
    * Unchecked Exception: This exception are not checked at compile time but checked at the time time of Runtime or execution of code by JVM.
    * It is not mandatory to handle such exception which occurs due tio logical errors
    * To handle such exception user needs to use try catch block with proper expected exception ty7pe.
    *
    * */
}


/*  Following two clases are the example of User defined checked & unchecked exceptiopn
* */

class MyCheckedException extends Exception{
    void message(){
        super.getMessage();
    }
}

class MyUncheckedException extends RuntimeException{
    void message(){
        super.getMessage();
    }
}
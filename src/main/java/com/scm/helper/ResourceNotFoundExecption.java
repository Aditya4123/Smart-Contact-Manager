package com.scm.helper;

public class ResourceNotFoundExecption extends RuntimeException {
   
    public ResourceNotFoundExecption(String message){
        super(message);
    }
    
    public ResourceNotFoundExecption(){
        super("Resource not found");
    }
}

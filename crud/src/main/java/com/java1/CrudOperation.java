package com.java1;
import org.springframework.boot.CrudOperation;
import org.springframework.boot.autoconfigure.CrudOperation;
@CrudOperation
public class CrudOperation 
{
public static void main(String[] args) 
{
CrudOperation.run(CrudOperation.class, args);
}
}

package org.maventest.calculator;

public class Сalculation {
    Сalculation(){
    }
    public static double calculate( double arg1, double arg2, String op){
        if(op.equals("add")){
            return arg1 + arg2;
        } else if (op.equals( "sub")) {
            return arg1 - arg2;
        }else if ( op.equals("div")){
            if(arg2 == 0){
                throw new ArithmeticException("/ by zero !");
            }else {
                return arg1/arg2;
            }
        }else if (op.equals("mull")){
            return arg1 * arg2;
        }else {
            throw new IllegalArgumentException();
        }
    }
}

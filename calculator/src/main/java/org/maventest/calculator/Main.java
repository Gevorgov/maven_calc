package org.maventest.calculator;

import com.beust.jcommander.JCommander;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Args argument = new Args();
        JCommander.newBuilder().addObject(argument).build().parse(args);
        System.out.println( Сalculation.calculate(argument.getArg1(), argument.getArg2(), argument.getOper()));
    }
}

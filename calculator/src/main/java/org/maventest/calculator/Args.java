package org.maventest.calculator;
import com.beust.jcommander.Parameter;
public class Args {
    @Parameter( names = {"--arg1", "a1"}, required = true)
    private double arg1;
    @Parameter( names = {"--arg2", "a2"}, required = true)
    private double arg2;
    @Parameter( names = {"--operation", "op"}, required = true)
    private String oper;

    public double getArg1() {
        return arg1;
    }

    public double getArg2() {
        return arg2;
    }

    public String getOper() {
        return oper;
    }
}

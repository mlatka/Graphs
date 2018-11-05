package sample;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

public class ODEPath implements StepHandler {
    @Override
    public void init(double t0, double[] doubles, double t) {

    }

    @Override
    public void handleStep(StepInterpolator stepInterpolator, boolean b) throws MaxCountExceededException {

        double t=stepInterpolator.getCurrentTime();
        double  [] x = stepInterpolator.getInterpolatedState();
        System.out.println("t= " + t + " " + x[0] + " " + x[1]);


    }
}

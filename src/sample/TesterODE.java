package sample;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

import java.util.Arrays;

public class TesterODE {


    public static void main(String[] args) {



        double [] yStart= new double[] {0,1};
        double [] yStop= new double[] {0,0} ;
        FirstOrderDifferentialEquations pendulum= new PendulumODE(1);
        FirstOrderIntegrator eulerPendulum= new EulerIntegrator(0.01);
        ODEPath pathPendulum= new ODEPath();
        eulerPendulum.addStepHandler(pathPendulum);
        eulerPendulum.integrate(pendulum,0,yStart,1,yStop);

        System.out.println(Arrays.toString(yStop));


    }
}

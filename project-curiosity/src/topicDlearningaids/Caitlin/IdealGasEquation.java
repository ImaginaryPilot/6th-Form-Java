package topicDlearningaids.Caitlin;

public class IdealGasEquation {

    /*
     * Data
    */

     public static final double R = 8.31446261815324; // ideal gas constant 

     public double V; // Volume

     public double T; // Temperature

     public double N; // Number of Moles

     public double P; // Pressure

    /*
    * Constructors
    */
    public IdealGasEquation(double v, double n, double p, double t){ // we pass parameter values to the constructor, to create an equation with the correct values
        if(V >= 0) {
            this.V = v;
        }
        if(T >= 0) {
            this.T = t;
        }
        if(N >= 0) {
            this.N = n;
        }
        if(P >= 0) {
            this.P = p;
        }
    }
    

    /*
    * Actions
    */
    public void Calcuate(){
        
        // todo: flowchart to determine how the formula will look
        // depending on the values given, the formula changes shape
    }

}

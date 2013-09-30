/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converterapp;
public class Energy{

    	//Variables
    
      public String[] Conversions = {
        "Foot Pounds to Newtons",
        "Newtons to Foot Pounds"
    };

      public String[] Units = {"Foot Pounds",
                                "Newtons",
                                "Newtons",
                                "Foot Pounds"
   };
      

	private double result;

	//constructor
	public Energy() {}

	//methods

	//foot pounds to newton meters
	public double FTLBtoNM(double input) {
				result = (input * 1.3558179483314004); //value from wiki
				//truncate. 16 decimal places maximum
				//result = new Converter().truncateDecimal(result, (16) );

		return (result);
		}
	public double NMtoFTLB(double input) {
				result = (input / 1.3558179483314004);
				//truncate. 16 decimal places maximum
				//result = new Converter().truncateDecimal(result, (16) );

		return (result);
		}

}
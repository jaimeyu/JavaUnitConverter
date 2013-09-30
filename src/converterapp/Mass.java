/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converterapp;


public class Mass{


    public String[] Conversions = {
        "Pounds to Grams",
        "Grams to Pounds",
        "Pounds to Ounces",
        "Ounces to Pounds"
    };

    public String[] Units = {   "Pounds (lbs)",
                                "Grams (g)",
                                "Grams (g)",
                                "Pounds (lbs)",
                                "Pounds (lbs)",
                                "Ounces (oz)",
                                "Ounces (oz)",
                                "Pounds (lbs)"
    };

	//Variables
	private double result;

	//constructor
	public Mass() {}

	//methods

	//pounds to grams
	public double LBStoG(double input) {
				result = (input * 0.45359237*1000); //http://en.wikipedia.org/wiki/Horsepower#Current_definitions
				//result = new Converter().truncateDecimal(result, 8 );

		return (result);
		}
	public double GtoLBS(double input) {
				result = (input / (1000*0.45359237) );
				//result = new Converter().truncateDecimal(result, 8 );

		return (result);
		}

	public double LBStoOZ(double input) {
		result = (input * 16);

		return (result);
		}

	public double OZtoLBS(double input) {
		result = (input / 16);

		return (result);
		}

}


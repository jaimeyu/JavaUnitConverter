/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converterapp;

public class Power{





    public String[] Conversions = {
        "Mechanical Horse Power to Watts",
        "Mechanical Watts to Horse Power"
    };

    public String[] Units = {   "Mechanical HP",
                                "Mechanical Watts",
                                "Mechanical Watts",
                                "Mechanical HP"
    };

	//Variables
	private double result;

	//constructor
	public Power() {}

	//methods

	//foot pounds to newton meters
	public double MechHPtoW(double input) {
				result = (input * 745.6999); //http://en.wikipedia.org/wiki/Horsepower#Current_definitions
				//result = new Converter().truncateDecimal(result, 4 );

		return (result);
		}
	public double MechWtoHP(double input) {
				result = (input / 745.6999);
				//result = new Converter().truncateDecimal(result, 4 );

		return (result);
		}

}
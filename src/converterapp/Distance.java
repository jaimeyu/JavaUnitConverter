/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converterapp;

public class Distance {

        public String[] Conversions = {
        "Meters to Feet",
        "Feet to Meters",
        "Feet to Inches",
        "Inches to Feet",
        "Feet to Yards",
        "Yards to Feet",
        "Feet to Miles",
        "Miles to Feet"};

        public String[] Units = {   "Meters (m)",
                                "Feet (ft)",
                                "Feet (ft)",
                                "Meters (m)",
                                "Feet (ft)",
                                "Inches (in)",
                                "Inches (in)",
                                "Feet (ft)",
                                "Feet (ft)",
                                "Yards (yd)",
                                "Yards (yd)",
                                "Feet (ft)",
                                "Feet (ft)",
                                "Miles (mi)",
                                "Miles (mi)",
                                "Feet (ft)"
    };

	//var
	private double result;

	//constructor
	public Distance(){}

	//methods

	public double MtoFT(double input) {
		result = input / 0.3048;
		//result = new Converter().truncateDecimal(result, 4 );
		return (result);
		}

	public double FTtoM(double input) {
		result = input * 0.3048;

		return (result);
		}

	public double FTtoYD(double input) {
		result = input * 3;

		return (result);
		}

	public double YDtoFT(double input) {
		result = input / 3;
		return (result);
		}

	public double FTtoMILES(double input) {
		result = input / 5280;
		return (result);
		}

	public double MILEStoFT(double input) {
		result = input * 5280;
		return (result);
		}
    public double FTtoMiles(double input) {
        result = input / 5280 ;
        return (result);
        }

	public double INCHEStoFT(double input) {
		result = input / 12;
		return (result);
		}

	public double FTtoINCHES(double input) {
		result = input * 12;
		return (result);
		}


}

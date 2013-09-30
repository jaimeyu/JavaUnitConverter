package converterapp;

/* Written by Jaime Yu */
public class Converter {

	//variables
	public Energy energy = new Energy(); //initialize energy class
	public Power power = new Power();
	public Mass mass = new Mass();
	public Distance distance = new Distance();
    public Frequency frequency = new Frequency();
    //initialize new class here

    //i can't for the love of god know why enums don't work!
    //going back to good old fashion arrays
    
    public String[] UnitTypes = {"Energy", "Power", "Mass", "Distance", "Frequency"};
    //add new conversion catogory to above
    //it will automatically be generated into the gui.
    //but it doesn't import the conversions, you have to edit all the GUI's
    //comboboxes and buttons to support the new functions.
    //it should be easy to read.

	//constructor
	public Converter() {}

	//methods
	public double truncateDecimal(double origVal, double amount) {
		double result;
		amount = java.lang.Math.pow ( 10, amount);

		result = origVal * amount;
		result = (long)result; //truncates after the decimal
		result = result / amount;
		return (result);
		}

	public double mult10to(double origVal, double amount) {
		double result;
		amount = java.lang.Math.pow ( 10, amount);
		result = origVal * amount;
		return (result);
		}
	public double div10to(double origVal, double amount) {
		double result;
		amount = java.lang.Math.pow ( 10, amount);
		result = origVal / amount;
		return (result);
		}
    
}
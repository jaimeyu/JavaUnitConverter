/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converterapp;

public class Frequency {

    public String[] Conversions = { "Hertz to Seconds",
                                    "Seconds to Hertz",
                                    "PERtoHZ",
                                    "HZtoPER",
                                    "HZtoW",
                                    "WtoHZ"
    };

    public String[] Units = {   "Hertz (Hz)",
                                "Seconds ()",
                                "Seconds ()",
                                "Hertz (Hz)",
                                "Hertz (Hz)",
                                "Period ()",
                                "Period ()",
                                "Hertz (Hz)",
                                "Hertz (Hz)",
                                "Angular Frequency (w)",
                                "Angular Frequency (w)",
                                "Hertz (Hz)"
    };

    private double result;

    //contructor
    public Frequency() {}

    public double HZtoSEC(double input) {
        result = 1 / input;
        return (result);
    }
    public double SECtoHZ(double input) {
        result = 1 /input;
        return (result);
    }

    public double PERtoHZ(double input) {
        result = 1/ input;
        return (result);
    }

    public double HZtoPER( double input) {
        result = 1 / input;
        return (result);
    }

    public double HZtoW( double input) {
        result = 2 * java.lang.Math.PI * input;
        return (result);
    }

    public double WtoHZ(double input) {
        result = input / (2 * java.lang.Math.PI);
        return (result);
    }
}
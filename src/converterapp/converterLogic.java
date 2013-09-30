/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converterapp;

/**
 *
 * @author jaime
 */
public class converterLogic {

     public Converter convert = new Converter();



    public converterLogic(){}

    public double logic( double curVal, int catagory, int conversion) {
        double result;

        if ( 3 == catagory )
            switch ( conversion ) {
                case 0:
                    result = convert.distance.MtoFT(curVal);
                    break;
                case 1:
                    result = convert.distance.FTtoM(curVal);
                    break;
                case 2:
                    result = convert.distance.FTtoINCHES(curVal);
                    break;
                case 3:
                    result = convert.distance.INCHEStoFT(curVal);
                    break;
                case 4:
                    result = convert.distance.FTtoYD(curVal);
                    break;
                case 5:
                    result = convert.distance.YDtoFT(curVal);
                    break;
                case 6:
                    result = convert.distance.FTtoMILES(curVal);
                    break;
                case 7:
                    result = convert.distance.MILEStoFT(curVal); //broken
                    break;
                default:
                    result = 0.0;
                    break;
            }
        else if ( 0 == catagory )
            switch ( conversion ) {
                case 0:
                    result = convert.energy.FTLBtoNM(curVal);
                    break;
                case 1:
                    result = convert.energy.NMtoFTLB( curVal);
                    break;
                default:
                    result = 0.0;
                    break;
            }
        else if ( 2 == catagory )
            switch ( conversion ) {
                case 0:
                    result = convert.mass.LBStoG( curVal);
                    break;
                case 1:
                    result = convert.mass.GtoLBS( curVal);
                    break;
                case 2:
                    result = convert.mass.LBStoOZ( curVal);
                    break;
                case 3:
                    result = convert.mass.OZtoLBS( curVal);
                    break;
                default:
                    result = 0.0;
                    break;
            }
        else if ( 1 == catagory )
            switch ( conversion ) {
                case 0:
                    result = convert.power.MechHPtoW( curVal);
                    break;
                case 1:
                    result = convert.power.MechWtoHP( curVal);
                    break;
                default:
                    result = 0.0;
                    break;
            }
        else if (4 == catagory )
            switch ( conversion ) {
                case 0:
                    result = convert.frequency.HZtoSEC( curVal);
                    break;
                case 1:
                    result = convert.frequency.SECtoHZ( curVal);
                    break;
                case 2:
                    result = convert.frequency.PERtoHZ( curVal);
                    break;
                case 3:
                    result = convert.frequency.HZtoPER( curVal);
                    break;
                case 4:
                    result = convert.frequency.HZtoW( curVal);
                    break;
                case 5:
                    result = convert.frequency.WtoHZ( curVal);
                    break;
                default:
                    result = 0.0;
                    break;
            }
        else
            result = 0.0;



        return (result);
    }

}

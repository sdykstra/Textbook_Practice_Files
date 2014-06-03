
/**
 *
 * @author Scott Dykstra
 */
public class BinaryConvertor {

    public int convertor(int binaryNum) {
        int decimalNum = 0;
        int remainder = 0;
        int counter = 1;
        int holder;
        int power = 0;
        while (binaryNum != 0) {

            remainder = binaryNum % 10;
            holder = remainder;
            power = counter;
            decimalNum += (holder * power);
            binaryNum = binaryNum / 10;
            counter *= 2;
        }
        return decimalNum;
    }// end convertor
}

package DeitelChapter4;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ft
 */
public class GasMileageTest {

    public static void main(String[] args) {
        GasMileage car = new GasMileage();

        car.requestMilesDriven();
        car.requestGallonsUsed();

        car.requestMilesDriven();
        car.requestGallonsUsed();

        car.currentMPG();
        car.totalMPG();


        car.requestMilesDriven();
        car.requestGallonsUsed();

        car.requestMilesDriven();
        car.requestGallonsUsed();

        car.currentMPG();
        car.totalMPG();

    }// end main
}// end GasMileageTest

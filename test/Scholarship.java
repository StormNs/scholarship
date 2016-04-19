

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Son
 */
class Scholarship {

    static int getAward(double gpa) {
        if (gpa >= 4 || gpa <0) {
            return -1;
        } else if (gpa >= 3.8) {
            return 100;
        } else if (gpa >= 3.6) {
            return 80;
        } else if (gpa >= 3.4) {
            return 70;
        } else {
            return 0;
        }

    }

}

//changed name from powerTest to PowerFinderTest

package powerpackage;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerFinderTest {
    @Test
    public void givenOneAsNumberAndOneAsPower_whenCalculatePower_thenReturnValueAsOne() {
        PowerFinder powerFinder = getPowerFinderObj();
        int actualValue = powerFinder.calculatePower(1, 1);
        int expectedValue = 1 ;
        assertEquals(expectedValue , actualValue);
    }


    @Test
    public void givenOneAsTwoAndOneAsPower_whenCalculatePower_thenReturnValueAsTwo() {
        PowerFinder powerFinder = getPowerFinderObj();
        int actualValue = powerFinder.calculatePower(2, 1);
        int expectedValue =  2;
        assertEquals(expectedValue , actualValue);
    }

    @Test
    public void givenTwoAsNumberAndTwoAsPower_whenCalculatePower_thenReturnValueAsFour() {
        PowerFinder powerFinder = getPowerFinderObj();
        int actualValue = powerFinder.calculatePower(2, 2);
        int expectedValue = 4 ;
        assertEquals(expectedValue , actualValue);
    }

    @Test
    public void givenThreeAsNumberAndTwoAsPower_whenCalculatePower_thenReturnValueAsNine() {
        PowerFinder powerFinder = getPowerFinderObj();
        int actualValue = powerFinder.calculatePower(3, 2);
        int expectedValue = 9 ;
        assertEquals(expectedValue , actualValue);
    }



    private static PowerFinder getPowerFinderObj() {
        return new PowerFinder();
    }
}

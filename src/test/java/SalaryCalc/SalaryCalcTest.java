package SalaryCalc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalcTest {

    private SalaryCalc testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new SalaryCalc();
    }

    @AfterEach
    void tearDown() {
        testingClass = null;
    }

    @Test
    void calcSalary1() throws Exception {
        testingClass.arrTf[1].setText("228");
        testingClass.arrTf[2].setText("5");
        testingClass.arrTf[3].setText("13");
        testingClass.arrTf[4].setText("37");
        testingClass.calcSalary();
        assertEquals("10270.26", testingClass.arrTf[9].getText());
    }
	@Test
    void calcSalary2() throws Exception {
        testingClass.arrTf[1].setText("133");
        testingClass.arrTf[2].setText("7");
        testingClass.arrTf[3].setText("14");
        testingClass.arrTf[4].setText("88");
        testingClass.calcSalary();
        assertEquals("1720.49", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary9() throws Exception {
        testingClass.arrTf[1].setText("230");
        testingClass.arrTf[2].setText("6");
        testingClass.arrTf[3].setText("21");
        testingClass.arrTf[4].setText("15");
        testingClass.calcSalary();
        assertEquals("27096.30", testingClass.arrTf[9].getText());
} 
@Test
    void calcSalary10() throws Exception {
        testingClass.arrTf[1].setText("328");
        testingClass.arrTf[2].setText("8");
        testingClass.arrTf[3].setText("30");
        testingClass.arrTf[4].setText("10");
        testingClass.calcSalary();
        assertEquals("77932.80", testingClass.arrTf[9].getText());
} 
}
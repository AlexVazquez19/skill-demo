import static org.junit.Assert.*;
import org.junit.*;

public class CarTester {
    private Car newCar;

    @Before
    public void setUp() {
        newCar = new Car("BMW",200);
    }

    @Test
    public void testAddHorsepower() {
        newCar.addHorsepower(100);
        assertEquals("Horsepower should be 300",300,newCar.horsepower);
    }
}

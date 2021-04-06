import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    String make = "Honda"; 
    String model = "Civic"; 
    Car testCar = new Car(make, model); 
    

    @Test
    public void testMake(){
        System.out.println("Running Test 1!");
        Assertions.assertEquals(make, testCar.getMake(),"Expected vehicle make did not match actual vehicle make"); 
    }

    @Test
    public void testMake2(){
        System.out.println("Running Test 2!");
        Assertions.assertEquals(make, testCar.getMake(),"Expected vehicle make did not match actual vehicle make"); 
    }

    @Test
    public void testMake3(){
        System.out.println("Running Test 3!");
        Assertions.assertEquals(make, "Hondaa","Expected vehicle make did not match actual vehicle make"); 
    }

    @Test 
    public void testModel(){
        System.out.println("Running Test 4!");
        Assertions.assertEquals(model,testCar.getModel(),"Expected vehicle model did not match actual vehicle model"); 
    }
    
}


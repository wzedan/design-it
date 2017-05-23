package learning.io.designit.creational;

import learning.io.designit.AbstractTestClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by wz on 5/23/17.
 */
public class BuilderTest extends AbstractTestClass {

    @Test
    public void testBuilder(){
        Builder.SuvCar suvCar = new Builder().new SuvCar("toyota" , "2017");
        suvCar.addWheelDrive("4WD");
    }
}
package learning.io.designit.creational.factory;

import learning.io.designit.AbstractTestClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by wz on 5/23/17.
 */
public class SimpleFactoryTest extends AbstractTestClass {

    @Autowired
    SimpleFactory carFactory;


    @Test
    public void getCar() throws Exception {
        assertNotNull(carFactory.getCar("punto", "2012"));
    }

}
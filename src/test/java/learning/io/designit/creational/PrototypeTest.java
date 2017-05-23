package learning.io.designit.creational;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wz on 5/23/17.
 */
public class PrototypeTest {

    @Test
    public void testPrototype(){
        Prototype prototype = new Prototype();
        Prototype.SuvCar suvCar = prototype.new SuvCar("land cruiser");
        suvCar.setBuild("toyota");

        Prototype.SuvCar newSuv = null;
        try {
            newSuv = (Prototype.SuvCar) suvCar.clone();
            newSuv.setModel("prado");
        } catch (CloneNotSupportedException e){
            fail();
        }

        assertFalse(suvCar.getModel().equals(newSuv.getModel()));
        assertTrue(suvCar.getBuild().equals(newSuv.getBuild()));
    }

    @Test
    public void testPrototypeRegistry() throws Exception {
        Prototype prototype = new Prototype();
        Prototype.SuvCar suvCar = prototype.new SuvCar("land cruiser");
        suvCar.setBuild("toyota");

        Prototype.Registry registry = prototype.new Registry();
        registry.addItem(suvCar);

        Prototype.CarPrototype newSuvCar = registry.getItem(Prototype.SuvCar.class);

        assertTrue(suvCar.getModel().equals(newSuvCar.getModel()));


    }
}
package learning.io.designit.structural;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wz on 5/23/17.
 */
public class BridgeTest {

    @Test
    public void testBridge(){
        Bridge bridge = new Bridge();

        Bridge.BodyShop bodyShop = bridge.new BodyShop("Body shop");
        Bridge.Car car = bridge.new Car(bodyShop);

        car.move();
        car.workshop.work();

    }
}
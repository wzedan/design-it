package learning.io.designit.creational.factory;

import learning.io.designit.AbstractTestClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by wz on 5/23/17.
 */
public class AbstractFactoryTest extends AbstractTestClass{

    @Autowired
    AbstractFactory abstractFactory;

    @Test
    public void testBuildDoor(){

        AbstractFactory.WoodenDoorFactory woodenDoorFactory = abstractFactory.new WoodenDoorFactory();

        System.out.println(woodenDoorFactory.makeDoor().getDescription());

        AbstractFactory.IronDoorFactory ironDoorFactory = abstractFactory.new IronDoorFactory();

        System.out.println(ironDoorFactory.makeDoor().getDescription());
    }
}
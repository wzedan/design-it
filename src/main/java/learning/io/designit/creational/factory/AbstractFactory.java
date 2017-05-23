package learning.io.designit.creational.factory;

import org.springframework.stereotype.Component;

/**
 * Created by wz on 5/23/17.
 *
 * A factory of factories; a factory that groups the individual but related/dependent factories together without specifying their concrete classes.
 *
 */
@Component
public class AbstractFactory {
    interface Door {
        String getDescription();
    }

    class WoodenDoor implements Door {
        @Override
        public String getDescription() {
            return "Wooden door";
        }
    }

    class IronDoor implements Door {
        @Override
        public String getDescription() {
            return "Iron door";
        }
    }

    interface DoorFittingExpert {
        String getDescription();
    }

    class WoodenDoorExpert implements DoorFittingExpert{
        @Override
        public String getDescription() {
            return "Wooden door expert";
        }
    }

    class IronDoorExpert implements DoorFittingExpert {
        @Override
        public String getDescription() {
            return "Iron door expert";
        }
    }

    interface DoorFactory {
        Door makeDoor();
        DoorFittingExpert makeDoorFittingExpert();
    }

    class WoodenDoorFactory implements DoorFactory{

        @Override
        public Door makeDoor() {
            return new WoodenDoor();
        }

        @Override
        public DoorFittingExpert makeDoorFittingExpert() {
            return new WoodenDoorExpert();
        }
    }

    class IronDoorFactory implements DoorFactory{

        @Override
        public Door makeDoor() {
            return new IronDoor();
        }

        @Override
        public DoorFittingExpert makeDoorFittingExpert() {
            return new IronDoorExpert();
        }
    }
}

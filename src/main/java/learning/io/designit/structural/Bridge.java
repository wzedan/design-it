package learning.io.designit.structural;

/**
 * Created by wz on 5/23/17.
 */
public class Bridge {

    abstract class Vehicle {
        WorkShop workshop;

        abstract void move();
    }

    class Car extends Vehicle{


        public Car(WorkShop workshop) {
            this.workshop = workshop;
        }

        @Override
        public void move() {
            System.out.println("Car moving");
        }
    }

    class Bike extends Vehicle{

        WorkShop workshop;

        public Bike(WorkShop workshop) {
            this.workshop = workshop;
        }

        @Override
        public void move() {
            System.out.println("Bike moving");
        }
    }

    interface WorkShop {
        void work();
    }

    abstract class AbstractWorkShop implements WorkShop{
        private String shopType;

        public AbstractWorkShop(String shopType) {
            this.shopType = shopType;
        }
    }
    class BodyShop extends AbstractWorkShop{
        public BodyShop(String shopType) {
            super(shopType);
        }

        @Override
        public void work() {
            System.out.println("Body shop working");
        }
    }

    class EngineShop extends AbstractWorkShop{
        public EngineShop(String shopType) {
            super(shopType);
        }

        @Override
        public void work() {
            System.out.println("Engine shop working");
        }
    }
}

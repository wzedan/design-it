package learning.io.designit.creational.factory;

import org.springframework.stereotype.Component;

/**
 * Created by wz on 5/23/17.
 *
 * Simple factory simply generates an instance for client without exposing any instantiation logic to the client
 *
 */
@Component
public class SimpleFactory {
    public class Car {
        private String build;
        private String model;

        public String getBuild() {
            return build;
        }

        public void setBuild(String build) {
            this.build = build;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    }


    public Car getCar(String model , String build){
        Car car = new Car();
        car.setBuild(build);
        car.setModel(model);

        return car;
    }

}

package learning.io.designit.creational;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by wz on 5/23/17.
 *
 * Allows you to create different flavors of an object while avoiding constructor pollution.
 * <img alt='builder' src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Builder_UML_class_diagram.svg/500px-Builder_UML_class_diagram.svg.png"/>
 */
public class Builder {

    class BaseCar {
        private String model;
        private String build;

        public BaseCar(String model, String build) {
            this.model = model;
            this.build = build;
        }

        public String getModel() {
            return model;
        }

        public String getBuild() {
            return build;
        }
    }

    class SuvCar extends BaseCar{

        private String wheelDrive;

        public String getWheelDrive() {
            return wheelDrive;
        }


        public SuvCar(String model, String build) {
            super(model, build);
        }

        public void addWheelDrive(String wheeldrive){
            this.wheelDrive = wheeldrive;
        }
    }

    class SedanCar extends BaseCar{
        private String zeonLight;

        public String getZeonLight() {
            return zeonLight;
        }

        public SedanCar(String model, String build) {
            super(model, build);
        }

        public void addZeonLight(String zeonLight){
            this.zeonLight = zeonLight;
        }
    }


}

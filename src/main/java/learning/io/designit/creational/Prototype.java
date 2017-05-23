package learning.io.designit.creational;

import learning.io.designit.creational.factory.SimpleFactory;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by wz on 5/23/17.
 */
public class Prototype {

    abstract class CarPrototype implements Cloneable{
        private String model;
        private String build;

        public CarPrototype(String model) {
            this.model = model;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }

        public String getBuild() {
            return build;
        }

        public void setBuild(String build) {
            this.build = build;
        }
    }

    class SuvCar extends CarPrototype{

        public SuvCar(String model) {
            super(model);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    class SedanCar extends CarPrototype{
        public SedanCar(String model) {
            super(model);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    /*
    * This registry maintains at most one copy of each class type and returns a clone of it to be used/modified by the caller
    *
    * */
    public class Registry {
        private Map<Class , CarPrototype> registry;

        public CarPrototype getItem(Class clazz) throws ClassNotFoundException, CloneNotSupportedException {
            if(null == registry){
                registry = new HashMap<>();
            }
            if(null == registry.get(clazz)){
               registry.put(clazz , CarPrototype.class.cast(Class.forName(clazz.getName())));
            }

            return (CarPrototype) registry.get(clazz).clone();
        }

        public void addItem(CarPrototype carPrototype){
            if(null == registry){
                registry = new HashMap<>();
            }
            registry.put(carPrototype.getClass(), carPrototype);
        }
    }
}

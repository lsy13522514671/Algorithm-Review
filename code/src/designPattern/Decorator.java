package designPattern;

abstract class TypeClass {
    public void getDescription() {
        System.out.println("the abstract type class!");
    }
}

class componentClass extends TypeClass {

    @Override
    public void getDescription() {
        System.out.println("the component class!");
    }
}

class AbstractDecoratorClass extends TypeClass {
    TypeClass component; // the component to be wrapped around

    public AbstractDecoratorClass () {}

    public AbstractDecoratorClass (TypeClass component) {
        this.component = component;
    }
}

class ConcreteDecoratorClass extends AbstractDecoratorClass {
    
    @Override
    public void getDescription() {
        System.out.println("the extra behavior added by decorator");
        
        // the original behaviour
        this.component.getDescription();
    }
}

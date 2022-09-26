package designPattern.factoryPattern;

interface OperationController {
    public void control();
}

interface UIController {
    public void display();
}

class AndroidOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("android control!");
    }
}

class AndroidUIController implements UIController{

    @Override
    public void display() {
        System.out.println("android display!");
    }
}

class IOSOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("ios control!");
    }
}

class IOSUIController implements UIController{

    @Override
    public void display() {
        System.out.println("ios display!");
    }
}

class WPOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("wp control!");
    }
}

class WPUIController implements UIController{

    @Override
    public void display() {
        System.out.println("wp display!");
    }
}

public interface AbstractFactory {
    public OperationController getOperationController();
    public UIController getUIController();
}

class AndroidFactory implements AbstractFactory{

    @Override
    public OperationController getOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public UIController getUIController() {
        return new AndroidUIController();
    } 
}

class IOSFactory implements AbstractFactory{

    @Override
    public OperationController getOperationController() {
        return new IOSOperationController();
    }

    @Override
    public UIController getUIController() {
        return new IOSUIController();
    } 
}

class WPFactory implements AbstractFactory{

    @Override
    public OperationController getOperationController() {
        return new WPOperationController();
    }

    @Override
    public UIController getUIController() {
        return new WPUIController();
    } 
}

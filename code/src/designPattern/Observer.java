package designPattern;

import java.util.Enumeration;
import java.util.Vector;

interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyObserver();
}

interface Observer {
    public void update();   
}

class ConcreteSubject implements Subject{
    Vector<Observer> observer = new Vector<>();

    @Override
    public void attach(Observer o) {
        observer.add(o);
    }

    @Override
    public void detach(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observer) {
            o.update();
        }
    }

    public Enumeration<Observer> getObservers() {
        return observer.elements();
    }

    public void change() {
        notifyObserver();
    }
}

class ConcreteObserver implements Observer{

    @Override
    public void update() {
        System.out.println("update current observer!");
    }

}

package designPattern;

abstract class Handler {
    private Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return this.successor;
    }
}

class ConcreteHanlder extends Handler {

    @Override
    public void handleRequest() {
        Handler s = getSuccessor();
        if(s != null) {
            s.handleRequest();
        } else {
            System.out.println("handle request!");
        }
    }
    
}


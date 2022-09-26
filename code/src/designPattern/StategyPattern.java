package designPattern;

interface DiscountCode {
    public void useDiscount();
}

class DirectDiscountCode implements DiscountCode{

    @Override
    public void useDiscount() {
        System.out.println("direct discount applied on the current price!");
    }
}

class upToDiscountCode implements DiscountCode {

    @Override
    public void useDiscount() {
        System.out.println("discount applied on the current price if the price is up to a value!");
    }
}

class percentageDiscountCode implements DiscountCode {

    @Override
    public void useDiscount() {
        System.out.println("percentage discount applied on the current price!");
    }
}

class Context {
    private DiscountCode discount = null;

    public void useDiscount(DiscountCode d) {
        this.discount.useDiscount();
    }
}

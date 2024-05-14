public class B implements A {
    @Override
    public void method() {

    }

    @Override
    public void defaultMethod() {
        A.super.defaultMethod();
    }

    @Override
    public void abstractMethod() {

    }
}

public interface A {

        static void staticMethod() { }

        void method();

        default void defaultMethod() { }

        abstract void abstractMethod();
}

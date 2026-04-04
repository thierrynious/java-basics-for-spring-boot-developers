public class TypeFactory {

    //Typ-Token: T kann trotz Typlöschung instanziert werden
    public static<T> T createInstance(Class<T> clazz) throws Exception {
        return clazz.getDeclaredConstructor().newInstance();
    }

}

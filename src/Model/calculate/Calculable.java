package Model.calculate;

public interface Calculable<T> {

    T sum(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);

    T divide(T a, T b);
}

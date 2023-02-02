package intrerface.defaultmethod.problem;

/*
Если мы не переопределим метода по умолчанию возникнит ошибка ромба
(множественного наследования)
Ошибка возникает только при расширении, если бы появился класс-родитель
будет отдано предпочтение классу-родителю
 */
public class C implements B, A {
    private final String text;

    public C(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "C{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public String getMessage() {
        return B.super.getMessage();
    }
}

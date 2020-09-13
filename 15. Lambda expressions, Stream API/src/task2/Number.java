// Создать список и заполнить рандомными числами 10 ячеек, нужно вывести сумму квадратов всех элементов списка.
// Мы используем метод map() для возведения в квадрат каждого элемента, а потом применяем метод reduce()
// для свертки всех элементов в одно число.

package task2;

public class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "num = " + num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

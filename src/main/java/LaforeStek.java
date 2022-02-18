import java.util.Arrays;

public class LaforeStek {
    public static void main(String[] args) {
        StackX theStack = new StackX(10); // Создание нового стека
        theStack.refreshStek();
        theStack.push(20); // Занесение элементов в стек
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);






        while (!theStack.isEmpty()) // Пока стек не станет пустым
        { // Удалить элемент из стека
            long value = theStack.pop();
            System.out.print(value); // Вывод содержимого
            System.out.print(" ");
        }
        System.out.println("");
    }
    // Конец класса StackApp
///////////////////////////////////////////////////////////////


    // stack.java
// Работа со стеком
// Запуск программы: C>java StackApp
////////////////////////////////////////////////////////////////
    static class StackX {
        private int maxSize; // Размер массива
        private long[] stackArray;
        private int top; // Вершина стека

        //--------------------------------------------------------------
        public StackX(int s) // Конструктор
        {
            maxSize = s; // Определение размера стека
            stackArray = new long[maxSize]; // Создание массива
            top = -1; // Пока нет ни одного элемента
        }

        //--------------------------------------------------------------
        public void push(long j) // Размещение элемента на вершине стека
        {
            stackArray[top++] = j; // Увеличение top, вставка элемента
        }

        //--------------------------------------------------------------
        public long pop() // Извлечение элемента с вершины стека
        {
            return stackArray[top--]; // Извлечение элемента, уменьшение top
        }

        //--------------------------------------------------------------
        public long peek() // Чтение элемента с вершины стека
        {
            return stackArray[top];
        }

        //--------------------------------------------------------------
        public boolean isEmpty() // True, если стек пуст
        {
            return (top == -1);
        }

        //--------------------------------------------------------------
        public boolean isFull() // True, если стек полон
        {
            return (top == maxSize - 1);
        }
        public void refreshStek (){
            Arrays.fill(stackArray, 0);
            top = -1;
        }
//--------------------------------------------------------------
    } // Конец класса StackX
////////////////////////////////////////////////////////////////
}

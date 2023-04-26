import java.util.Deque;
import java.util.ArrayDeque;

/*
 * ArrayDequeの習得
 */
class ArrayDequeTest {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();

        //末尾に追加
        deq.offerLast(10);
        deq.offerLast(20);

        System.out.println(deq);
        System.out.println();

        //先頭に追加
        deq.offerLast(150);
        deq.offerLast(3);
        System.out.println("---------150, 3の順番で先頭に追加---------");
        System.out.println(deq);
        System.out.println();

        //先頭を取得、末尾を取得（影響なし）
        System.out.println("---------先頭を取得---------");
        System.out.println(deq.peekFirst());
        System.out.println();

        System.out.println("---------末尾を取得---------");
        System.out.println(deq.peekLast());
        System.out.println();

        //先頭を削除
        deq.pollFirst();
        System.out.println("---------先頭を削除---------");
        System.out.println(deq);
        System.out.println();

        //末尾を削除
        deq.pollLast();
        System.out.println("---------末尾を削除---------");
        System.out.println(deq);
        System.out.println();

    }
}
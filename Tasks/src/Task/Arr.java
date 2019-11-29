package Task;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Arr
{
    private int[] array;
//    private IntStream stream;

    Arr(int[] arr) {
        array = arr.clone();
//        stream = Arrays.stream(arr);
    }
    public int[] getArray() {
        return array;
    }
//    public void printStream() {
//        System.out.println(stream);
//    }
//    public void printStream(IntStream str) {
//        System.out.println(str);
//    }
//    public int getAvg() {
//        int sum = stream.reduce(0, Integer::sum);
//        return sum/stream.length;
//    }
    public double avg() {
        IntStream stream = Arrays.stream(array);
        try {
            return stream.average().getAsDouble();
        } catch (NoSuchElementException er) {
            return 0;
        }
    }
    public long count() {
        IntStream stream = Arrays.stream(array);
        return stream.filter(val -> val > 0).count();
    }
    public IntStream mul(int num) {
        IntStream stream = Arrays.stream(array);
        return stream.map(el -> el * num);
    }
    public IntStream indices(int toMatch) {
        IntStream stream1 = Arrays.stream(array);
        int[] toArr = stream1.toArray();
        IntStream stream = Arrays.stream(array);
        IntStream res = IntStream.range(0, (int) stream.count()).filter(pos -> toArr[pos] == toMatch);
        return res;
    }
    public IntStream nonDistinct() {
        IntStream stream = Arrays.stream(array);
        IntStream distinct = stream.distinct();
        return distinct;
    }
}

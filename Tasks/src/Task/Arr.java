package Task;

import java.util.*;
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
    public int[] mul(int num) {
        IntStream stream = Arrays.stream(array);
        return stream.map(el -> el * num).toArray();
    }
    public int[] indices(int toMatch) {
        IntStream stream1 = Arrays.stream(array);
        int[] toArr = stream1.toArray();
        IntStream stream = Arrays.stream(array);
        IntStream res = IntStream.range(0, (int) stream.count()).filter(pos -> toArr[pos] == toMatch);
        return res.toArray();
    }
    public Object[] t2() {
        int[] arr2 = Arrays.stream(array).sorted().toArray();
        Vector<Integer> dupl = new Vector<Integer>(3, 3);
        IntStream.range(1, (int) arr2.length).forEach(pos -> {
            if(arr2[pos] == arr2[pos-1]) {
                dupl.addElement(arr2[pos]);
            }
        });
        return dupl.toArray();
    }
//    public int[] nonDup() {
//        IntStream stream1 = Arrays.stream(array).sorted();
//    }
//    public int[] t() {
//        IntStream stream1 = Arrays.stream(array).sorted();
//        int[] res = stream1.reduce(new Pair(0, new LinkedList<Integer>()), el -> {
//
//        })
//        return res;
//    }
//    public int[] nonDistinct() {
//        IntStream stream1 = Arrays.stream(array);
//        IntStream stream2 = Arrays.stream(array);
//        IntStream stream3 = Arrays.stream(array);
//        IntStream distinct = stream1.distinct();
//        int[] res = IntStream.range(0, (int) stream2.count()).filter(pos -> {
//
//        }) stream3.filter(el -> el == ).toArray();
////        int[] res = stream2.reduce(new ArrayList(), (arr, el) -> {
////            IntStream newStr = Arrays.stream(array);
//////            if()
////            return arr.add();
////        });
////        res = stream2.filter(el -> el.anyMatch)
//        return res;
//    }
}

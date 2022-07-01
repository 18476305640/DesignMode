package com.zhuangjie.dp._行为型._4_迭代器模式;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T>{
    private final T[] array;
    public MyArrayList(T[] array) {
        this.array = array;
    }
    public static <T>  MyArrayList<T> of(T[] array) {
        return new MyArrayList<>(array);
    }


    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }
    public class ArrayIterator implements Iterator<T> {
        private int pos = -1;
        @Override
        public boolean hasNext() {
            return pos + 1 <= array.length - 1;
        }

        @Override
        public T next() {
            return array[++pos];
        }
    }
}

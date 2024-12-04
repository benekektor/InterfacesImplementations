package com.chmnu_ki_123.k3;

public interface MyList<T> {
    void add(T element);

    void remove(T element);

    T get(int index);

    int size();
}

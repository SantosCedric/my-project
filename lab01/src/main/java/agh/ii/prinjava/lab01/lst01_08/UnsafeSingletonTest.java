package agh.ii.prinjava.lab01.lst01_08;


class UnsafeSingletonTest {

    void shouldReturnSameInstanceOnConsecutiveCalls() {
        UnsafeSingleton first = UnsafeSingleton.getInstance();
        UnsafeSingleton second = UnsafeSingleton.getInstance();
    }
}
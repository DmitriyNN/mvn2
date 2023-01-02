package ru.netology.sqr;

public class SQRService {
    public int calSqr(int min, int max) {
        int counter = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if ((i * i) >= min)
                if ((i * i) <= max)
                    counter++;
        }
        return counter;
    }
}


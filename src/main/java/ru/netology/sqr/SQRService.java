package ru.netology.sqr;

public class SQRService {  //сервисный класс

    public int calcQtyOfSquares(int lowRange, int upperRange) {

        int qtyOfSquares = 0; // количество квадратов


        for (int i = 10; i <= 99; i++) {  // счетчик для 10...99

            int square = i * i; // квадрат

            if (square >= lowRange && square <= upperRange) {
                qtyOfSquares++;
            } else if (square >= upperRange) {
//                System.out.println(qtyOfSquares);
//                break;
                return qtyOfSquares;
            }

        }
        return -1;
    }

}

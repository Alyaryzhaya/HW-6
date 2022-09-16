package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/squares.csv")
    public void calcPositiveSquare(int expected, int lowRange, int upperRange) {
        SQRService object = new SQRService();

        //int expected = 3;
        int actual = object.calcQtyOfSquares(lowRange, upperRange);

        Assertions.assertEquals(expected, actual);

//==========================

//    @Test
//    public void calcPositiveSquare() {
//
//            SQRService object = new SQRService();
//
//            object.calcQtyOfSquares(200, 300);
//            {
//
//                int expected = 3;
//                int actual = object.calcQtyOfSquares(200, 300);
//                Assertions.assertEquals(expected, actual);
    }

}




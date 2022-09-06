package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public void shouldCashbackIfAmountLessBoundary() {

        int expected = 400;
        int actual = service.remain(600);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCashbackIfAmountMoreBoundary() {

        int expected = 200;
        int actual = service.remain(2800);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCashbackIfAmountEqualsBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
    @Test

    public void shouldCashbackIfAmountLessBoundary2() {

        int expected = 400;
        int actual = service.remain(600);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCashbackIfAmountMoreBoundary2() {

        int expected = 200;
        int actual = service.remain(2800);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCashbackIfAmountEqualsBoundary2() {

        int expected = 0;
        int actual = service.remain(1000);

        Assertions.assertEquals(expected, actual);
    }
}
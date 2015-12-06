package com.tw;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LengthTest {
    @Test
    public void test1MIs1M() throws Exception {
        Length oneM1 = new Length(1, Unit.M);
        Length oneM2 = new Length(1, Unit.M);
        assertThat(oneM1, is(oneM2));
    }

    @Test
    public void test1MIs100CM() throws Exception {
        Length oneM = new Length(1, Unit.M);
        Length oneHundredCM = new Length(100, Unit.CM);
        assertThat(oneM, is(oneHundredCM));
    }

    @Test
    public void test1MIs1000MM() throws Exception {
        Length oneM = new Length(1, Unit.M);
        Length oneThousandMM = new Length(1000, Unit.MM);
        assertThat(oneM, is(oneThousandMM));
    }
}

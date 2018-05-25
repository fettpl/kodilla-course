package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(9);
        numbers.add(18);

        ArrayList<Integer> properList = new ArrayList<>();
        properList.add(8);
        properList.add(18);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(numbers);

        //then
        Assert.assertEquals(properList, resultList);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // given
        ArrayList<Integer> properList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(new ArrayList<Integer>());

        //then
        Assert.assertEquals(properList, resultList);
    }
}

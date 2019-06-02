package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void testConstructorWithAll() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        String expectedHairColor = "black";
        String expectedSsn = "111-22-3333";
        String expectedAddress = "123 Fabricated Cir., PA";
        String expectedOccupation = "Farmhand";
        String expectedPhoneNumber = "333-444-5555";

        // When
        Person person = new Person(expectedName, expectedAge, expectedHairColor, expectedSsn, expectedAddress, expectedOccupation, expectedPhoneNumber);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        String actualHairColor = person.getHairColor();
        String actualSsn = person.getSsn();
        String actualAddress = person.getAddress();
        String actualOccupation = person.getOccupation();
        String actualPhoneNumber = person.getPhoneNumber();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);

        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedSsn, actualSsn);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedOccupation, actualOccupation);
        Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);
    }






    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setHairColor() {
        // Given
        Person person = new Person();
        String expected = "blonde";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSsn() {
        // Given
        Person person = new Person();
        String expected = "111-22-3333";

        // When
        person.setSsn(expected);

        // Then
        String actual = person.getSsn();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAddress() {
        // Given
        Person person = new Person();
        String expected = "123 madeUp Dr., Delaware";

        // When
        person.setAddress(expected);

        // Then
        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOccupation() {
        // Given
        Person person = new Person();
        String expected = "Software Developer";

        // When
        person.setOccupation(expected);

        // Then
        String actual = person.getOccupation();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "302-111-2222";

        // When
        person.setPhoneNumber(expected);

        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }
}

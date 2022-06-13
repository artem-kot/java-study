package com.kots.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {
    @Mock
    Car carMock;
    @Mock
    CarEngine engineStub;
    @Mock
    CarWheels wheelsStub;

    @Test
    public void carBrandTest() {
        carMock.setCarBrand("BMW");
        carMock.setCarBrand("BMW");
        carMock.setCarBrand("BMW");
        Mockito.verify(carMock, Mockito.times(3)).setCarBrand("BMW");
    }

    @Test
    public void carEnginePowerTest() {
        Car car = new Car(engineStub);
        assertEquals(0, car.getEnginePower());
        Mockito.when(engineStub.getPower()).thenReturn(500);
        assertEquals(500, car.getEnginePower());
    }

    @Test
    public void carWheelsCountTest() {
        Car car = new Car(wheelsStub);
        Mockito.when(wheelsStub.wheelsCount(2,2)).thenReturn(5);
        assertEquals(5, car.getWheelsCount(2,2));
    }
}
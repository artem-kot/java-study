package com.kots.practice.junit_parameterized_mocks;

import io.qameta.allure.junit4.DisplayName;
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
    @DisplayName("Sample test with mock")
    public void carBrandTest() {
        carMock.setCarBrand("BMW");
        carMock.setCarBrand("BMW");
        carMock.setCarBrand("BMW");
        Mockito.verify(carMock, Mockito.times(3)).setCarBrand("BMW");
    }

    @Test
    @DisplayName("Samplpe test with a stub")
    public void carEnginePowerTest() {
        Car car = new Car(engineStub);
        assertEquals(0, car.getEnginePower());
        Mockito.when(engineStub.getPower()).thenReturn(500);
        assertEquals(500, car.getEnginePower());
    }

    @Test
    @DisplayName("Advanced test with a stub")
    public void carWheelsCountTest() {
        Car car = new Car(wheelsStub);
        Mockito.when(wheelsStub.wheelsCount(2, 2)).thenReturn(5);
        assertEquals(5, car.getWheelsCount(2, 2));
    }
}
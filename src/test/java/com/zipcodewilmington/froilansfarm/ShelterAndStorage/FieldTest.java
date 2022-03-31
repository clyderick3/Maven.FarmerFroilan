package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FieldTest {

    @Test
    public void fieldTest(){
        //Given
        ArrayList<CropRow> cropRow = new ArrayList<CropRow>();
        Field field = new Field();
        //When
        field.setCropRows(cropRow);
        //Then
        Assert.assertEquals(cropRow,field.getCropRows());
    }
}

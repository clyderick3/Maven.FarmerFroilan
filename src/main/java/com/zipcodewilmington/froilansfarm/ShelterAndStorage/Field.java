package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import java.util.ArrayList;

public class Field {
    // stores CropRows
    // CropRow cropRow = new CropRow(); is instantiating an object. Create a list.
    ArrayList<CropRow> cropRows;

    public Field () {
        cropRows = new ArrayList<>();
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());

    }

    public void setCropRows(ArrayList<CropRow> cropRows){
        this.cropRows = cropRows;
    }

    public ArrayList<CropRow> getCropRows(){
        return cropRows;
    }

}

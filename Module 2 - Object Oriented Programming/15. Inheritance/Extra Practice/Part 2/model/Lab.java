package model;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> labEquipments;

    public Lab() {
        labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index) {
        return labEquipments.get(index).clone();
    }

    public void setLabEquipment(LabEquipment source, int index) {
        labEquipments.set(index, source.clone());
    }

    public void addLabEquipment(LabEquipment source) {
        labEquipments.add(source.clone());
    }

}

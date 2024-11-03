package com.example.myunittest;

public class MainViewModel {
    private final CuboidModel cuboidModel;

    public MainViewModel(CuboidModel cuboidModel) {
        this.cuboidModel = cuboidModel;
    }

    public double getCircumference() {
        return cuboidModel.getCircumference();
    }

    public double getSurfaceArea() {
        return cuboidModel.getSurfaceArea();
    }

    public double getVolume() {
        return cuboidModel.getVolume();
    }

    public void save(double w, double l, double h) {
        cuboidModel.save(w, l, h);
    }
}

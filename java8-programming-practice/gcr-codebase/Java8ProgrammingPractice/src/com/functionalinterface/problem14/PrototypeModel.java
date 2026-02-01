package com.functionalinterface.problem14;

public class PrototypeModel implements Cloneable {
    private String modelName;

    public PrototypeModel(String modelName) {
        this.modelName = modelName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

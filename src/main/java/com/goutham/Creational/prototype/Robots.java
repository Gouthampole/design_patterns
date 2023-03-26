package com.goutham.Creational.prototype;

public class Robots implements Items,Laboratory{

    private String parts;
    private String neuralSchema;

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String getNeuralSchema() {
        return neuralSchema;
    }

    public void setNeuralSchema(String neuralSchema) {
        this.neuralSchema = neuralSchema;
    }

    public Robots(String parts, String neuralSchema) {
        this.parts = parts;
        this.neuralSchema = neuralSchema;
    }

    @Override
    public String toString() {
        return "Robots{" +
                "parts='" + parts + '\'' +
                ", neuralSchema='" + neuralSchema + '\'' +
                '}';
    }

    @Override
    public Items cloneItem() {
        return new Robots(parts,neuralSchema);
    }
}

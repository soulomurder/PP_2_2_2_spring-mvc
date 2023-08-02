package web.model;

public class Car {
    private String model;
    private int series;
    private boolean newOne;

    public Car(String model, int series, boolean newOne) {
        this.model = model;
        this.series = series;
        this.newOne = newOne;
    }

    @Override
    public String toString() {
        return "Model: " +
                model +
                "; Series: " +
                series +
                (newOne ? "; New." : "; Used.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public boolean isNewOne() {
        return newOne;
    }

    public void setNewOne(boolean newOne) {
        this.newOne = newOne;
    }
}

package computer;

public class Monitor {
    private String make;
    private String model;
    private String diagonal;
    private MatrixType matrixType;

    public Monitor(String make, String model, String diagonal, MatrixType matrixType) {
        this.make = make;
        this.model = model;
        this.diagonal = diagonal;
        this.matrixType = matrixType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(MatrixType matrixType) {
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", diagonal='" + diagonal + '\'' +
                ", matrixType=" + matrixType +
                '}';
    }
}

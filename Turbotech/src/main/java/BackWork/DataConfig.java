package BackWork;

public class DataConfig {
    public double probSafe;
    public double probOne;
    public double probTwo;
    public double probThree;
    public double probFour;
    public double probFive;
    public double probSix;
    public double probSeven;
    public double probEight;
    public double probNine;
    public double probTen;
    public double probEleven;
    public double probTwelve;
    public double probThirteen;
    public double probFourteen;

    public double sensorOne;
    public double sensorTwo;
    public double sensorThree;
    public double sensorFour;
    public double sensorFive;
    public double sensorSix;
    public double sensorSeven;
    public double temp;

    public double updateInterval;

    public double getCol(int index) {
        switch (index){
            case 1:
                return probOne;
            case 2:
                return probTwo;
            case 3:
                return probThree;
            case 4:
                return probFour;
            case 5:
                return probFive;
            case 6:
                return probSix;
            case 7:
                return probSeven;
            case 8:
                return probEight;
            case 9:
                return probNine;
            case 10:
                return probTen;
            case 11:
                return probEleven;
            case 12:
                return probTwelve;
            case 13:
                return probThirteen;
            case 14:
                return probFourteen;
        }
        return probSafe;
    }

    public double getSensor(int index) {
        switch (index){
            case 1:
                return sensorOne;
            case 2:
                return sensorTwo;
            case 3:
                return sensorThree;
            case 4:
                return sensorFour;
            case 5:
                return sensorFive;
            case 6:
                return sensorSix;
            case 7:
                return sensorSeven;
        }
        return temp;
    }

    public double getUpdateInterval() {
        return updateInterval;
    }

    @Override
    public String toString() {
        return "DataConfig{" +
                "probSafe=" + probSafe +
                ", probOne=" + probOne +
                ", probTwo=" + probTwo +
                ", probThree=" + probThree +
                ", probFour=" + probFour +
                ", probFive=" + probFive +
                ", probSix=" + probSix +
                ", probSeven=" + probSeven +
                ", probEight=" + probEight +
                ", probNine=" + probNine +
                ", probTen=" + probTen +
                ", probEleven=" + probEleven +
                ", probTwelve=" + probTwelve +
                ", probThirteen=" + probThirteen +
                ", probFourteen=" + probFourteen +
                ", sensorOne=" + sensorOne +
                ", sensorTwo=" + sensorTwo +
                ", sensorThree=" + sensorThree +
                ", sensorFour=" + sensorFour +
                ", sensorFive=" + sensorFive +
                ", sensorSix=" + sensorSix +
                ", sensorSeven=" + sensorSeven +
                ", updateInterval=" + updateInterval +
                ", temp=" + temp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DataConfig that = (DataConfig) o;
        return Double.compare(that.probSafe, probSafe) == 0 &&
                Double.compare(that.probOne, probOne) == 0 &&
                Double.compare(that.probTwo, probTwo) == 0 &&
                Double.compare(that.probThree, probThree) == 0 &&
                Double.compare(that.probFour, probFour) == 0 &&
                Double.compare(that.probFive, probFive) == 0 &&
                Double.compare(that.probSix, probSix) == 0 &&
                Double.compare(that.probSeven, probSeven) == 0 &&
                Double.compare(that.probEight, probEight) == 0 &&
                Double.compare(that.probNine, probNine) == 0 &&
                Double.compare(that.probTen, probTen) == 0 &&
                Double.compare(that.probEleven, probEleven) == 0 &&
                Double.compare(that.probTwelve, probTwelve) == 0 &&
                Double.compare(that.probThirteen, probThirteen) == 0 &&
                Double.compare(that.probFourteen, probFourteen) == 0 &&
                Double.compare(that.sensorOne, sensorOne) == 0 &&
                Double.compare(that.sensorTwo, sensorTwo) == 0 &&
                Double.compare(that.sensorThree, sensorThree) == 0 &&
                Double.compare(that.sensorFour, sensorFour) == 0 &&
                Double.compare(that.sensorFive, sensorFive) == 0 &&
                Double.compare(that.sensorSix, sensorSix) == 0 &&
                Double.compare(that.sensorSeven, sensorSeven) == 0 &&
                Double.compare(that.temp, temp) == 0 &&
                Double.compare(that.updateInterval, updateInterval) == 0;
    }

}

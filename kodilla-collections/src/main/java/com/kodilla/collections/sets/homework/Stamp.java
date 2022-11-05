package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampDimension;
    private boolean stampedStamp;

    public Stamp (String stampName, double stampDimension, boolean stampedStamp) {
        this.stampName = stampName;
        this.stampDimension = stampDimension;
        this.stampedStamp = stampedStamp;

    }

    public String getStampName() {
        return stampName;
    }

    public double getStampDimension() {
        return stampDimension;
    }

    public boolean isStampedStamp() {
        return stampedStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampDimension, stampDimension) == 0
                && stampedStamp == stamp.stampedStamp
                && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimension, stampedStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimension=" + stampDimension +
                ", stampedStamp=" + stampedStamp +
                '}';
    }
}

package epam.com.javalab.tdd.range;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Range implements IRange, Iterable<Long> {

    private long lowerBound;
    private long upperBound;
    private List<Long> list = new ArrayList<>();

    Range(long lowerBound, long upperBound) throws RangeWrongBounds {

        if (lowerBound < upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;

            for (long index = lowerBound; index <= upperBound; index++) {
                list.add(index);
            }
        } else {
            throw new RangeWrongBounds("Range bounds Error. Lowerbound is greater then Upperbound.");
        }
    }

    public boolean isBefore(Range otherRange) {
        // checks if this.Range is before otherRange
        return upperBound < otherRange.getLowerBound();
    }

    public boolean isAfter(Range otherRange) {
        // checks if this.Range is after otherRange
        return lowerBound > otherRange.getUpperBound();
    }

    public boolean isConcurrent(Range otherRange) {
        return otherRange.getLowerBound() >= lowerBound && otherRange.getLowerBound() <= upperBound
                || otherRange.getLowerBound() <= upperBound;
    }

    public long getLowerBound() {
        return lowerBound;
    }

    public long getUpperBound() {
        return upperBound;
    }

    public boolean contains(long value) {
        return value >= lowerBound && value <= upperBound;
    }

    public List<Long> asList() {
        return Collections.unmodifiableList(list);
    }

    @Override
    public Iterator<Long> iterator() {
        return asList().iterator();
    }

}

package com.company.storables;

/**
 * Head of the dragon
 * @see Dragon
 */
public class DragonHead {
    /**
     * Dragon head constructor
     * @param eyesCount count of eyes
     */
    public DragonHead(float eyesCount) {
        this.eyesCount = eyesCount;
    }

    /**
     * Get number of eyes
     * @return number of eyes
     */
    public float getEyesCount() {
        return eyesCount;
    }

    /**
     * Set number of eyes
     * @param eyesCount new number of eyes
     */
    public void setEyesCount(float eyesCount) {
        this.eyesCount = eyesCount;
    }

    private float eyesCount;

    @Override
    public String toString() {
        return "DragonHead: " +
                " eyesCount=" + eyesCount;
    }
}

package com.example.android.quakereport;

public class Earthquake {

    /**
     * magnitude of the earthquake
     */
    private double mMagnitude;
    /**
     * location of the earthquake
     */
    private String mLocation;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;
    /**
     * Url link of the earthquake
     */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param mMagnitude          is the magnitude (size) of the earthquake
     * @param mLocation           is the location where the earthquake happened
     * @param mTimeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                            earthquake happened
     * @param mUrl                is the website URL to find more details about the earthquake
     */

    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = mUrl;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */

    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */

    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */

    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time to find more information about the earthquake.
     */

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

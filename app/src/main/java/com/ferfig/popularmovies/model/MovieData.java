package com.ferfig.popularmovies.model;

import java.io.Serializable;

public final class MovieData implements Serializable{

    private String mTitle;
    private String mReleaseDate;
    private String mPoster;
    private String mVoteAverage;
    private String mSynopsis;

    private static final String IMAGES_BASE_URL = "http://image.tmdb.org/t/p/";
    private static final String POSTER_WSIZE = "w185/";

    /** No args constructor for serialization purposes **/
    public MovieData(){
    }

    public MovieData(String title, String release_date, String poster, String vote_average, String synopsis){
        this.setTitle(title);
        this.setReleaseDate(release_date);
        this.setPoster(poster);
        this.setVoteAverage(vote_average);
        this.setSynopsis(synopsis);
    }

    /** getters **/
    public String getTitle() {
        return mTitle;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public String getPoster() {return mPoster; }

    public String getVoteAverage() {
        return mVoteAverage;
    }

    public String getSynopsis() {
        return mSynopsis;
    }

    /** setters **/
    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }

    public void setPoster(String mPoster) {
        this.mPoster = IMAGES_BASE_URL+ POSTER_WSIZE +mPoster;
    }

    public void setVoteAverage(String mVoteAverage) {
        this.mVoteAverage = mVoteAverage;
    }

    public void setSynopsis(String mSynopsis) {
        this.mSynopsis = mSynopsis;
    }
}

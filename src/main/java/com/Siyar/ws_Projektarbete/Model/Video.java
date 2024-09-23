package com.Siyar.ws_Projektarbete.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Video {

    private String _360p;
    private String _480p;
    private String _720p;
    private String _1080p;



    // Getters och Setters
    public String get360p() {
        return _360p;
    }

    public void set360p(String _360p) {
        this._360p = _360p;
    }

    public String get480p() {
        return _480p;
    }

    public void set480p(String _480p) {
        this._480p = _480p;
    }

    public String get720p() {
        return _720p;
    }

    public void set720p(String _720p) {
        this._720p = _720p;
    }

    public String get1080p() {
        return _1080p;
    }

    public void set1080p(String _1080p) {
        this._1080p = _1080p;
    }



}



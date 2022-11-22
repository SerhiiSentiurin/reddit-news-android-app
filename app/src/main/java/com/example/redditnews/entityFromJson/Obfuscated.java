package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Obfuscated {
    @JsonProperty("source")
    public Source getSource() {
        return this.source; }
    public void setSource(Source source) {
        this.source = source; }
    Source source;
    @JsonProperty("resolutions")
    public ArrayList<Resolution> getResolutions() {
        return this.resolutions; }
    public void setResolutions(ArrayList<Resolution> resolutions) {
        this.resolutions = resolutions; }
    ArrayList<Resolution> resolutions;
}

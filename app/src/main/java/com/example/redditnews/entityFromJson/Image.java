package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Image {
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
    @JsonProperty("variants")
    public Variants getVariants() {
        return this.variants; }
    public void setVariants(Variants variants) {
        this.variants = variants; }
    Variants variants;
    @JsonProperty("id")
    public String getId() {
        return this.id; }
    public void setId(String id) {
        this.id = id; }
    String id;
}

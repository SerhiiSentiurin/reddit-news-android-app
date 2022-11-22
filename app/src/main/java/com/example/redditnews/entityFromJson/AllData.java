package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class AllData {
    @JsonProperty("after")
    public String getAfter() {
        return this.after; }
    public void setAfter(String after) {
        this.after = after; }
    String after;
    @JsonProperty("dist")
    public int getDist() {
        return this.dist; }
    public void setDist(int dist) {
        this.dist = dist; }
    int dist;
    @JsonProperty("modhash")
    public String getModhash() {
        return this.modhash; }
    public void setModhash(String modhash) {
        this.modhash = modhash; }
    String modhash;
    @JsonProperty("geo_filter")
    public String getGeo_filter() {
        return this.geo_filter; }
    public void setGeo_filter(String geo_filter) {
        this.geo_filter = geo_filter; }
    String geo_filter;
    @JsonProperty("children")
    public ArrayList<Child> getChildren() {
        return this.children; }
    public void setChildren(ArrayList<Child> children) {
        this.children = children; }
    ArrayList<Child> children;

}

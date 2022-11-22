package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("kind")
    public String getKind() {
        return this.kind; }
    public void setKind(String kind) {
        this.kind = kind; }
    String kind;
    @JsonProperty("data")
    public AllData getAllData() {
        return this.allData; }
    public void setData(AllData data) {
        this.allData = data; }
    AllData allData;
}

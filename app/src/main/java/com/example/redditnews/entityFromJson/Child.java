package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Child {
    @JsonProperty("kind")
    public String getKind() {
        return this.kind; }
    public void setKind(String kind) {
        this.kind = kind; }
    String kind;
    @JsonProperty("data")
    public ChildData getChildData() {
        return this.childData; }
    public void setChildData(ChildData childData) {
        this.childData = childData; }
    ChildData childData;
}

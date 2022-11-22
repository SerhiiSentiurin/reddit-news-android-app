package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gildings {
    @JsonProperty("gid_1")
    public int getGid_1() {
        return this.gid_1; }
    public void setGid_1(int gid_1) {
        this.gid_1 = gid_1; }
    int gid_1;
    @JsonProperty("gid_2")
    public int getGid_2() {
        return this.gid_2; }
    public void setGid_2(int gid_2) {
        this.gid_2 = gid_2; }
    int gid_2;
    @JsonProperty("gid_3")
    public int getGid_3() {
        return this.gid_3; }
    public void setGid_3(int gid_3) {
        this.gid_3 = gid_3; }
    int gid_3;
}

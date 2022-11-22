package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LinkFlairRichtext {
    @JsonProperty("e")
    public String getE() {
        return this.e; }
    public void setE(String e) {
        this.e = e; }
    String e;
    @JsonProperty("t")
    public String getT() {
        return this.t; }
    public void setT(String t) {
        this.t = t; }
    String t;
    @JsonProperty("a")
    public String getA() {
        return this.a; }
    public void setA(String a) {
        this.a = a; }
    String a;
    @JsonProperty("u")
    public String getU() {
        return this.u; }
    public void setU(String u) {
        this.u = u; }
    String u;
}

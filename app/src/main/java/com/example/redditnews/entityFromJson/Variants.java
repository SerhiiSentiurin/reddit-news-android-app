package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Variants {
    @JsonProperty("obfuscated")
    public Obfuscated getObfuscated() {
        return this.obfuscated; }
    public void setObfuscated(Obfuscated obfuscated) {
        this.obfuscated = obfuscated; }
    Obfuscated obfuscated;
    @JsonProperty("nsfw")
    public Nsfw getNsfw() {
        return this.nsfw; }
    public void setNsfw(Nsfw nsfw) {
        this.nsfw = nsfw; }
    Nsfw nsfw;
}

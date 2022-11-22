package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecureMediaEmbed {
    @JsonProperty("content")
    public String getContent() {
        return this.content; }
    public void setContent(String content) {
        this.content = content; }
    String content;
    @JsonProperty("width")
    public int getWidth() {
        return this.width; }
    public void setWidth(int width) {
        this.width = width; }
    int width;
    @JsonProperty("scrolling")
    public boolean getScrolling() {
        return this.scrolling; }
    public void setScrolling(boolean scrolling) {
        this.scrolling = scrolling; }
    boolean scrolling;
    @JsonProperty("media_domain_url")
    public String getMedia_domain_url() {
        return this.media_domain_url; }
    public void setMedia_domain_url(String media_domain_url) {
        this.media_domain_url = media_domain_url; }
    String media_domain_url;
    @JsonProperty("height")
    public int getHeight() {
        return this.height; }
    public void setHeight(int height) {
        this.height = height; }
    int height;
}

package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaEmbed {
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
    @JsonProperty("height")
    public int getHeight() {
        return this.height; }
    public void setHeight(int height) {
        this.height = height; }
    int height;
}

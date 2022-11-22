package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Oembed {
    @JsonProperty("provider_url")
    public String getProvider_url() {
        return this.provider_url; }
    public void setProvider_url(String provider_url) {
        this.provider_url = provider_url; }
    String provider_url;
    @JsonProperty("description")
    public String getDescription() {
        return this.description; }
    public void setDescription(String description) {
        this.description = description; }
    String description;
    @JsonProperty("title")
    public String getTitle() {
        return this.title; }
    public void setTitle(String title) {
        this.title = title; }
    String title;
    @JsonProperty("author_name")
    public String getAuthor_name() {
        return this.author_name; }
    public void setAuthor_name(String author_name) {
        this.author_name = author_name; }
    String author_name;
    @JsonProperty("height")
    public int getHeight() {
        return this.height; }
    public void setHeight(int height) {
        this.height = height; }
    int height;
    @JsonProperty("width")
    public int getWidth() {
        return this.width; }
    public void setWidth(int width) {
        this.width = width; }
    int width;
    @JsonProperty("html")
    public String getHtml() {
        return this.html; }
    public void setHtml(String html) {
        this.html = html; }
    String html;
    @JsonProperty("thumbnail_width")
    public int getThumbnail_width() {
        return this.thumbnail_width; }
    public void setThumbnail_width(int thumbnail_width) {
        this.thumbnail_width = thumbnail_width; }
    int thumbnail_width;
    @JsonProperty("version")
    public String getVersion() {
        return this.version; }
    public void setVersion(String version) {
        this.version = version; }
    String version;
    @JsonProperty("provider_name")
    public String getProvider_name() {
        return this.provider_name; }
    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name; }
    String provider_name;
    @JsonProperty("thumbnail_url")
    public String getThumbnail_url() {
        return this.thumbnail_url; }
    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url; }
    String thumbnail_url;
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("thumbnail_height")
    public int getThumbnail_height() {
        return this.thumbnail_height; }
    public void setThumbnail_height(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height; }
    int thumbnail_height;
}

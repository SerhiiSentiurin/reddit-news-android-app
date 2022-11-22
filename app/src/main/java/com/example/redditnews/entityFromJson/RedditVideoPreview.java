package com.example.redditnews.entityFromJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedditVideoPreview {
    @JsonProperty("bitrate_kbps")
    public int getBitrate_kbps() {
        return this.bitrate_kbps; }
    public void setBitrate_kbps(int bitrate_kbps) {
        this.bitrate_kbps = bitrate_kbps; }
    int bitrate_kbps;
    @JsonProperty("fallback_url")
    public String getFallback_url() {
        return this.fallback_url; }
    public void setFallback_url(String fallback_url) {
        this.fallback_url = fallback_url; }
    String fallback_url;
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
    @JsonProperty("scrubber_media_url")
    public String getScrubber_media_url() {
        return this.scrubber_media_url; }
    public void setScrubber_media_url(String scrubber_media_url) {
        this.scrubber_media_url = scrubber_media_url; }
    String scrubber_media_url;
    @JsonProperty("dash_url")
    public String getDash_url() {
        return this.dash_url; }
    public void setDash_url(String dash_url) {
        this.dash_url = dash_url; }
    String dash_url;
    @JsonProperty("duration")
    public int getDuration() {
        return this.duration; }
    public void setDuration(int duration) {
        this.duration = duration; }
    int duration;
    @JsonProperty("hls_url")
    public String getHls_url() {
        return this.hls_url; }
    public void setHls_url(String hls_url) {
        this.hls_url = hls_url; }
    String hls_url;
    @JsonProperty("is_gif")
    public boolean getIs_gif() {
        return this.is_gif; }
    public void setIs_gif(boolean is_gif) {
        this.is_gif = is_gif; }
    boolean is_gif;
    @JsonProperty("transcoding_status")
    public String getTranscoding_status() {
        return this.transcoding_status; }
    public void setTranscoding_status(String transcoding_status) {
        this.transcoding_status = transcoding_status; }
    String transcoding_status;
}

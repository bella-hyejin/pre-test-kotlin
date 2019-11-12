package com.hyejin.musinsa.musinsaapp.domain.remote.model;

import java.lang.System;

/**
 * {
 * "total_count": 12,
 * "incomplete_results": false,
 * "items": [
 * {
 * "login": "mojombo",
 * "id": 1,
 * "node_id": "MDQ6VXNlcjE=",
 * "avatar_url": "https://secure.gravatar.com/avatar/25c7c18223fb42a4c6ae1c8db6f50f9b?d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png",
 * "gravatar_id": "",
 * "url": "https://api.github.com/users/mojombo",
 * "html_url": "https://github.com/mojombo",
 * "followers_url": "https://api.github.com/users/mojombo/followers",
 * "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
 * "organizations_url": "https://api.github.com/users/mojombo/orgs",
 * "repos_url": "https://api.github.com/users/mojombo/repos",
 * "received_events_url": "https://api.github.com/users/mojombo/received_events",
 * "type": "User",
 * "score": 105.47857
 * }
 * ]
 * }
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u00c6\u0003J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/domain/remote/model/Response;", "T", "", "total", "", "incomplete_results", "", "items", "", "(IZLjava/util/List;)V", "getIncomplete_results", "()Z", "getItems", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class Response<T extends java.lang.Object> {
    @com.google.gson.annotations.SerializedName(value = "total")
    private final int total = 0;
    @com.google.gson.annotations.SerializedName(value = "incomplete_results")
    private final boolean incomplete_results = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private final java.util.List<T> items = null;
    
    public final int getTotal() {
        return 0;
    }
    
    public final boolean getIncomplete_results() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getItems() {
        return null;
    }
    
    public Response(int total, boolean incomplete_results, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component3() {
        return null;
    }
    
    /**
     * {
     * "total_count": 12,
     * "incomplete_results": false,
     * "items": [
     * {
     * "login": "mojombo",
     * "id": 1,
     * "node_id": "MDQ6VXNlcjE=",
     * "avatar_url": "https://secure.gravatar.com/avatar/25c7c18223fb42a4c6ae1c8db6f50f9b?d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png",
     * "gravatar_id": "",
     * "url": "https://api.github.com/users/mojombo",
     * "html_url": "https://github.com/mojombo",
     * "followers_url": "https://api.github.com/users/mojombo/followers",
     * "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
     * "organizations_url": "https://api.github.com/users/mojombo/orgs",
     * "repos_url": "https://api.github.com/users/mojombo/repos",
     * "received_events_url": "https://api.github.com/users/mojombo/received_events",
     * "type": "User",
     * "score": 105.47857
     * }
     * ]
     * }
     */
    @org.jetbrains.annotations.NotNull()
    public final com.hyejin.musinsa.musinsaapp.domain.remote.model.Response<T> copy(int total, boolean incomplete_results, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
        return null;
    }
    
    /**
     * {
     * "total_count": 12,
     * "incomplete_results": false,
     * "items": [
     * {
     * "login": "mojombo",
     * "id": 1,
     * "node_id": "MDQ6VXNlcjE=",
     * "avatar_url": "https://secure.gravatar.com/avatar/25c7c18223fb42a4c6ae1c8db6f50f9b?d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png",
     * "gravatar_id": "",
     * "url": "https://api.github.com/users/mojombo",
     * "html_url": "https://github.com/mojombo",
     * "followers_url": "https://api.github.com/users/mojombo/followers",
     * "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
     * "organizations_url": "https://api.github.com/users/mojombo/orgs",
     * "repos_url": "https://api.github.com/users/mojombo/repos",
     * "received_events_url": "https://api.github.com/users/mojombo/received_events",
     * "type": "User",
     * "score": 105.47857
     * }
     * ]
     * }
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * {
     * "total_count": 12,
     * "incomplete_results": false,
     * "items": [
     * {
     * "login": "mojombo",
     * "id": 1,
     * "node_id": "MDQ6VXNlcjE=",
     * "avatar_url": "https://secure.gravatar.com/avatar/25c7c18223fb42a4c6ae1c8db6f50f9b?d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png",
     * "gravatar_id": "",
     * "url": "https://api.github.com/users/mojombo",
     * "html_url": "https://github.com/mojombo",
     * "followers_url": "https://api.github.com/users/mojombo/followers",
     * "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
     * "organizations_url": "https://api.github.com/users/mojombo/orgs",
     * "repos_url": "https://api.github.com/users/mojombo/repos",
     * "received_events_url": "https://api.github.com/users/mojombo/received_events",
     * "type": "User",
     * "score": 105.47857
     * }
     * ]
     * }
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * {
     * "total_count": 12,
     * "incomplete_results": false,
     * "items": [
     * {
     * "login": "mojombo",
     * "id": 1,
     * "node_id": "MDQ6VXNlcjE=",
     * "avatar_url": "https://secure.gravatar.com/avatar/25c7c18223fb42a4c6ae1c8db6f50f9b?d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png",
     * "gravatar_id": "",
     * "url": "https://api.github.com/users/mojombo",
     * "html_url": "https://github.com/mojombo",
     * "followers_url": "https://api.github.com/users/mojombo/followers",
     * "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
     * "organizations_url": "https://api.github.com/users/mojombo/orgs",
     * "repos_url": "https://api.github.com/users/mojombo/repos",
     * "received_events_url": "https://api.github.com/users/mojombo/received_events",
     * "type": "User",
     * "score": 105.47857
     * }
     * ]
     * }
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
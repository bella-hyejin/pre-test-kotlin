package com.hyejin.musinsa.musinsaapp.ui.meeting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u001e\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u001a\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002\u00a8\u0006\u001d"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/ui/meeting/MeetingRoomAdapter;", "Lcom/hyejin/musinsa/musinsaapp/ui/base/BaseListAdapter;", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/MeetingRoom;", "list", "", "(Ljava/util/List;)V", "convertTimeToPosition", "", "time", "", "getNowPosition", "makeInTimeList", "Landroid/util/SparseBooleanArray;", "reservationList", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/Reservation;", "nowPosition", "onBindViewHolderBase", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "onCreateViewHolderBase", "parent", "Landroid/view/ViewGroup;", "viewType", "searchInTimePosition", "startTime", "endTime", "slideTime", "app_debug"})
public final class MeetingRoomAdapter extends com.hyejin.musinsa.musinsaapp.ui.base.BaseListAdapter<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolderBase(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolderBase(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    private final android.util.SparseBooleanArray makeInTimeList(java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.Reservation> reservationList, int nowPosition) {
        return null;
    }
    
    private final java.lang.String slideTime(java.lang.String time) {
        return null;
    }
    
    private final java.util.List<java.lang.Integer> searchInTimePosition(java.lang.String startTime, java.lang.String endTime, int nowPosition) {
        return null;
    }
    
    private final int convertTimeToPosition(java.lang.String time) {
        return 0;
    }
    
    private final int getNowPosition() {
        return 0;
    }
    
    public MeetingRoomAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> list) {
        super(null);
    }
}
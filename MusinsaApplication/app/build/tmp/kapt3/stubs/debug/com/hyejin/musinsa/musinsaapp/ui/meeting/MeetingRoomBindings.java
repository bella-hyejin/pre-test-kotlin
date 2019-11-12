package com.hyejin.musinsa.musinsaapp.ui.meeting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J \u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/ui/meeting/MeetingRoomBindings;", "", "()V", "addMeetingView", "", "layout", "Landroid/widget/LinearLayout;", "meetingRooms", "", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/MeetingRoom;", "loadData", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showArrow", "imageView", "Landroid/widget/ImageView;", "position", "", "showText", "textView", "Landroid/widget/TextView;", "app_debug"})
public final class MeetingRoomBindings {
    public static final com.hyejin.musinsa.musinsaapp.ui.meeting.MeetingRoomBindings INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"load_data"})
    public static final void loadData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> meetingRooms) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"add_meeting_room_view"})
    public static final void addMeetingView(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout, @org.jetbrains.annotations.Nullable()
    java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> meetingRooms) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"arrow_position"})
    public static final void showArrow(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, int position) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"text_position"})
    public static final void showText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int position) {
    }
    
    private MeetingRoomBindings() {
        super();
    }
}
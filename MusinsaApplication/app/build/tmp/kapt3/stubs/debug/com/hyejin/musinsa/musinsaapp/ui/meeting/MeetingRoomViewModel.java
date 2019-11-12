package com.hyejin.musinsa.musinsaapp.ui.meeting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/ui/meeting/MeetingRoomViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mApplication", "meetingRooms", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/MeetingRoom;", "getAll", "", "getMeetingRooms", "getNowDate", "", "ReadAssetsDataTask", "app_debug"})
public final class MeetingRoomViewModel extends androidx.lifecycle.AndroidViewModel {
    private android.app.Application mApplication;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom>> meetingRooms;
    
    public final void getAll() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom>> getMeetingRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNowDate() {
        return null;
    }
    
    public MeetingRoomViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\b\u00a2\u0006\u0002\u0010\tJ-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/hyejin/musinsa/musinsaapp/ui/meeting/MeetingRoomViewModel$ReadAssetsDataTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/hyejin/musinsa/musinsaapp/domain/local/model/MeetingRoom;", "application", "Landroid/app/Application;", "meetingRooms", "Landroidx/lifecycle/MutableLiveData;", "(Landroid/app/Application;Landroidx/lifecycle/MutableLiveData;)V", "mApplication", "mMeetingRooms", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "onPostExecute", "", "result", "app_debug"})
    public static final class ReadAssetsDataTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom>> {
        private final android.app.Application mApplication = null;
        private final androidx.lifecycle.MutableLiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom>> mMeetingRooms = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> result) {
        }
        
        public ReadAssetsDataTask(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom>> meetingRooms) {
            super();
        }
    }
}
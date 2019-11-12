package com.hyejin.musinsa.musinsaapp.databinding;
import com.hyejin.musinsa.musinsaapp.R;
import com.hyejin.musinsa.musinsaapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMeetingRoomBindingImpl extends ActivityMeetingRoomBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.header_container, 5);
        sViewsWithIds.put(R.id.btn_open, 6);
        sViewsWithIds.put(R.id.btn_setting, 7);
        sViewsWithIds.put(R.id.title_available_meeting_room, 8);
        sViewsWithIds.put(R.id.horizontal_scroll, 9);
        sViewsWithIds.put(R.id.list_header_container, 10);
        sViewsWithIds.put(R.id.reservation_indication, 11);
        sViewsWithIds.put(R.id.btn_reservation, 12);
        sViewsWithIds.put(R.id.btn_out_meeting, 13);
        sViewsWithIds.put(R.id.my_reservation, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMeetingRoomBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityMeetingRoomBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.ImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.HorizontalScrollView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.RadioButton) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            );
        this.availableMeetingRoomBtnContainer.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.meetingRoomList.setTag(null);
        this.textAvailableMeetingRoom.setTag(null);
        this.titleText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.meetingRooms == variableId) {
            setMeetingRooms((java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom>) variable);
        }
        else if (BR.nowDate == variableId) {
            setNowDate((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMeetingRooms(@Nullable java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> MeetingRooms) {
        this.mMeetingRooms = MeetingRooms;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.meetingRooms);
        super.requestRebind();
    }
    public void setNowDate(@Nullable java.lang.String NowDate) {
        this.mNowDate = NowDate;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.nowDate);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom> meetingRooms = mMeetingRooms;
        java.lang.String integerToStringMeetingRoomsSize = null;
        java.lang.String nowDate = mNowDate;
        int meetingRoomsSize = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (meetingRooms != null) {
                    // read meetingRooms.size()
                    meetingRoomsSize = meetingRooms.size();
                }


                // read Integer.toString(meetingRooms.size())
                integerToStringMeetingRoomsSize = java.lang.Integer.toString(meetingRoomsSize);
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.hyejin.musinsa.musinsaapp.ui.meeting.MeetingRoomBindings.addMeetingView(this.availableMeetingRoomBtnContainer, meetingRooms);
            com.hyejin.musinsa.musinsaapp.ui.meeting.MeetingRoomBindings.loadData(this.meetingRoomList, meetingRooms);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textAvailableMeetingRoom, integerToStringMeetingRoomsSize);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, nowDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): meetingRooms
        flag 1 (0x2L): nowDate
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
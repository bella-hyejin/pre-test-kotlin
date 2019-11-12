package com.hyejin.musinsa.musinsaapp.databinding;
import com.hyejin.musinsa.musinsaapp.R;
import com.hyejin.musinsa.musinsaapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewMeetingRoomItemBindingImpl extends ViewMeetingRoomItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"reservation_progress"},
            new int[] {3},
            new int[] {com.hyejin.musinsa.musinsaapp.R.layout.reservation_progress});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewMeetingRoomItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ViewMeetingRoomItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (com.hyejin.musinsa.musinsaapp.databinding.ReservationProgressBinding) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.meetingRoomLocationText.setTag(null);
        this.meetingRoomNameText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        reservationProgressContainer.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (reservationProgressContainer.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.meetingRoom == variableId) {
            setMeetingRoom((com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom) variable);
        }
        else if (BR.nowPosition == variableId) {
            setNowPosition((java.lang.Integer) variable);
        }
        else if (BR.isInTimes == variableId) {
            setIsInTimes((android.util.SparseBooleanArray) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMeetingRoom(@Nullable com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom MeetingRoom) {
        this.mMeetingRoom = MeetingRoom;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.meetingRoom);
        super.requestRebind();
    }
    public void setNowPosition(@Nullable java.lang.Integer NowPosition) {
        this.mNowPosition = NowPosition;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.nowPosition);
        super.requestRebind();
    }
    public void setIsInTimes(@Nullable android.util.SparseBooleanArray IsInTimes) {
        this.mIsInTimes = IsInTimes;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isInTimes);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        reservationProgressContainer.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeReservationProgressContainer((com.hyejin.musinsa.musinsaapp.databinding.ReservationProgressBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeReservationProgressContainer(com.hyejin.musinsa.musinsaapp.databinding.ReservationProgressBinding ReservationProgressContainer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.Reservation> meetingRoomReservations = null;
        com.hyejin.musinsa.musinsaapp.domain.local.model.MeetingRoom meetingRoom = mMeetingRoom;
        java.lang.Integer nowPosition = mNowPosition;
        android.util.SparseBooleanArray isInTimes = mIsInTimes;
        java.lang.String meetingRoomLocation = null;
        java.lang.String meetingRoomName = null;

        if ((dirtyFlags & 0x12L) != 0) {



                if (meetingRoom != null) {
                    // read meetingRoom.reservations
                    meetingRoomReservations = meetingRoom.getReservations();
                    // read meetingRoom.location
                    meetingRoomLocation = meetingRoom.getLocation();
                    // read meetingRoom.name
                    meetingRoomName = meetingRoom.getName();
                }
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.meetingRoomLocationText, meetingRoomLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.meetingRoomNameText, meetingRoomName);
            this.reservationProgressContainer.setReservations(meetingRoomReservations);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.reservationProgressContainer.setIsInTimes(isInTimes);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.reservationProgressContainer.setNowPosition(nowPosition);
        }
        executeBindingsOn(reservationProgressContainer);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reservationProgressContainer
        flag 1 (0x2L): meetingRoom
        flag 2 (0x3L): nowPosition
        flag 3 (0x4L): isInTimes
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}
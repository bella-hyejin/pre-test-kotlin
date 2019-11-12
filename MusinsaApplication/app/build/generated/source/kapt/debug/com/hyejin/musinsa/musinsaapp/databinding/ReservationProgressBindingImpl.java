package com.hyejin.musinsa.musinsaapp.databinding;
import com.hyejin.musinsa.musinsaapp.R;
import com.hyejin.musinsa.musinsaapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ReservationProgressBindingImpl extends ReservationProgressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.num_1, 21);
        sViewsWithIds.put(R.id.num_2, 22);
        sViewsWithIds.put(R.id.num_3, 23);
        sViewsWithIds.put(R.id.num_4, 24);
        sViewsWithIds.put(R.id.num_5, 25);
        sViewsWithIds.put(R.id.num_6, 26);
        sViewsWithIds.put(R.id.num_7, 27);
        sViewsWithIds.put(R.id.num_8, 28);
        sViewsWithIds.put(R.id.num_9, 29);
        sViewsWithIds.put(R.id.num_10, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ReservationProgressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ReservationProgressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[29]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[19]
            );
        this.nowTime.setTag(null);
        this.parent.setTag(null);
        this.progress1.setTag(null);
        this.progress10.setTag(null);
        this.progress11.setTag(null);
        this.progress12.setTag(null);
        this.progress13.setTag(null);
        this.progress14.setTag(null);
        this.progress15.setTag(null);
        this.progress16.setTag(null);
        this.progress17.setTag(null);
        this.progress18.setTag(null);
        this.progress2.setTag(null);
        this.progress3.setTag(null);
        this.progress4.setTag(null);
        this.progress5.setTag(null);
        this.progress6.setTag(null);
        this.progress7.setTag(null);
        this.progress8.setTag(null);
        this.progress9.setTag(null);
        this.timeArrow.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.reservations == variableId) {
            setReservations((java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.Reservation>) variable);
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

    public void setReservations(@Nullable java.util.List<com.hyejin.musinsa.musinsaapp.domain.local.model.Reservation> Reservations) {
        this.mReservations = Reservations;
    }
    public void setNowPosition(@Nullable java.lang.Integer NowPosition) {
        this.mNowPosition = NowPosition;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.nowPosition);
        super.requestRebind();
    }
    public void setIsInTimes(@Nullable android.util.SparseBooleanArray IsInTimes) {
        this.mIsInTimes = IsInTimes;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isInTimes);
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
        int isInTimes9Progress10AndroidColorDeepSkyBlueProgress10AndroidColorBrownishGrey = 0;
        boolean isInTimes3 = false;
        int isInTimes8Progress9AndroidColorDeepSkyBlueProgress9AndroidColorBrownishGrey = 0;
        boolean isInTimes14 = false;
        int isInTimes13Progress14AndroidColorDeepSkyBlueProgress14AndroidColorBrownishGrey = 0;
        boolean isInTimes0 = false;
        int isInTimes12Progress13AndroidColorDeepSkyBlueProgress13AndroidColorBrownishGrey = 0;
        boolean isInTimes8 = false;
        boolean isInTimes11 = false;
        int isInTimes0Progress1AndroidColorDeepSkyBlueProgress1AndroidColorBrownishGrey = 0;
        int isInTimes5Progress6AndroidColorDeepSkyBlueProgress6AndroidColorBrownishGrey = 0;
        boolean isInTimes1 = false;
        boolean isInTimes9 = false;
        boolean isInTimes12 = false;
        int isInTimes2Progress3AndroidColorDeepSkyBlueProgress3AndroidColorBrownishGrey = 0;
        int isInTimes14Progress15AndroidColorDeepSkyBlueProgress15AndroidColorBrownishGrey = 0;
        int isInTimes7Progress8AndroidColorDeepSkyBlueProgress8AndroidColorBrownishGrey = 0;
        int isInTimes11Progress12AndroidColorDeepSkyBlueProgress12AndroidColorBrownishGrey = 0;
        boolean isInTimes6 = false;
        int isInTimes17Progress18AndroidColorDeepSkyBlueProgress18AndroidColorBrownishGrey = 0;
        boolean isInTimes17 = false;
        int isInTimes16Progress17AndroidColorDeepSkyBlueProgress17AndroidColorBrownishGrey = 0;
        int isInTimes1Progress2AndroidColorDeepSkyBlueProgress2AndroidColorBrownishGrey = 0;
        int isInTimes4Progress5AndroidColorDeepSkyBlueProgress5AndroidColorBrownishGrey = 0;
        int isInTimes10Progress11AndroidColorDeepSkyBlueProgress11AndroidColorBrownishGrey = 0;
        boolean isInTimes7 = false;
        boolean isInTimes10 = false;
        int androidxDatabindingViewDataBindingSafeUnboxNowPosition = 0;
        int isInTimes15Progress16AndroidColorDeepSkyBlueProgress16AndroidColorBrownishGrey = 0;
        java.lang.Integer nowPosition = mNowPosition;
        boolean isInTimes4 = false;
        boolean isInTimes15 = false;
        int isInTimes3Progress4AndroidColorDeepSkyBlueProgress4AndroidColorBrownishGrey = 0;
        android.util.SparseBooleanArray isInTimes = mIsInTimes;
        int isInTimes6Progress7AndroidColorDeepSkyBlueProgress7AndroidColorBrownishGrey = 0;
        boolean isInTimes5 = false;
        boolean isInTimes16 = false;
        boolean isInTimes2 = false;
        boolean isInTimes13 = false;

        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(nowPosition)
                androidxDatabindingViewDataBindingSafeUnboxNowPosition = androidx.databinding.ViewDataBinding.safeUnbox(nowPosition);
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (isInTimes != null) {
                    // read isInTimes[3]
                    isInTimes3 = isInTimes.get(3);
                    // read isInTimes[14]
                    isInTimes14 = isInTimes.get(14);
                    // read isInTimes[0]
                    isInTimes0 = isInTimes.get(0);
                    // read isInTimes[8]
                    isInTimes8 = isInTimes.get(8);
                    // read isInTimes[11]
                    isInTimes11 = isInTimes.get(11);
                    // read isInTimes[1]
                    isInTimes1 = isInTimes.get(1);
                    // read isInTimes[9]
                    isInTimes9 = isInTimes.get(9);
                    // read isInTimes[12]
                    isInTimes12 = isInTimes.get(12);
                    // read isInTimes[6]
                    isInTimes6 = isInTimes.get(6);
                    // read isInTimes[17]
                    isInTimes17 = isInTimes.get(17);
                    // read isInTimes[7]
                    isInTimes7 = isInTimes.get(7);
                    // read isInTimes[10]
                    isInTimes10 = isInTimes.get(10);
                    // read isInTimes[4]
                    isInTimes4 = isInTimes.get(4);
                    // read isInTimes[15]
                    isInTimes15 = isInTimes.get(15);
                    // read isInTimes[5]
                    isInTimes5 = isInTimes.get(5);
                    // read isInTimes[16]
                    isInTimes16 = isInTimes.get(16);
                    // read isInTimes[2]
                    isInTimes2 = isInTimes.get(2);
                    // read isInTimes[13]
                    isInTimes13 = isInTimes.get(13);
                }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes3) {
                        dirtyFlags |= 0x2000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes14) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes0) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes8) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes11) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes1) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes9) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes12) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes6) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes17) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes7) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes10) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes4) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes15) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes5) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes16) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes2) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(isInTimes13) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read isInTimes[3] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes3Progress4AndroidColorDeepSkyBlueProgress4AndroidColorBrownishGrey = ((isInTimes3) ? (getColorFromResource(progress4, R.color.deep_sky_blue)) : (getColorFromResource(progress4, R.color.brownish_grey)));
                // read isInTimes[14] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes14Progress15AndroidColorDeepSkyBlueProgress15AndroidColorBrownishGrey = ((isInTimes14) ? (getColorFromResource(progress15, R.color.deep_sky_blue)) : (getColorFromResource(progress15, R.color.brownish_grey)));
                // read isInTimes[0] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes0Progress1AndroidColorDeepSkyBlueProgress1AndroidColorBrownishGrey = ((isInTimes0) ? (getColorFromResource(progress1, R.color.deep_sky_blue)) : (getColorFromResource(progress1, R.color.brownish_grey)));
                // read isInTimes[8] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes8Progress9AndroidColorDeepSkyBlueProgress9AndroidColorBrownishGrey = ((isInTimes8) ? (getColorFromResource(progress9, R.color.deep_sky_blue)) : (getColorFromResource(progress9, R.color.brownish_grey)));
                // read isInTimes[11] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes11Progress12AndroidColorDeepSkyBlueProgress12AndroidColorBrownishGrey = ((isInTimes11) ? (getColorFromResource(progress12, R.color.deep_sky_blue)) : (getColorFromResource(progress12, R.color.brownish_grey)));
                // read isInTimes[1] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes1Progress2AndroidColorDeepSkyBlueProgress2AndroidColorBrownishGrey = ((isInTimes1) ? (getColorFromResource(progress2, R.color.deep_sky_blue)) : (getColorFromResource(progress2, R.color.brownish_grey)));
                // read isInTimes[9] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes9Progress10AndroidColorDeepSkyBlueProgress10AndroidColorBrownishGrey = ((isInTimes9) ? (getColorFromResource(progress10, R.color.deep_sky_blue)) : (getColorFromResource(progress10, R.color.brownish_grey)));
                // read isInTimes[12] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes12Progress13AndroidColorDeepSkyBlueProgress13AndroidColorBrownishGrey = ((isInTimes12) ? (getColorFromResource(progress13, R.color.deep_sky_blue)) : (getColorFromResource(progress13, R.color.brownish_grey)));
                // read isInTimes[6] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes6Progress7AndroidColorDeepSkyBlueProgress7AndroidColorBrownishGrey = ((isInTimes6) ? (getColorFromResource(progress7, R.color.deep_sky_blue)) : (getColorFromResource(progress7, R.color.brownish_grey)));
                // read isInTimes[17] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes17Progress18AndroidColorDeepSkyBlueProgress18AndroidColorBrownishGrey = ((isInTimes17) ? (getColorFromResource(progress18, R.color.deep_sky_blue)) : (getColorFromResource(progress18, R.color.brownish_grey)));
                // read isInTimes[7] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes7Progress8AndroidColorDeepSkyBlueProgress8AndroidColorBrownishGrey = ((isInTimes7) ? (getColorFromResource(progress8, R.color.deep_sky_blue)) : (getColorFromResource(progress8, R.color.brownish_grey)));
                // read isInTimes[10] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes10Progress11AndroidColorDeepSkyBlueProgress11AndroidColorBrownishGrey = ((isInTimes10) ? (getColorFromResource(progress11, R.color.deep_sky_blue)) : (getColorFromResource(progress11, R.color.brownish_grey)));
                // read isInTimes[4] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes4Progress5AndroidColorDeepSkyBlueProgress5AndroidColorBrownishGrey = ((isInTimes4) ? (getColorFromResource(progress5, R.color.deep_sky_blue)) : (getColorFromResource(progress5, R.color.brownish_grey)));
                // read isInTimes[15] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes15Progress16AndroidColorDeepSkyBlueProgress16AndroidColorBrownishGrey = ((isInTimes15) ? (getColorFromResource(progress16, R.color.deep_sky_blue)) : (getColorFromResource(progress16, R.color.brownish_grey)));
                // read isInTimes[5] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes5Progress6AndroidColorDeepSkyBlueProgress6AndroidColorBrownishGrey = ((isInTimes5) ? (getColorFromResource(progress6, R.color.deep_sky_blue)) : (getColorFromResource(progress6, R.color.brownish_grey)));
                // read isInTimes[16] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes16Progress17AndroidColorDeepSkyBlueProgress17AndroidColorBrownishGrey = ((isInTimes16) ? (getColorFromResource(progress17, R.color.deep_sky_blue)) : (getColorFromResource(progress17, R.color.brownish_grey)));
                // read isInTimes[2] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes2Progress3AndroidColorDeepSkyBlueProgress3AndroidColorBrownishGrey = ((isInTimes2) ? (getColorFromResource(progress3, R.color.deep_sky_blue)) : (getColorFromResource(progress3, R.color.brownish_grey)));
                // read isInTimes[13] ? @android:color/deep_sky_blue : @android:color/brownish_grey
                isInTimes13Progress14AndroidColorDeepSkyBlueProgress14AndroidColorBrownishGrey = ((isInTimes13) ? (getColorFromResource(progress14, R.color.deep_sky_blue)) : (getColorFromResource(progress14, R.color.brownish_grey)));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.hyejin.musinsa.musinsaapp.ui.meeting.MeetingRoomBindings.showText(this.nowTime, androidxDatabindingViewDataBindingSafeUnboxNowPosition);
            com.hyejin.musinsa.musinsaapp.ui.meeting.MeetingRoomBindings.showArrow(this.timeArrow, androidxDatabindingViewDataBindingSafeUnboxNowPosition);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress1, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes0Progress1AndroidColorDeepSkyBlueProgress1AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress10, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes9Progress10AndroidColorDeepSkyBlueProgress10AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress11, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes10Progress11AndroidColorDeepSkyBlueProgress11AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress12, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes11Progress12AndroidColorDeepSkyBlueProgress12AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress13, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes12Progress13AndroidColorDeepSkyBlueProgress13AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress14, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes13Progress14AndroidColorDeepSkyBlueProgress14AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress15, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes14Progress15AndroidColorDeepSkyBlueProgress15AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress16, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes15Progress16AndroidColorDeepSkyBlueProgress16AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress17, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes16Progress17AndroidColorDeepSkyBlueProgress17AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress18, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes17Progress18AndroidColorDeepSkyBlueProgress18AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress2, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes1Progress2AndroidColorDeepSkyBlueProgress2AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress3, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes2Progress3AndroidColorDeepSkyBlueProgress3AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress4, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes3Progress4AndroidColorDeepSkyBlueProgress4AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress5, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes4Progress5AndroidColorDeepSkyBlueProgress5AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress6, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes5Progress6AndroidColorDeepSkyBlueProgress6AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress7, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes6Progress7AndroidColorDeepSkyBlueProgress7AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress8, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes7Progress8AndroidColorDeepSkyBlueProgress8AndroidColorBrownishGrey));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.progress9, androidx.databinding.adapters.Converters.convertColorToDrawable(isInTimes8Progress9AndroidColorDeepSkyBlueProgress9AndroidColorBrownishGrey));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reservations
        flag 1 (0x2L): nowPosition
        flag 2 (0x3L): isInTimes
        flag 3 (0x4L): null
        flag 4 (0x5L): isInTimes[9] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 5 (0x6L): isInTimes[9] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 6 (0x7L): isInTimes[8] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 7 (0x8L): isInTimes[8] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 8 (0x9L): isInTimes[13] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 9 (0xaL): isInTimes[13] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 10 (0xbL): isInTimes[12] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 11 (0xcL): isInTimes[12] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 12 (0xdL): isInTimes[0] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 13 (0xeL): isInTimes[0] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 14 (0xfL): isInTimes[5] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 15 (0x10L): isInTimes[5] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 16 (0x11L): isInTimes[2] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 17 (0x12L): isInTimes[2] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 18 (0x13L): isInTimes[14] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 19 (0x14L): isInTimes[14] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 20 (0x15L): isInTimes[7] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 21 (0x16L): isInTimes[7] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 22 (0x17L): isInTimes[11] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 23 (0x18L): isInTimes[11] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 24 (0x19L): isInTimes[17] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 25 (0x1aL): isInTimes[17] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 26 (0x1bL): isInTimes[16] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 27 (0x1cL): isInTimes[16] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 28 (0x1dL): isInTimes[1] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 29 (0x1eL): isInTimes[1] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 30 (0x1fL): isInTimes[4] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 31 (0x20L): isInTimes[4] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 32 (0x21L): isInTimes[10] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 33 (0x22L): isInTimes[10] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 34 (0x23L): isInTimes[15] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 35 (0x24L): isInTimes[15] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 36 (0x25L): isInTimes[3] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 37 (0x26L): isInTimes[3] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 38 (0x27L): isInTimes[6] ? @android:color/deep_sky_blue : @android:color/brownish_grey
        flag 39 (0x28L): isInTimes[6] ? @android:color/deep_sky_blue : @android:color/brownish_grey
    flag mapping end*/
    //end
}
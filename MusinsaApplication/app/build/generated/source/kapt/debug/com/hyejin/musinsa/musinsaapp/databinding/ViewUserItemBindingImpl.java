package com.hyejin.musinsa.musinsaapp.databinding;
import com.hyejin.musinsa.musinsaapp.R;
import com.hyejin.musinsa.musinsaapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewUserItemBindingImpl extends ViewUserItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewUserItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ViewUserItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.userFavoriteOff.setTag(null);
        this.userFavoriteOn.setTag(null);
        this.userImage.setTag(null);
        this.userName.setTag(null);
        this.userScore.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.user == variableId) {
            setUser((com.hyejin.musinsa.musinsaapp.domain.local.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.hyejin.musinsa.musinsaapp.domain.local.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
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
        com.hyejin.musinsa.musinsaapp.domain.local.model.User user = mUser;
        java.lang.String userScoreToString = null;
        java.lang.String userLogin = null;
        java.lang.Double UserScore1 = null;
        boolean userFav = false;
        java.lang.String userAvatarUrl = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.login
                    userLogin = user.getLogin();
                    // read user.score
                    UserScore1 = user.getScore();
                    // read user.fav
                    userFav = user.getFav();
                    // read user.avatar_url
                    userAvatarUrl = user.getAvatar_url();
                }


                if (UserScore1 != null) {
                    // read user.score.toString()
                    userScoreToString = UserScore1.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.hyejin.musinsa.musinsaapp.ui.search.users.UsersBindings.disableFav(this.userFavoriteOff, userFav);
            com.hyejin.musinsa.musinsaapp.ui.search.users.UsersBindings.activeFav(this.userFavoriteOn, userFav);
            com.hyejin.musinsa.musinsaapp.ui.search.users.UsersBindings.bindAvata(this.userImage, userAvatarUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userName, userLogin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.userScore, userScoreToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
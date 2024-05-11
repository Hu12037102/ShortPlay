package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityInviteFriendBindingImpl extends MainActivityInviteFriendBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nested_scroll_view, 1);
        sViewsWithIds.put(R.id.cl_invite, 2);
        sViewsWithIds.put(R.id.iv_money_one, 3);
        sViewsWithIds.put(R.id.tv_money_one, 4);
        sViewsWithIds.put(R.id.iv_money_second, 5);
        sViewsWithIds.put(R.id.tv_money_second, 6);
        sViewsWithIds.put(R.id.iv_money_three, 7);
        sViewsWithIds.put(R.id.tv_money_three, 8);
        sViewsWithIds.put(R.id.iv_invite_now, 9);
        sViewsWithIds.put(R.id.cl_invite_data, 10);
        sViewsWithIds.put(R.id.tv_invite_data, 11);
        sViewsWithIds.put(R.id.cl_total_reward, 12);
        sViewsWithIds.put(R.id.tv_total_reward_title, 13);
        sViewsWithIds.put(R.id.iv_bonus_icon, 14);
        sViewsWithIds.put(R.id.tv_bonus_content, 15);
        sViewsWithIds.put(R.id.cl_total_friend_num, 16);
        sViewsWithIds.put(R.id.tv_total_friend_num_title, 17);
        sViewsWithIds.put(R.id.tv_people_num, 18);
        sViewsWithIds.put(R.id.cl_invite_people_num, 19);
        sViewsWithIds.put(R.id.tv_time_title, 20);
        sViewsWithIds.put(R.id.tv_user_id_title, 21);
        sViewsWithIds.put(R.id.tv_bonus_title, 22);
        sViewsWithIds.put(R.id.rv_invite_people, 23);
        sViewsWithIds.put(R.id.cl_top_view, 24);
        sViewsWithIds.put(R.id.iv_closed, 25);
        sViewsWithIds.put(R.id.atv_rule, 26);
        sViewsWithIds.put(R.id.try_again_view, 27);
        sViewsWithIds.put(R.id.main_loading_iv, 28);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivityInviteFriendBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private MainActivityInviteFriendBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[25]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[28]
            , (androidx.core.widget.NestedScrollView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[27])
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[21]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tryAgainView.setContainingBinding(this);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
        if (tryAgainView.getBinding() != null) {
            executeBindingsOn(tryAgainView.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}
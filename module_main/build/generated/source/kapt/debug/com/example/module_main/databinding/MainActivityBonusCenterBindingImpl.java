package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityBonusCenterBindingImpl extends MainActivityBonusCenterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(22);
        sIncludes.setIncludes(0, 
            new String[] {"main_include_title"},
            new int[] {2},
            new int[] {com.example.module_main.R.layout.main_include_title});
        sIncludes.setIncludes(1, 
            new String[] {"main_view_stub_invite_now"},
            new int[] {3},
            new int[] {com.example.module_main.R.layout.main_view_stub_invite_now});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bonus_check_tv, 4);
        sViewsWithIds.put(R.id.check_iv, 5);
        sViewsWithIds.put(R.id.signed_in_tv, 6);
        sViewsWithIds.put(R.id.timeLineView_rl, 7);
        sViewsWithIds.put(R.id.timeLineView, 8);
        sViewsWithIds.put(R.id.check_tv, 9);
        sViewsWithIds.put(R.id.watch__tv, 10);
        sViewsWithIds.put(R.id.watch_iv, 11);
        sViewsWithIds.put(R.id.avaiable_tv, 12);
        sViewsWithIds.put(R.id.watch_rl, 13);
        sViewsWithIds.put(R.id.watch_money, 14);
        sViewsWithIds.put(R.id.watch_check_tv, 15);
        sViewsWithIds.put(R.id.invite_friend_tv, 16);
        sViewsWithIds.put(R.id.friend_iv, 17);
        sViewsWithIds.put(R.id.records_view, 18);
        sViewsWithIds.put(R.id.friend_list_view, 19);
        sViewsWithIds.put(R.id.try_again_view, 20);
        sViewsWithIds.put(R.id.main_loading_iv, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivityBonusCenterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private MainActivityBonusCenterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[12]
            , (com.example.module_main.databinding.MainIncludeTitleBinding) bindings[2]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (com.ruffian.library.widget.RTextView) bindings[9]
            , (android.widget.ImageView) bindings[17]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[19])
            , (com.example.module_main.databinding.MainViewStubInviteNowBinding) bindings[3]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[6]
            , (com.example.lib_common.view.TimeLineView) bindings[8]
            , (android.widget.RelativeLayout) bindings[7]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[20])
            , (com.ruffian.library.widget.RTextView) bindings[15]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.TextView) bindings[10]
            );
        setContainedBinding(this.bonusCenterInclude);
        this.bonusCenterLl.setTag(null);
        this.friendListView.setContainingBinding(this);
        setContainedBinding(this.friendView);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tryAgainView.setContainingBinding(this);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        bonusCenterInclude.invalidateAll();
        friendView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (bonusCenterInclude.hasPendingBindings()) {
            return true;
        }
        if (friendView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        bonusCenterInclude.setLifecycleOwner(lifecycleOwner);
        friendView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFriendView((com.example.module_main.databinding.MainViewStubInviteNowBinding) object, fieldId);
            case 1 :
                return onChangeBonusCenterInclude((com.example.module_main.databinding.MainIncludeTitleBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFriendView(com.example.module_main.databinding.MainViewStubInviteNowBinding FriendView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBonusCenterInclude(com.example.module_main.databinding.MainIncludeTitleBinding BonusCenterInclude, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        // batch finished
        executeBindingsOn(bonusCenterInclude);
        executeBindingsOn(friendView);
        if (friendListView.getBinding() != null) {
            executeBindingsOn(friendListView.getBinding());
        }
        if (tryAgainView.getBinding() != null) {
            executeBindingsOn(tryAgainView.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): friendView
        flag 1 (0x2L): bonusCenterInclude
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
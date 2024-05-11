package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityNewBonusCenterBindingImpl extends MainActivityNewBonusCenterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(27);
        sIncludes.setIncludes(1, 
            new String[] {"main_include_login"},
            new int[] {2},
            new int[] {com.example.module_main.R.layout.main_include_login});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cl_title_parent, 3);
        sViewsWithIds.put(R.id.iv_close, 4);
        sViewsWithIds.put(R.id.tv_bonus_center_title, 5);
        sViewsWithIds.put(R.id.iv_bonus_alpha, 6);
        sViewsWithIds.put(R.id.cl_wallet, 7);
        sViewsWithIds.put(R.id.atv_wallet_title, 8);
        sViewsWithIds.put(R.id.atv_coins_count, 9);
        sViewsWithIds.put(R.id.atv_bonus_count, 10);
        sViewsWithIds.put(R.id.cl_sign, 11);
        sViewsWithIds.put(R.id.tv_sign_content, 12);
        sViewsWithIds.put(R.id.iv_check, 13);
        sViewsWithIds.put(R.id.rv_sign, 14);
        sViewsWithIds.put(R.id.tv_check_in, 15);
        sViewsWithIds.put(R.id.iv_invite, 16);
        sViewsWithIds.put(R.id.tv_invite_title, 17);
        sViewsWithIds.put(R.id.iv_invite_bonus, 18);
        sViewsWithIds.put(R.id.tv_invite_money, 19);
        sViewsWithIds.put(R.id.cl_watch_ad, 20);
        sViewsWithIds.put(R.id.tv_watch_title, 21);
        sViewsWithIds.put(R.id.iv_watch, 22);
        sViewsWithIds.put(R.id.atv_not_ad_empty, 23);
        sViewsWithIds.put(R.id.rv_watch_ad, 24);
        sViewsWithIds.put(R.id.try_again_view, 25);
        sViewsWithIds.put(R.id.main_loading_iv, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivityNewBonusCenterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private MainActivityNewBonusCenterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (com.example.module_main.databinding.MainIncludeLoginBinding) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[26]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[25])
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[21]
            );
        this.clBonus.setTag(null);
        setContainedBinding(this.includeLogin);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tryAgainView.setContainingBinding(this);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        includeLogin.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeLogin.hasPendingBindings()) {
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
        includeLogin.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeLogin((com.example.module_main.databinding.MainIncludeLoginBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeLogin(com.example.module_main.databinding.MainIncludeLoginBinding IncludeLogin, int fieldId) {
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
        // batch finished
        executeBindingsOn(includeLogin);
        if (tryAgainView.getBinding() != null) {
            executeBindingsOn(tryAgainView.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeLogin
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
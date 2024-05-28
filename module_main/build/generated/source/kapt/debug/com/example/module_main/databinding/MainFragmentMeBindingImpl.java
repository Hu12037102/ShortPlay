package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainFragmentMeBindingImpl extends MainFragmentMeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(1, 
            new String[] {"main_include_wallet", "main_include_user_wallet"},
            new int[] {9, 10},
            new int[] {com.example.module_main.R.layout.main_include_wallet,
                com.example.module_main.R.layout.main_include_user_wallet});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.include_bonus_center, 2);
        sViewsWithIds.put(R.id.include_transaction, 3);
        sViewsWithIds.put(R.id.include_playback, 4);
        sViewsWithIds.put(R.id.include_feedback, 5);
        sViewsWithIds.put(R.id.include_faq, 6);
        sViewsWithIds.put(R.id.include_language, 7);
        sViewsWithIds.put(R.id.include_setting, 8);
        sViewsWithIds.put(R.id.user_information, 11);
        sViewsWithIds.put(R.id.head_iv, 12);
        sViewsWithIds.put(R.id.user_name, 13);
        sViewsWithIds.put(R.id.main_logo_iv, 14);
        sViewsWithIds.put(R.id.user_id, 15);
        sViewsWithIds.put(R.id.aiv_copy_text, 16);
        sViewsWithIds.put(R.id.bubble_content, 17);
        sViewsWithIds.put(R.id.sign_in_tv, 18);
        sViewsWithIds.put(R.id.rl_sub, 19);
        sViewsWithIds.put(R.id.proportion_discount_tv, 20);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainFragmentMeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private MainFragmentMeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (com.ruffian.library.widget.RImageView) bindings[12]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[7]
            , (com.example.module_main.databinding.MainIncludeWalletBinding) bindings[9]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[3]
            , (com.example.module_main.databinding.MainIncludeUserWalletBinding) bindings[10]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[20]
            , (android.widget.RelativeLayout) bindings[19]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (android.widget.TextView) bindings[15]
            , (com.ruffian.library.widget.RRelativeLayout) bindings[11]
            , (android.widget.TextView) bindings[13]
            );
        setContainedBinding(this.includeNewWallet);
        setContainedBinding(this.includeWallet);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        includeNewWallet.invalidateAll();
        includeWallet.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeNewWallet.hasPendingBindings()) {
            return true;
        }
        if (includeWallet.hasPendingBindings()) {
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
        includeNewWallet.setLifecycleOwner(lifecycleOwner);
        includeWallet.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeNewWallet((com.example.module_main.databinding.MainIncludeWalletBinding) object, fieldId);
            case 1 :
                return onChangeIncludeWallet((com.example.module_main.databinding.MainIncludeUserWalletBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeNewWallet(com.example.module_main.databinding.MainIncludeWalletBinding IncludeNewWallet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeWallet(com.example.module_main.databinding.MainIncludeUserWalletBinding IncludeWallet, int fieldId) {
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
        executeBindingsOn(includeNewWallet);
        executeBindingsOn(includeWallet);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeNewWallet
        flag 1 (0x2L): includeWallet
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
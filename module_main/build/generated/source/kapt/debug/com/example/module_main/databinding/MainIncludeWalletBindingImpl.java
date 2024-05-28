package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainIncludeWalletBindingImpl extends MainIncludeWalletBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"main_include_coins", "main_include_bonus"},
            new int[] {1, 2},
            new int[] {com.example.module_main.R.layout.main_include_coins,
                com.example.module_main.R.layout.main_include_bonus});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_detail, 3);
        sViewsWithIds.put(R.id.line1, 4);
        sViewsWithIds.put(R.id.top_up, 5);
    }
    // views
    @NonNull
    private final com.ruffian.library.widget.RRelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainIncludeWalletBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private MainIncludeWalletBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.example.module_main.databinding.MainIncludeBonusBinding) bindings[2]
            , (com.example.module_main.databinding.MainIncludeCoinsBinding) bindings[1]
            , (android.view.View) bindings[4]
            , (com.ruffian.library.widget.RTextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        setContainedBinding(this.includeWalletBonus);
        setContainedBinding(this.includeWalletCoins);
        this.mboundView0 = (com.ruffian.library.widget.RRelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        includeWalletCoins.invalidateAll();
        includeWalletBonus.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeWalletCoins.hasPendingBindings()) {
            return true;
        }
        if (includeWalletBonus.hasPendingBindings()) {
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
        includeWalletCoins.setLifecycleOwner(lifecycleOwner);
        includeWalletBonus.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeWalletCoins((com.example.module_main.databinding.MainIncludeCoinsBinding) object, fieldId);
            case 1 :
                return onChangeIncludeWalletBonus((com.example.module_main.databinding.MainIncludeBonusBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeWalletCoins(com.example.module_main.databinding.MainIncludeCoinsBinding IncludeWalletCoins, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeWalletBonus(com.example.module_main.databinding.MainIncludeBonusBinding IncludeWalletBonus, int fieldId) {
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
        executeBindingsOn(includeWalletCoins);
        executeBindingsOn(includeWalletBonus);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeWalletCoins
        flag 1 (0x2L): includeWalletBonus
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
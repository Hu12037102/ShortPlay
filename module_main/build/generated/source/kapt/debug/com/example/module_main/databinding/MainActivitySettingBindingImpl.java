package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivitySettingBindingImpl extends MainActivitySettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(0, 
            new String[] {"main_include_title"},
            new int[] {1},
            new int[] {com.example.module_main.R.layout.main_include_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.auto_rl, 2);
        sViewsWithIds.put(R.id.auto_tv, 3);
        sViewsWithIds.put(R.id.switch_iv, 4);
        sViewsWithIds.put(R.id.terms_rl, 5);
        sViewsWithIds.put(R.id.terms_tv, 6);
        sViewsWithIds.put(R.id.privacy_rl, 7);
        sViewsWithIds.put(R.id.privacy_tv, 8);
        sViewsWithIds.put(R.id.delete_account_rl, 9);
        sViewsWithIds.put(R.id.delete_account_tv, 10);
        sViewsWithIds.put(R.id.cache_rl, 11);
        sViewsWithIds.put(R.id.cache_tv, 12);
        sViewsWithIds.put(R.id.version_rl, 13);
        sViewsWithIds.put(R.id.version_tv, 14);
        sViewsWithIds.put(R.id.host_rl, 15);
        sViewsWithIds.put(R.id.host_tv, 16);
        sViewsWithIds.put(R.id.signOut_tv, 17);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivitySettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private MainActivitySettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (com.example.module_main.databinding.MainIncludeTitleBinding) bindings[1]
            , (com.ruffian.library.widget.RTextView) bindings[17]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.TextView) bindings[14]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.settingInclude);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        settingInclude.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (settingInclude.hasPendingBindings()) {
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
        settingInclude.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSettingInclude((com.example.module_main.databinding.MainIncludeTitleBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSettingInclude(com.example.module_main.databinding.MainIncludeTitleBinding SettingInclude, int fieldId) {
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
        executeBindingsOn(settingInclude);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): settingInclude
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
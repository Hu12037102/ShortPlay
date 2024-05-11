package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainFragmentHomeBindingImpl extends MainFragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"main_home_label", "main_include_flash", "main_include_watching"},
            new int[] {1, 2, 3},
            new int[] {com.example.module_main.R.layout.main_home_label,
                com.example.module_main.R.layout.main_include_flash,
                com.example.module_main.R.layout.main_include_watching});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.refresh_layout, 4);
        sViewsWithIds.put(R.id.home_rv, 5);
        sViewsWithIds.put(R.id.hand_iv, 6);
        sViewsWithIds.put(R.id.iv_onclick, 7);
        sViewsWithIds.put(R.id.main_loading_iv, 8);
        sViewsWithIds.put(R.id.no_network_view_stub, 9);
        sViewsWithIds.put(R.id.try_again_view, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainFragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private MainFragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.example.module_main.databinding.MainIncludeFlashBinding) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.example.module_main.databinding.MainHomeLabelBinding) bindings[1]
            , (com.example.module_main.databinding.MainIncludeWatchingBinding) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[9])
            , (com.scwang.smart.refresh.layout.SmartRefreshLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[0]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[10])
            );
        setContainedBinding(this.flashInclude);
        setContainedBinding(this.includeLabel);
        setContainedBinding(this.includeWatching);
        this.noNetworkViewStub.setContainingBinding(this);
        this.rlRoot.setTag(null);
        this.tryAgainView.setContainingBinding(this);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        includeLabel.invalidateAll();
        flashInclude.invalidateAll();
        includeWatching.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeLabel.hasPendingBindings()) {
            return true;
        }
        if (flashInclude.hasPendingBindings()) {
            return true;
        }
        if (includeWatching.hasPendingBindings()) {
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
        includeLabel.setLifecycleOwner(lifecycleOwner);
        flashInclude.setLifecycleOwner(lifecycleOwner);
        includeWatching.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeWatching((com.example.module_main.databinding.MainIncludeWatchingBinding) object, fieldId);
            case 1 :
                return onChangeFlashInclude((com.example.module_main.databinding.MainIncludeFlashBinding) object, fieldId);
            case 2 :
                return onChangeIncludeLabel((com.example.module_main.databinding.MainHomeLabelBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeWatching(com.example.module_main.databinding.MainIncludeWatchingBinding IncludeWatching, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFlashInclude(com.example.module_main.databinding.MainIncludeFlashBinding FlashInclude, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeLabel(com.example.module_main.databinding.MainHomeLabelBinding IncludeLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        executeBindingsOn(includeLabel);
        executeBindingsOn(flashInclude);
        executeBindingsOn(includeWatching);
        if (noNetworkViewStub.getBinding() != null) {
            executeBindingsOn(noNetworkViewStub.getBinding());
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
        flag 0 (0x1L): includeWatching
        flag 1 (0x2L): flashInclude
        flag 2 (0x3L): includeLabel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
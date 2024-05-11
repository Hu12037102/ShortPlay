package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainPlayHistoryBindingImpl extends MainPlayHistoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"main_include_title"},
            new int[] {1},
            new int[] {com.example.module_main.R.layout.main_include_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.playback_srl, 2);
        sViewsWithIds.put(R.id.playback_rv, 3);
        sViewsWithIds.put(R.id.main_loading_iv, 4);
        sViewsWithIds.put(R.id.history_view_stub, 5);
        sViewsWithIds.put(R.id.try_again_view, 6);
        sViewsWithIds.put(R.id.my_list_view_stub, 7);
        sViewsWithIds.put(R.id.delete_rl, 8);
        sViewsWithIds.put(R.id.delete_iv, 9);
        sViewsWithIds.put(R.id.delete_tv, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainPlayHistoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private MainPlayHistoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[9]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.TextView) bindings[10]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[5])
            , (android.widget.ImageView) bindings[4]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[7])
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[2]
            , (com.example.module_main.databinding.MainIncludeTitleBinding) bindings[1]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[6])
            );
        this.historyViewStub.setContainingBinding(this);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.myListViewStub.setContainingBinding(this);
        setContainedBinding(this.topInclude);
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
        topInclude.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (topInclude.hasPendingBindings()) {
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
        topInclude.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTopInclude((com.example.module_main.databinding.MainIncludeTitleBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTopInclude(com.example.module_main.databinding.MainIncludeTitleBinding TopInclude, int fieldId) {
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
        executeBindingsOn(topInclude);
        if (historyViewStub.getBinding() != null) {
            executeBindingsOn(historyViewStub.getBinding());
        }
        if (myListViewStub.getBinding() != null) {
            executeBindingsOn(myListViewStub.getBinding());
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
        flag 0 (0x1L): topInclude
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
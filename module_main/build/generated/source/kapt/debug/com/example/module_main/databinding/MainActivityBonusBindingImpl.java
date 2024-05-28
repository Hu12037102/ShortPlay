package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityBonusBindingImpl extends MainActivityBonusBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(0, 
            new String[] {"main_include_title"},
            new int[] {1},
            new int[] {com.example.module_main.R.layout.main_include_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_content, 2);
        sViewsWithIds.put(R.id.bonus_rg, 3);
        sViewsWithIds.put(R.id.all_rb, 4);
        sViewsWithIds.put(R.id.recharge_rb, 5);
        sViewsWithIds.put(R.id.bonus_rb, 6);
        sViewsWithIds.put(R.id.unlock_rb, 7);
        sViewsWithIds.put(R.id.bonus_rv, 8);
        sViewsWithIds.put(R.id.history_view_stub, 9);
        sViewsWithIds.put(R.id.try_again_view, 10);
        sViewsWithIds.put(R.id.main_loading_iv, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivityBonusBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private MainActivityBonusBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.ruffian.library.widget.RRadioButton) bindings[4]
            , (com.example.module_main.databinding.MainIncludeTitleBinding) bindings[1]
            , (com.ruffian.library.widget.RRadioButton) bindings[6]
            , (android.widget.RadioGroup) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[9])
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[11]
            , (com.ruffian.library.widget.RRadioButton) bindings[5]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[10])
            , (com.ruffian.library.widget.RRadioButton) bindings[7]
            );
        setContainedBinding(this.bonusHisInclude);
        this.historyViewStub.setContainingBinding(this);
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
                mDirtyFlags = 0x2L;
        }
        bonusHisInclude.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (bonusHisInclude.hasPendingBindings()) {
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
        bonusHisInclude.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBonusHisInclude((com.example.module_main.databinding.MainIncludeTitleBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBonusHisInclude(com.example.module_main.databinding.MainIncludeTitleBinding BonusHisInclude, int fieldId) {
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
        executeBindingsOn(bonusHisInclude);
        if (historyViewStub.getBinding() != null) {
            executeBindingsOn(historyViewStub.getBinding());
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
        flag 0 (0x1L): bonusHisInclude
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
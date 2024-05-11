package com.example.module_main.databinding;
import com.example.module_main.R;
import com.example.module_main.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityStoreBindingImpl extends MainActivityStoreBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(0, 
            new String[] {"main_include_title"},
            new int[] {2},
            new int[] {com.example.module_main.R.layout.main_include_title});
        sIncludes.setIncludes(1, 
            new String[] {"main_include_coins", "main_include_bonus"},
            new int[] {3, 4},
            new int[] {com.example.module_main.R.layout.main_include_coins,
                com.example.module_main.R.layout.main_include_bonus});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.walletView_ll, 5);
        sViewsWithIds.put(R.id.rl_sub, 6);
        sViewsWithIds.put(R.id.tv_restore, 7);
        sViewsWithIds.put(R.id.home_banner, 8);
        sViewsWithIds.put(R.id.episode_rr, 9);
        sViewsWithIds.put(R.id.recharge_discount_flag, 10);
        sViewsWithIds.put(R.id.episode_iv, 11);
        sViewsWithIds.put(R.id.recharge_episode_num, 12);
        sViewsWithIds.put(R.id.recharge_episode_original, 13);
        sViewsWithIds.put(R.id.recharge_episode_coins, 14);
        sViewsWithIds.put(R.id.discounted_price_show, 15);
        sViewsWithIds.put(R.id.episode_type_rv, 16);
        sViewsWithIds.put(R.id.tv_rules, 17);
        sViewsWithIds.put(R.id.tv_sub, 18);
        sViewsWithIds.put(R.id.try_again_view, 19);
        sViewsWithIds.put(R.id.main_loading_iv, 20);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivityStoreBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private MainActivityStoreBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.ruffian.library.widget.RTextView) bindings[15]
            , (android.widget.ImageView) bindings[11]
            , (com.ruffian.library.widget.RRelativeLayout) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.example.module_main.databinding.MainIncludeBonusBinding) bindings[4]
            , (com.example.module_main.databinding.MainIncludeCoinsBinding) bindings[3]
            , (android.widget.ImageView) bindings[20]
            , (com.ruffian.library.widget.RTextView) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.RelativeLayout) bindings[6]
            , (com.example.module_main.databinding.MainIncludeTitleBinding) bindings[2]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[19])
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.LinearLayout) bindings[5]
            );
        setContainedBinding(this.includeStoreBonus);
        setContainedBinding(this.includeStoreCoins);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.topIncludeWallet);
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
        topIncludeWallet.invalidateAll();
        includeStoreCoins.invalidateAll();
        includeStoreBonus.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (topIncludeWallet.hasPendingBindings()) {
            return true;
        }
        if (includeStoreCoins.hasPendingBindings()) {
            return true;
        }
        if (includeStoreBonus.hasPendingBindings()) {
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
        topIncludeWallet.setLifecycleOwner(lifecycleOwner);
        includeStoreCoins.setLifecycleOwner(lifecycleOwner);
        includeStoreBonus.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTopIncludeWallet((com.example.module_main.databinding.MainIncludeTitleBinding) object, fieldId);
            case 1 :
                return onChangeIncludeStoreCoins((com.example.module_main.databinding.MainIncludeCoinsBinding) object, fieldId);
            case 2 :
                return onChangeIncludeStoreBonus((com.example.module_main.databinding.MainIncludeBonusBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTopIncludeWallet(com.example.module_main.databinding.MainIncludeTitleBinding TopIncludeWallet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeStoreCoins(com.example.module_main.databinding.MainIncludeCoinsBinding IncludeStoreCoins, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeStoreBonus(com.example.module_main.databinding.MainIncludeBonusBinding IncludeStoreBonus, int fieldId) {
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
        executeBindingsOn(topIncludeWallet);
        executeBindingsOn(includeStoreCoins);
        executeBindingsOn(includeStoreBonus);
        if (tryAgainView.getBinding() != null) {
            executeBindingsOn(tryAgainView.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): topIncludeWallet
        flag 1 (0x2L): includeStoreCoins
        flag 2 (0x3L): includeStoreBonus
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
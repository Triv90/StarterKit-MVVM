package com.vechkanov.drive64.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import com.vechkanov.drive64.ViewModelFactory
import com.vechkanov.drive64.ui.core.BaseActivity
import javax.inject.Inject


class MainActivity: BaseActivity<MainActivityViewModel>() {
    private var mMainViewModel: MainActivityViewModel? = null

    @Inject
    lateinit var factory: ViewModelFactory

    override fun getViewModel(): MainActivityViewModel {
        mMainViewModel = ViewModelProviders.of(this, factory)[MainActivityViewModel::class.java]
        return mMainViewModel!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
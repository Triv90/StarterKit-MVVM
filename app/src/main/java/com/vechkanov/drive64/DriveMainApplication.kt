package com.vechkanov.drive64

import com.vechkanov.drive64.dagger.core.DaggerDriveMainComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DriveMainApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerDriveMainComponent.builder().create(this)
    }
}

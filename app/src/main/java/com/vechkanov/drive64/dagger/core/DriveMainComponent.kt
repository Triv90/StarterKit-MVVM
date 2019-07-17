package com.vechkanov.drive64.dagger.core

import com.vechkanov.drive64.DriveMainApplication
import com.vechkanov.drive64.dagger.viewModel.ViewModelModule
import javax.inject.Singleton

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    DriveAppModule::class,
    ActivityBuilder::class,
    ViewModelModule::class])
interface DriveMainComponent : AndroidInjector<DriveMainApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DriveMainApplication>()
}
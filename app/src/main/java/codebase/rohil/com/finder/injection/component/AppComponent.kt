package codebase.rohil.com.finder.injection.component

import codebase.rohil.com.finder.BaseApplication
import codebase.rohil.com.finder.injection.module.ActivityBindingModule
import codebase.rohil.com.finder.injection.module.AppModule
import codebase.rohil.com.finder.injection.module.NetworkModule
import codebase.rohil.com.finder.injection.module.ViewModelFactoryModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, ViewModelFactoryModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class,
    NetworkModule::class))
interface AppComponent : AndroidInjector<BaseApplication> {

  @Component.Builder abstract class Builder : AndroidInjector.Builder<BaseApplication>()
}

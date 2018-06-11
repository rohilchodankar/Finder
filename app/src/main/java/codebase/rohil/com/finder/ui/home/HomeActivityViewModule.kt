package codebase.rohil.com.finder.ui.home

import android.content.Context
import codebase.rohil.com.finder.injection.module.BaseActivityModule
import codebase.rohil.com.finder.injection.qualifiers.ActivityContext
import codebase.rohil.com.finder.injection.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.android.support.DaggerAppCompatActivity

@Module(includes = arrayOf(BaseActivityModule::class))
abstract class HomeActivityViewModule {

  @Binds
  @ActivityContext abstract fun provideActivityContext(activity: HomeActivity): Context

  @Binds
  @ActivityScope
  abstract fun provideActivity(homeActivity: HomeActivity): DaggerAppCompatActivity
}



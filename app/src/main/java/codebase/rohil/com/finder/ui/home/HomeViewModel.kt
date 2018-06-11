package codebase.rohil.com.finder.ui.home

import codebase.rohil.com.finder.data.services.WeatherService
import codebase.rohil.com.finder.injection.scope.ActivityScope
import codebase.rohil.com.finder.ui.base.BaseViewModel
import codebase.rohil.com.finder.utils.IRxSchedulers
import codebase.rohil.com.finder.utils.LocationUtils
import javax.inject.Inject


@ActivityScope
class HomeViewModel @Inject constructor() : BaseViewModel() {

  @Inject lateinit var service: WeatherService
  @Inject lateinit var schedulers: IRxSchedulers
  @Inject
  lateinit var locationUtil : LocationUtils


  fun loadData() {

  }
}
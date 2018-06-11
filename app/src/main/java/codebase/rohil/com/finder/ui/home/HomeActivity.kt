package codebase.rohil.com.finder.ui.home

import android.os.Bundle
import codebase.rohil.com.finder.R
import codebase.rohil.com.finder.databinding.ActivityHomeBinding
import codebase.rohil.com.finder.ui.base.BaseActivity



class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {


  override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

  override fun layoutId(): Int {
    return R.layout.activity_home
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

  }

}

package com.rideclub.ui.dashboard

import android.os.Bundle
import com.rideclub.databinding.ActivityDashboardBinding
import com.rideclub.extension.viewBinding
import com.rideclub.ui.base.BaseAppCompatActivity
import com.rideclub.vm.dashboard.DashboardVM
import org.koin.androidx.viewmodel.ext.android.viewModel


class DashboardActivity : BaseAppCompatActivity() {
    private val binding by viewBinding(ActivityDashboardBinding::inflate)
    private val dashboardVM by viewModel<DashboardVM>()

    override fun layout() = binding.root

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
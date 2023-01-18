package com.valencio.tracke.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.valencio.tracke.repositories.MainRepository
import javax.inject.Inject

class StatisticsViewModel @ViewModelInject constructor(
    mainRepository: MainRepository
) : ViewModel() {

    var totalDistance = mainRepository.getTotalDistance()
    var totalTimeInMillis = mainRepository.getTotalTimeInMillis()
    var totalAvgSpeed = mainRepository.getTotalAvgSpeed()
    var totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()

    var runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}
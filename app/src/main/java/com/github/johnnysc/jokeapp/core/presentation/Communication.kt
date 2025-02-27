package com.github.johnnysc.jokeapp.core.presentation

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.github.johnnysc.jokeapp.presentation.CommonUiModel
import com.github.johnnysc.jokeapp.presentation.State

/**
 * @author Asatryan on 19.06.2021
 **/
interface Communication {
    fun showState(state: State)
    fun observe(owner: LifecycleOwner, observer: Observer<State>)
    fun isState(type: Int): Boolean
}

interface ListCommunication {
    fun showDataList(list: List<CommonUiModel>)
    fun observeList(owner: LifecycleOwner, observer: Observer<List<CommonUiModel>>)
}

interface CommonCommunication : Communication, ListCommunication
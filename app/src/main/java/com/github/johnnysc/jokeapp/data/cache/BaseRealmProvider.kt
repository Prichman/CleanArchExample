package com.github.johnnysc.jokeapp.data.cache

import com.github.johnnysc.jokeapp.core.data.cache.RealmProvider
import io.realm.Realm

/**
 * @author Asatryan on 19.06.2021
 **/
class BaseRealmProvider : RealmProvider {
    override fun provide(): Realm = Realm.getDefaultInstance()
}
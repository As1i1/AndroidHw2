package ru.dubinin.application.view

import kotlinx.coroutines.Deferred

data class DeferredHolder<T>(var deferred: Deferred<T>)
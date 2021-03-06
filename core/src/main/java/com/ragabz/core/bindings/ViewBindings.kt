package com.ragabz.views.binding

import android.view.View
import android.view.View.*
import androidx.databinding.BindingAdapter

@set:BindingAdapter("visible")
var View.visible
    get() = visibility == VISIBLE
    set(value) {
        visibility = if (value) VISIBLE else GONE
    }

@set:BindingAdapter("invisible")
var View.invisible
    get() = visibility == INVISIBLE
    set(value) {
        visibility = if (value) INVISIBLE else VISIBLE
    }

@set:BindingAdapter("gone")
var View.gone
    get() = visibility == GONE
    set(value) {
        visibility = if (value) GONE else VISIBLE
    }
